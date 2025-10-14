

public class Search2Binery {
    public static void main(String[] args) {
        
        int arr[]={2,3,5,6,9};
        int target=9;

        int result = binerySearch(0,arr.length,arr,target);
        System.out.println(result+1);
    }

    public static int binerySearch(int s,int e,int arr[],int target){

        while(e>=s){
        int mid=(s+e)/2;

        if(arr[mid]==target)
            return mid;
        else if (arr[mid]<target) {
            return binerySearch(mid+1,e,arr, target);
            
        }
        else
            return binerySearch(s, mid-1, arr, target);
        }
        return -1;
    }
}
