class Student {

    int age =0;
    int std = 0;
    int roll = 0;

    
}

public class objArray {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.age = 15;
        s1.std = 7;
        s1.roll = 1;

        Student s2 = new Student();
        s2.age = 14;
        s2.std = 7;
        s2.roll = 2;

        Student s3 = new Student();
        s3.age = 16;
        s3.std = 7;
        s3.roll = 3;


        //for refrence only not declearation of obj

        Student arr[] = new Student[3];

        arr[0]= s1;
        arr[1]= s2;
        arr[2]= s3;

    }
}
