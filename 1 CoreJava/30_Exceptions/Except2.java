public class Except2 {
    public static void main(String[] args) {
        
        int arr[]= new int[5];
        int i=0;
        int j=5;

        try {
            j/=i;
            int res= arr[j];
            
        } catch (ArithmeticException e) {

            System.out.println("cannot div by 0 ");
        }

        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array length is less than 5 ");

        }
        catch(Exception e3){
            System.out.println("Unknown exception type which idk");
        }
    }
}
