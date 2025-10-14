enum Status{
    Running, Failed, Pending, Success; //enum are named constants
}

public class Eunms {

    public static void main(String[] args) {
        
    
    Status s = Status.Pending;
   // Status s = Status.IDK;    //error

    System.out.println(s);

    Status s2[] = Status.values();
    for(Status a : s2)
        System.out.println(a);
}
}