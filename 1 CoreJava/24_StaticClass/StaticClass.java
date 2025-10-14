class A{  // only inner class can become static not outer class
    

    public void show(){
        System.out.println("In show");
    }   

     static class B{
        public void config(){
            System.out.println("In config");
        }
    }
}



public class StaticClass {
    public static void main(String[] args) {
        
    
    A.B obj1; 
    obj1 = new A.B();   // only in case of static class
    obj1.config();       
    
    // OR
    
    A.B obj2 = new A.B();
    obj2.config();
    
}
}
