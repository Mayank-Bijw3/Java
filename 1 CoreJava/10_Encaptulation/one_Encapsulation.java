class Batman {

    private String identity = "Bruce";
    private int age =21;
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return identity;
    }
    public void setName(String identity){
        this.identity= identity;
    }
}

public class one_Encapsulation {

    public static void main(String[] args) {
        Batman b1 = new Batman();

        System.out.println(b1.getAge() +" "+ b1.getName());

        b1.setAge(90);
        b1.setName("Gh0st");

        System.out.println(b1.getAge() +" "+ b1.getName());
 
    }
}
