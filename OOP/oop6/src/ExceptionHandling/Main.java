package ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a =5;
        int b=0;
        try {
//            divide(a,b);

            String name = "aniket";
            if (name.equals("aniket")){
                throw new MyException("your name is aniket zanje");
            }
        }
        catch (Exception g){

            System.out.println(g.getMessage());
        }
        finally {
            System.out.println("this is finally");
        }


    }

    static int divide(int a, int b) throws ArithmeticException{

        if (b==0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }


}
