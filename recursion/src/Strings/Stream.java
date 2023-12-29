package Strings;

public class Stream {

    public static void main(String[] args) {

        String name = "ZaaaaaaaAAAAAAAAen";

//      skip("",name);
//        System.out.println(skip(name));
//        System.out.println(skipApple("appleapplea"));
        System.out.println(skipAppNotApple("bcsappapple"));



    }

    static void skip(String process, String unprocess){

        if (unprocess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0);

        if (ch=='a' || ch=='A'){
            skip(process,unprocess.substring(1));
        }
        else {
            skip(process+ch, unprocess.substring(1));
        }

    }

    static String skip(String unprocess){

        if (unprocess.isEmpty()){
            return "";
        }

        char ch = unprocess.charAt(0);

        if (ch=='a' || ch=='A'){
            return skip(unprocess.substring(1));
        }
        else {
            return ch + skip(unprocess.substring(1));
        }

    }

    static String skipApple(String unprocess) {

        if (unprocess.isEmpty()){
            return "";
        }



        if (unprocess.startsWith("apple") ){
            return skipApple(unprocess.substring(5));
        }
        else {
            return unprocess.charAt(0) + skipApple(unprocess.substring(1));
        }

    }


    static String skipAppNotApple(String unprocess){

        if (unprocess.isEmpty()){
            return "";
        }



        if (unprocess.startsWith("app") && !unprocess.startsWith("apple") ){
            return skipAppNotApple(unprocess.substring(3));
        }
        else {
            return unprocess.charAt(0) + skipAppNotApple(unprocess.substring(1));
        }

    }






















}
