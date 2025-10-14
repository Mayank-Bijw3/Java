enum Status {
    Running, Failed, Pending, Success; // named constants
}

public class ifelseEnum {
    public static void main(String[] args) {
        Status s = Status.Success;

        if(s == Status.Running)
            System.out.println("Running...");
        else if(s==Status.Failed)
            System.out.println("Failing...");
        else if(s==Status.Pending)
            System.out.println("Pending...");
        else
            System.out.println("Success...");


            switch(s){
                case Running:
                    System.out.println("all good");
                    break;
                case Failed:
                    System.out.println("Try Again");
                    break;
                case Pending:
                    System.out.println("Please Wait");
                    break;
                default:
                    System.out.println("Done");
                    break;
    }
}

}