public class jaggedArray {
    public static void main(String[] args) {
        
        int arr[][]=new int[3][]; //explicitly mention no. of rows for each

        arr[0]=new int[3]; //1st row have 3 elements
        arr[1]=new int[2];  //2nd row have 2 elements and so on
        arr[2]=new int[5];

        

        for(int a[] : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
