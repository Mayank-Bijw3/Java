package backtracking;

import java.util.ArrayList;

public class AllDirections {
    public static void main(String[] args) {
        ArrayList<String> ans =new ArrayList<>();
        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};
        allDirn("", 0, 0,maze, ans);

        System.out.println(ans);
    }
     private static void allDirn(String p, int r, int c,boolean[][] maze ,ArrayList<String> ans) {
        if(r==maze.length-1 && c==maze[0].length-1){
            ans.add(p);
            return;
        }

        //marking false if not visited
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;  //marked falsse

        if(r<maze.length-1){
            allDirn(p+'D', r+1, c, maze, ans);
        }
        if(r>0){
            allDirn(p+'U', r-1, c, maze, ans);
        }
        if(c<maze[0].length-1){
            allDirn(p+'R', r, c+1, maze, ans);
        }
        if(c>0){
            allDirn(p+'L', r, c-1, maze, ans);
        }

        //when function over so reverting changes
        maze[r][c] = true;

        }
}
