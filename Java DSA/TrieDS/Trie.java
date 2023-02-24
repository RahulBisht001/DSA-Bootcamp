public class Trie {
    static class Node {
        Node[] children;
        /*
         * total 26 with english alphabets
         * the case where a to z are allowed
         * array can be changes accordingly // 256
         */
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; ++i)
                children[i] = null;
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void main(String[] args) {

        String str = "kxiksxjecwmkwabhsl";
        for (int i = 0; i < str.length(); ++i)
            // Insert all these suffix in the Trie
            insert(str.substring(i));

        // Count the Number of Nodes in the Trie
        System.out.println(countTrieNode(root));
        // String[] words = { "the", "a", "there", "their", "any" };
        // String[] words = { "lrbbmqb", "cd", "r", "owkk" };
        // for (int i = 0; i < words.length; ++i) {
        // insert(words[i]);
        // }
        // System.out.println(wordBreak("lrbbmqbabowkkab"));
        // System.out.println(search("there"));
        // System.out.println(search("an"));
        // System.out.println(search("he"));
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0)
            return true;

        for (int i = 1; i <= key.length(); ++i) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if (search(firstPart) && wordBreak(secondPart))
                return true;
        }
        return false;
    }

    public static void insert(String word) {
        // Insert in a Trie
        /*
         * // Time Complexity = O(L)
         * Case 1 :
         * IF ch does not exist in the next node
         * Create a Node
         * Case 2:
         * else Create Nothing
         * 
         * when word end ->
         * endOfWord = true
         */
        Node curr = root;
        for (int i = 0; i < word.length(); ++i) {

            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                // add a new Node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1)
                curr.children[idx].endOfWord = true;

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {

        Node curr = root;
        for (int i = 0; i < key.length(); ++i) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            if (i == key.length() - 1 && curr.children[idx].endOfWord == false)
                return false;
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countTrieNode(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        for (int i = 0; i < 26; ++i) {
            if (root.children[i] != null)
                count += countTrieNode(root.children[i]);
        }
        return count + 1;
    }
}
