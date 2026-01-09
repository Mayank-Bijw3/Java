import java.util.Arrays;

class CyclicSort{
    public static void main(String[] args) {
        int[] arr ={3,5,2,1,4};
        cSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cSort(int[] arr){
        
        int i=0;
        
        while(i<arr.length){
            int pos = arr[i] - 1;
            if(arr[pos]!=arr[i]){
                swap(arr,pos,i);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int pos,int i){
        int temp=arr[i];
        arr[i]=arr[pos];
        arr[pos]=temp;
    }
}