package MergeSort;

import QuickSort.MyQuickSort;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 8, 16, 5, 2};
        int low = 0;
        int high = arr.length - 1;
        System.out.println("unsorted-->" + Arrays.toString(arr));
        // creating the object of the class
        MyMergeSort obj = new MyMergeSort();
        //calling the function
        obj.MergeSort(arr, low, high);
        System.out.println("sorted---->" + Arrays.toString(arr));
    }
    public void MergeSort(int[]arr,int low, int high){
        //step1-invalid arr
        if (low>=high){
            return;
        }
        //step2-finding the mid of array,to divide array into two parts
        int mid=(low+high)/2;
        //step3-processing on left sub part
        MergeSort(arr, low,mid);
        //step4-processing on right sub part
        MergeSort(arr,mid+1,high);
        //step5-merging the sub parts in sorted order
        merge(arr,low,mid,high);
    }
    public int[] merge(int [] arr, int low, int mid,int high){
        //creating a new array
        int []crr=new int[high+1];
        //step2-declaring and initializing variables for processing partitions
        int  i=low; //left partition
        int j=mid+1; //right partition
        int k=0;//index of crr
        //step3-//inserting one of the partition in crr
        if(i<=mid && j<=high){
            while (i<=mid && j<=high){ //the smaller will enter crr
                if (arr[i]<=arr[j]){
                    crr[k]=arr[i];
                    k=k+1;
                    i=i+1;
                }
                else{
                    crr[k]=arr[j];
                    k=k+1;
                    j=j+1;
                }
            }
        }
        //after 3rd step one of the partition in filled in crr
        //step4-
        if (i>mid){
            //i-completely exhausted
            //process j
            while (j<=high){
                crr[k]=arr[j];
                k=k+1;
                j=j+1;
            }
        }
        else{
            //j-completely exhausted
            //process i
            while (i<=mid){
                crr[k]=arr[i];
                k=k+1;
                i=i+1;
            }
        }
        //after 4th step crr has the sorted arr.
        //step5-
        //copying crr into arr
        int p=0;//index for crr
        for (int l =low; l <=high ; l++) {
            arr[l]=crr[p];
            p++;
        }
        //returning arr to MergeSort.
        return arr;
    }
}
