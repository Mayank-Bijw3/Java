import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if(end-start==1){
            return ;
        }

        int mid = start+(end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr,start,mid,end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
    int i=start,j=mid,k=0;

        int[] ans = new int[end-start];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
            }
        }

        while(i<mid){
            ans[k++]=arr[i++];

        }
        while (j<end) {
            ans[k++]=arr[j++];
        }

        for(int z=0;z<ans.length;z++){
            arr[start+z] = ans[z];
        }
    }
    
}
