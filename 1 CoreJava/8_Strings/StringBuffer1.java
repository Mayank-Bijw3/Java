public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Mayank");

        //now i can do this

        String str = sb.toString();
        System.out.println(str);

        sb.append(" Bijwe");
        sb.insert(9, "007");

        

        System.out.println(sb);
    }
}
