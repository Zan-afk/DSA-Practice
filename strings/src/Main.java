public class Main {
    public static void main(String[] args) {

        String a1 = new String("aniket");
        String b1 = new String("aniket");
        boolean result = (a1.equals(b1));//for checking values of obj
        boolean result1 = (a1==b1);//for comparing string obj is same or diff by ref variable
        System.out.println(result1);
        System.out.println('a' +'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char) ('a'+3));
        System.out.println("a"+1);

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series+" "+ ch;
        }
        System.out.println(series);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(" "+ ch);
        }
        System.out.println(builder.toString());

    }
}