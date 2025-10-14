class Ironman2{
    String name;
    int age;


    public Ironman2(){  // default constructor
        name = "Tony Stank";
        age = 17;
        System.out.println(name + ":" + age);

    }

    public Ironman2(String name,int age){ //paramaterized constructor
        this.name = name;
        this.age = age;
        System.out.println(this.name + ":" + this.age);
    }
}

public class constructorOverloading {
    public static void main(String args[]){

        Ironman2 i1 = new Ironman2();
        Ironman2 i2 = new Ironman2("Mayank",22);



    }
}
