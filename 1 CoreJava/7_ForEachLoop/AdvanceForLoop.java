class AdvanceForLoop{
    public static void main(String args[]){
        int arr[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int) (Math.random() *100);
            }
        }

        for(int n[]:arr){ //it takes 1st row i.e 1st array
            for(int k:n){ //it takes 1 by 1 all elements of n[]
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
}