public class Search1Linear {

    public static void main(String[] args) {
        
        int arr[]={3,5,7,9,11};

        int target = 9;

        int result = LinearSearch(arr,target);
        System.out.println(result+1);
    }

    public static int LinearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}