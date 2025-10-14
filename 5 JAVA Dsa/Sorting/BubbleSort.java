
public class BubbleSort{
    public static void main(String[] args) {
        
        int arr[]={5,10,7,2,3,4,9,8,1,6};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                    
            }

        }
        for(int k:arr){
            System.out.print(k+" ");
        }

    }    
}
