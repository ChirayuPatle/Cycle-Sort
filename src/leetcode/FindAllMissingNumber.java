package leetcode;
import java.util.*;

public class FindAllMissingNumber{
    public static void main(String[] args) {
//        int[] arr = {4,3,2,7,8,2,3,1};
//        int result = findDisappearedNumbers(arr);
//        System.out.println(Arrays.toString(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index< nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index +1);
            }
        }

        return ans;
    }

    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =temp;
    }
}
