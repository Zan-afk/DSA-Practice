package Backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {

//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(patRetDiagonal("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, false, true}
        };
        pathRestrictions("", board, 0, 0);

    }

    static int count(int row, int column){

        if (row== 1 || column == 1){
            return 1;
        }

        int down = count(row-1, column); //these are giving no of paths having through that point 
        int right = count(row, column-1);

        return down+right;
    }

    static void path(String p, int r, int c){

        if (r==1 && c==1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            path(p+"D",r-1,c);
        }

        if (c>1){
            path(p+"L",r,c-1);
        } //please draw the two recursive call tree for understanding call 32 ,36  first tree node is (3,3) it will execute two calls (2,3) and (3,2)
    }


    static ArrayList<String> pathRet(String p, int r, int c){

        if (r==1 && c==1){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1){
          ans.addAll(pathRet(p+"D",r-1,c));
        }

        if (c>1){
            ans.addAll(pathRet(p+"L",r,c-1));
        } //please draw the two recursive call tree for understanding call 32 ,36  first tree node is (3,3) it will execute two calls (2,3) and (3,2)

        return ans;

    }

    static ArrayList<String> patRetDiagonal(String p, int r, int c){

        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r>1){
           ans.addAll(patRetDiagonal(p+"V",r-1,c));
        }

        if (c>1){
            ans.addAll(patRetDiagonal(p+"H",r,c-1));
        }

        if (c>1 && r>1){ 
           ans.addAll(patRetDiagonal(p+"D",r-1,c-1));
        }

        return ans;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){

        if (r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){ //maze[r][c] == false
            return;
        }

        if (r < maze.length-1){
            pathRestrictions(p+"Down ", maze,r+1,c);
        }
        if (c< maze[0].length-1){
            pathRestrictions(p+"Right ",maze,r,c+1);
        }

//        if (r < maze.length-1 && c < maze[0].length-1){
//            pathRestrictions(p+"Diagonal",maze,r+1,c+1);
//        }
    }















}
