class Calculator{

    public int add(int a,int b){
        return a+b;
    }
    
}


public class Object {
    public static void main(String args[]){

        int n1=9;
        int n2=10;


        Calculator obj1 = new Calculator();

        int res=obj1.add(n1,n2);

        System.out.println(res);
    }
}