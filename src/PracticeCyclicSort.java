import java.util.*;

public class PracticeCyclicSort {
    public static void main(String[] args) {
        int[] arr=  {0,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int index = nums[i]; // for range : 1 - N
            if(nums[i] != nums[index]){
                // swap (always true and condition monitors repitation of elements)
                swap(nums, i, index);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp =  nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
