/*Algorithm-quickSort(array,lower,upper)
step1-if any time lower than greater than upper than return
step2-pivotIndex is equal to partition(array,lower,upper)
step3-sort the left partition using quicksort
step4-sort the right partition using quicksort
------------------------------------------------------------------------------------------------------------------------
Algorithm of partition:-
step1-select the pivot value{i.e. 1st element}
step2-declare & initialize down index with lower.
step3-declare & initialize up index with upper.
step4-repeat until down < up and perform following steps-
step4a-repeat down=down-1 until down <=upper & arr[down]<=pivot
step4b-repeat up=up+1 until up >=lower & arr[up]>pivot
stp4c-if down <up swap arr[down] with arr[up]
step5-place the pivot at it's right sorted place and it is denoted by up index{swap arr[lower] with arr[up]}
step6-return index or pivot value

 */

package QuickSort;
import java.util.Arrays;
import java.util.Queue;

public class MyQuickSort {
    public static void main(String[] args) {
        // array to be tested
        int[] arr={12,8,16,5,2};
        int lower=0;
        int upper=arr.length-1;
        System.out.println("unsorted-->"+ Arrays.toString(arr));
        // creating the object of the class
        MyQuickSort obj=new MyQuickSort();
        //calling the function
        obj.QuickSort(arr,lower,upper);
        System.out.println("sorted---->"+Arrays.toString(arr));
    }
    public void  QuickSort(int[] arr,int lower,int upper){
        //step1
        if(lower>=upper){
            return;
        }
        //step2
        int pivotIndex=partition(arr,lower,upper);
        //step3
        QuickSort(arr,lower,pivotIndex-1);
        //step4
        QuickSort(arr,pivotIndex+1,upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        //step1-
        int pivot =arr[lower];
        //step2-
        int down=lower;
        //step4-
        int up=upper;
        //step4
        while (down<up){
            //step 4a-
            while (down<=upper && arr[down]<=pivot ){
                down=down+1;
            }
            //step 4b-
            while (up>=lower && arr[up]>pivot){
                up=upper-1;
            }
            //step 4C-
            if (down<up){
                int temp=arr[down];
                arr[down]=arr[up];
                arr[up]=temp;
            }
        }
        //step5
        arr[lower]=arr[up];
        arr[up]=pivot;
        //step 6
        return up;
    }
}

