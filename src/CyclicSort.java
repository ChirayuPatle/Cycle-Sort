import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1};
        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
       // create pointer
        int i =0;

        while(i < arr.length){
            int correct = arr[i] - 1; // Position of element (range: 1 to n)
            if(arr[i] != arr[correct]){
                // swap elements when element is not at correct index
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] =temp;
            }
            else{
                // traverse for other element
                i++;
            }
        }
    }
}
