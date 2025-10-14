class Calc{
    public int add(int n1 , int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int mul(int n1,int n2){
        return n1*n2;
    }

    public double div(int n1,int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public VeryAdvCalc(){
        System.out.println("in VeryAdvCalc");
    }
}
public class basicsOfInheritance {
    public static void main(String[] args) {
        Calc obj1  =  new Calc();

        int r1 = obj1.add(7, 5);
        int r2 = obj1.sub(9,5);

        System.out.println(r1 +" "+ r2);

        AdvCalc obj2 = new AdvCalc();

        int r3 = obj2.add(1, 1);
        int r0 = obj2.sub(7, 2);
        int r4 = obj2.mul(2, 4);
        double r5 = obj2.div(9, 3);

        System.out.println(r3 +" "+ r0 +" "+ r4 +" "+ r5);

        VeryAdvCalc obj3 =  new VeryAdvCalc();
        int temp = obj3.add(8, 9);
        System.out.println("Sum:" + temp);
    }
}
