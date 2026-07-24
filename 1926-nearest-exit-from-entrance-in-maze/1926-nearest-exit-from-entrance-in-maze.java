class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows=maze.length;
        int cols=maze[0].length;
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
        Queue<int[]>q=new LinkedList<>();
        q.offer(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int s=0;
        while(!q.isEmpty()){  
            int size=q.size();
            s++;
            for(int i=0;i<size;i++){
                int [] curr=q.poll();
                for(int d=0;d<4;d++){
                    int r=curr[0]+dr[d];
                    int c=curr[1]+dc[d];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && maze[r][c] == '.') {
                        if (r == 0 || r == rows - 1 || c == 0 || c == cols - 1) {
                            return s;
                        }
                    
                        maze[r][c] = '+';
                        q.offer(new int[]{r, c});
                }
            }
        }
    }
    return -1;
    }
}