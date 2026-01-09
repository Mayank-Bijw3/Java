package Subsequence;

public class Permutationss {
    
    public static void main(String[] args) {
       permutations("","abc");
    }
    
    public static void permutations(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
             System.out.println(processed);
             return;
        }
        int n=processed.length();
        char ch=unprocessed.charAt(0);
        for(int i=0;i<=n;i++){
            String left = processed.substring(0,i);
            String right = processed.substring(i,n);
            permutations(left+ch+right,unprocessed.substring(1));
            
        }
    }
}
