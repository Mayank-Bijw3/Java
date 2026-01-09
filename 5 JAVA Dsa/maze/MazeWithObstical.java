package maze;

import java.util.ArrayList;

public class MazeWithObstical {
     public static void main(String[] args) {
        //3x3 maze but central block is river 

         ArrayList<String> ans = new ArrayList<>();
        int[] obs ={2,2};
        obstacleMaze("",3,3,ans,obs);
        System.out.println(ans);
    }

    private static void obstacleMaze(String p, int r, int c, ArrayList<String> ans, int[] obs) {
        if(r==obs[0] && c==obs[1]){
            return;
        }
        if(r==1 && c==1){
            ans.add(p);
        }
        else if(r==1){
            obstacleMaze(p+'R', r, c-1, ans, obs);
        }
        else if(c==1){
            obstacleMaze(p+'D', r-1, c, ans, obs);
        }
        else{
            obstacleMaze(p+'R', r, c-1, ans, obs);
            obstacleMaze(p+'D', r-1, c, ans, obs);
            obstacleMaze(p+'d', r-1, c-1, ans, obs);
        }

        }
}
