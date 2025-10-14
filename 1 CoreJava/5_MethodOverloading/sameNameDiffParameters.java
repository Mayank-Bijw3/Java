class MethodOver{

    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(int n1,double n2){
        return n1+n2;
    }
}

public class sameNameDiffParameters {
    
    public static void main(String args[]){
    MethodOver obj1 = new MethodOver();
    

    int res1=obj1.add(2,3);
    System.out.println("res1 " + res1);

    int res2=obj1.add(2,3);
    System.out.println("res2 " + res2);
    
    double res3=obj1.add(2,3);
    System.out.println("res3 " + res3);

}
}