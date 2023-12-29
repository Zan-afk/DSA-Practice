package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {

        permutations("","abc");
//        ArrayList<String> ans = permutationsList("", "abcd");
//        System.out.println(ans);
        System.out.println(permutationCount("","abc"));
    }



        static void permutations(String p , String up){

                if (up.isEmpty()){
                    System.out.println(p);
                    return;
                }

                char ch = up.charAt(0);

            for (int i = 0; i <= p.length(); i++) { //no of function calls will be depend on p characters+1

                String first = p.substring(0,i);// this lines changes the order of added ch in p string for making various permutations
                String second = p.substring(i, p.length());

                permutations(first + ch + second, up.substring(1));
            } //this loop will execute to make no of recursion calls that we don't know as p length varing stings to stings


        }

        static ArrayList<String> permutationsList(String p, String up){

        if (up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

            for (int i = 0; i <= p.length(); i++) {

                String first = p.substring(0,i);
                String second = p.substring(i,p.length());

                ans.addAll(permutationsList(first + ch + second, up.substring(1)));
            }

            return ans;
        }


        static int permutationCount(String p, String up){

        if (up.isEmpty()){
            return 1;
        }

        int count = 0;

        char ch = up.charAt(0);
            for (int i = 0; i <= p.length(); i++) {

                String f = p.substring(0,i);
                String s = p.substring(i,p.length());

                count = count+permutationCount(f+ch+s,up.substring(1));
            }

            return count;

        }



    }
