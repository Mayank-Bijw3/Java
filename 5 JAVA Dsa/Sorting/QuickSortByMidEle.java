import java.util.Arrays;

public class QuickSortByMidEle {
    public static void main(String[] args) {
         int arr[]={5,10,7,2,3,4,9,8,1,6};

        quickSort(arr,0,arr.length-1);

        
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int start =low;
        int end=high;
        //he just taking pivot as mid
        int mid = start+(end-start)/2;
        int pivot=arr[mid];

        //we can also create a function for placing pivot at correct index but sod

        while(start<=end){

            //also a reason if its already sorted then it will not sawp

            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        //now my pivot is at correct index please sort the remaining part (2 halves)
        //i.e low -> end  and start -> high

        quickSort(arr,low,end); //end is at pivot-1 index
        quickSort(arr,start,high); // start is at pivot+1 index
    }


    public static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
