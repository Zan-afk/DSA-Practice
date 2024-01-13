package Strings;

import java.util.ArrayList;

public class subSeq {

    public static void main(String[] args) {
//        subseq("","abc");
//        System.out.println(retsubseq("","abc"));
//        subseqAscii("","abc");
        System.out.println(subseqAsciiret("","abc"));

    }

    static void subseq(String process , String unprocess){

        if (unprocess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0);

        subseq(process+ch, unprocess.substring(1));
        subseq(process,unprocess.substring(1));
    }

    //returning arraylist of subseq

    static ArrayList<String> retsubseq(String process, String unprocess){

        if (unprocess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch = unprocess.charAt(0);

        ArrayList<String> left = retsubseq(process+ch, unprocess.substring(1));
        ArrayList<String> right = retsubseq(process,unprocess.substring(1));

        left.addAll(right);
//        right.addAll(left);
        return left;
    }


    //this method gives ascii values also in subseq
    static void subseqAscii(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));

    }


    static ArrayList<String> subseqAsciiret(String p, String up){



        if (up.isEmpty()){

            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }

        char ch = up.charAt(0);

       ArrayList<String> first = subseqAsciiret(p+ch,up.substring(1));
       ArrayList<String> second = subseqAsciiret(p,up.substring(1));
       ArrayList<String> third = subseqAsciiret(p+(ch+0),up.substring(1));

       first.addAll(second);
       first.addAll(third);
       return first;

    }





























}
