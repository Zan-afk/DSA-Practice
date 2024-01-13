import java.util.Locale;

public class StringQuetions {
    public static void main(String[] args) {

        String a = " ";
        boolean res = isPalindrome(a);
        System.out.println(res);
    }

    static boolean isPalindrome(String str){

        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 - i);//each time decreasing index by1

            if (start != end){
                return false;
            }

        }
        return true;
    }
}
