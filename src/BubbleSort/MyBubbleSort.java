/*Q-What to do?
Ans-
step 1-Compare each pair of adjacent elements in an array
step 2-Swap to Elements if Necessary
step 3-Repeat till all elements are sorted .
**Each iteration in this is called a pass.
**Each pass first compare and then swap the elements if needed.
 */

package BubbleSort;
import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        // array to be tested
        int[] arr={12,8,16,5,2};
        System.out.println("unsorted-->"+ Arrays.toString(arr));
        // creating the object of the class
        MyBubbleSort obj=new MyBubbleSort();
        //calling the function
        obj.bubbleSort(arr);
        System.out.println("Sorted--->"+ Arrays.toString(arr));
    }

    public  void bubbleSort(int []arr){
        //step1- Selecting the elements
        for(int i=0;i<arr.length-1;i++){
            //step2- Pass
            for (int j = 0; j <arr.length-1-i ; j++) {
                //tells u which element are swapping.
                System.out.println("Swap "+i+" wth "+(j+1));
                //step3- comparision
                if(arr[i]>arr[j+1]){
                    //step4-swap
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
                else{
                    // tells that there is no need of swapping.
                    System.out.println("No swap");
                }
                System.out.println(Arrays.toString(arr));
            }

        }
    }


}
