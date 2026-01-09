package Subsequence;

public class Subseq {
    public static void main(String[] args) {
        String s ="xyz";
        String ans="";
        subseq(s,ans);
    }
    public static void subseq(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);

        subseq(s.substring(1), ans + ch);

        subseq(s.substring(1), ans);

    } 
    
}
