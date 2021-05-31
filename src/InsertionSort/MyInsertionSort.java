/*Algorithm:-
step1-Consider 1st element sorted declare and initialize sortedIndex,and declare unsorted index
step2-Iterate over the array from unsorted index to less than array length and perform the following steps.
step3-select the next available element and name it next element
step4-Iterate over the collection fom unsorted index to greater then 0 and perform the following steps
step5-compare jth element with j-1 element , if j element is smaller than j-1 element swap them otherwise break the loop of step 4.
 */


package InsertionSort;

import SelectionSort.MySelectionSort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        // array to be tested
        int[] arr={12,8,16,5,2};
        System.out.println("unsorted-->"+ Arrays.toString(arr));
        // creating the object of the class
        MyInsertionSort obj=new MyInsertionSort();
        //calling the function
        obj.InsertionSort(arr);
        System.out.println("sorted---->"+Arrays.toString(arr));
    }
    public void InsertionSort(int []arr){
        //step1
        int sortedIndex=0;
        int unsortedIndex;
        //step2
        for (unsortedIndex= 1; unsortedIndex<arr.length ; unsortedIndex++) {
            //step3
            int nextElement=arr[unsortedIndex];
            //step4
            for (int j=unsortedIndex;j>0;j--){
                //step5-compare
                if (arr[j]<arr[j-1]){
                    //swap them
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }

    }
}
