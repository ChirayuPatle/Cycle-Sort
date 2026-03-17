package leetcode;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,2};
        MissingNumber obj = new MissingNumber();
        obj.missingNumber(arr);
        System.out.println(obj);
    }
    public int missingNumber(int[] nums) {
        // create pointer
            int i =0;

            while(i < nums.length){
                int correct = nums[i];
                if(nums[i] < nums.length && nums[i] != nums[correct]){
                    // swap for other element
                    swap(nums, i, correct);
                }
                else{
                    i++;
                }
            }
            for(int index = 0; index< nums.length; index++){
                if(nums[index] != index){
                    return index;
                }
            }

            // case check
        return nums.length;
    }

    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =temp;
    }
}