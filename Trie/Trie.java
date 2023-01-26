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

        String[] words = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; ++i) {
            insert(words[i]);
        }
        System.out.println(search("there"));
        System.out.println(search("an"));
        System.out.println(search("he"));
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
}
