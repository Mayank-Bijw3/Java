import java.io.IOException;
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Hey enter a no.");

        int a = System.in.read();  //in.read() return only integer type in ascii
        System.out.println(a);

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey enter a no. again ");
        int age = sc.nextInt();
        System.out.println(age);


        System.out.println("Hey enter name");
        String name= sc.next();
        System.out.println(name);
    }
}
