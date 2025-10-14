

public class ForEachLoop {
    public static void main(String[] args) {
        
        //for each loop only work with array and array type data include collections

        int nums[]=new int[3];
        nums[0]=0;
        nums[1]=1;
        nums[2]=2;


        for(int temp : nums){
            System.out.println(temp);
        }
    }
}
