class Ironman{
    String name;
    int age;


    public Ironman(){  // no retun type and same name as of class
        name = "Tony Stank";
        age = 17;
    }
}

public class basicsConstructors {
    public static void main(String args[]){

        Ironman i1 = new Ironman();

        System.out.println(i1.name+" "+i1.age);


    }
}
