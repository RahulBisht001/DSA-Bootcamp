import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_Subset {
    public static void main(String[] args) {

        // Code
        int[] nums = { 1, 2, 3, 4 };
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        System.out.println(list.toString());

    }

    public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
