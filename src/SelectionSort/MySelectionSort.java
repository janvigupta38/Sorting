/*Q-What we have to do?
Ans-You have to select an element and place it on it's sorted position.
Q-Which element to be Selected? Ans-Element having Maximum Value/Minimum
Q-What is right sorted position? Ans-Maximum value-Last Index/ Minimum value=0 Index
Algorithm:-
step1-define variable and assign them
step2-iterate over the array n times and perform following steps
step3-find maximum element-Compare the element an assign the maximum value to maximumElement
step4-swap the element at sortedIndex and maximumElementIndex.

 */



package SelectionSort;
import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        // array to be tested
        int[] arr={12,8,16,5,2};
        System.out.println("unsorted-->"+ Arrays.toString(arr));
        // creating the object of the class
        MySelectionSort obj=new MySelectionSort();
        //calling the function
        obj.SelectionSort(arr);
        System.out.println("sorted---->"+Arrays.toString(arr));
    }
    public void SelectionSort(int [] arr){
        //step 1
        int sortedIndex=arr.length;
        int maximumElement;
        int maximumElementIndex;
        //step 2
        for (int i = 0; i <arr.length ; i++) {
            //step 3 find maximum element
            maximumElement=arr[0];
            maximumElementIndex=0;
            // the loop is till the sortedIndex because we have to iterate till place our array in not sorted.
            for (int j = 0; j <sortedIndex ; j++) {
                if (maximumElement<arr[j]){
                    maximumElement=arr[j];
                    maximumElementIndex=j;
                }

            }
            //tells which is the maximum element in each iteration
            System.out.println("maximumElement="+maximumElement);
            //step 4 swap
            sortedIndex--;
            int temp=arr[maximumElementIndex];
            arr[maximumElementIndex]=arr[sortedIndex];
            arr[sortedIndex]=temp;

        }

    }
}
