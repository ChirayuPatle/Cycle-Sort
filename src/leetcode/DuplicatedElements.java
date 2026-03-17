package leetcode;

import java.util.Arrays;

public class DuplicatedElements {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int res = sort(arr);
        System.out.println(res);
    }

    static int sort(int[] nums){
        int i =0;

        while(i < nums.length){
            if(nums[i] != (i+1)){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] =temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
        }
    }
