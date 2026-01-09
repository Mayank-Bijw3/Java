package maze;

import java.util.ArrayList;

public class MazePath {
     public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();

        path("",3,3,ans);
        System.out.println(ans);
    }
    
    public static void path(String p,int r,int c,ArrayList<String> ans){
        if(r==1 && c==1){
            ans.add(p);
            return;
        }
        if(r==1){
           path(p+'R', r, c-1, ans); 
        }
        else if(c==1){
          path(p+'D', r-1, c, ans);  
        }
        else{
        path(p+'R', r, c-1, ans); 
        path(p+'D', r-1, c, ans);
        }
    }
}
