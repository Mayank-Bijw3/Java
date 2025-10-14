
public class SelectionSort {
    public static void main(String[] args) {
         int arr[]={5,10,7,2,3,4,9,8,1,6};
        int size=arr.length;
         for(int i=0;i<size-1;i++){
            int minIndex=i;
            for(int j=i+1;j<size;j++){
                
                if(arr[j]<arr[minIndex])
                    minIndex=j;
                
                
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
         

         for(int k:arr){
            System.out.print(k+" ");
         }
    }
}
