package backtracking;
import java.util.Arrays;

public class AllPathPrint {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};
        
        int[][] path = new int[maze.length][maze[0].length];

        allPathPrint("", 0, 0,maze, path,1);

    }
     private static void allPathPrint(String p, int r, int c,boolean[][] maze ,int[][] path,int steps) {
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = steps;

            for(int[] k : path){
                System.out.println(Arrays.toString(k));
            }

            System.out.println(p);
            System.out.println();
            return;
        }

        //marking false if not visited
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;  //marked falsse
        path[r][c] = steps;

        if(r<maze.length-1){
            allPathPrint(p+'D', r+1, c, maze, path, steps+1);
        }
        if(r>0){
            allPathPrint(p+'U', r-1, c, maze, path, steps+1);
        }
        if(c<maze[0].length-1){
            allPathPrint(p+'R', r, c+1, maze, path, steps+1);
        }
        if(c>0){
            allPathPrint(p+'L', r, c-1, maze, path, steps+1);
        }

        //when function over so reverting changes
        maze[r][c] = true;
        path[r][c] = 0;

        }
}

