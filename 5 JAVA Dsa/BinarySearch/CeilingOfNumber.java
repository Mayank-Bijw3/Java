public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {1,5,7,9,11,14,16,17,18,22};
        int target = 15;

        int index =ceilingOfNoBS(arr,target);
        System.out.println(index);
    }

    public static int ceilingOfNoBS(int[] arr , int target){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if (target<arr[mid])
                end=mid-1;

            else
                start=mid+1;
        }
        return start;  // this because when loop terminate i.e. start < end so start automatically comes to end+1
    }//for lower Ceiling return end; thats it
}