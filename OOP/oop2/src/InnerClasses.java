import java.lang.reflect.Method;
public class InnerClasses {

     static class Test{

       String name;
       public Test (String name){

       this.name = name;
        }

    }


    public static void main(String[] args) {
        Test a = new Test("aniket");
        Test b = new Test("zanje");

        System.out.println(a.name);
        System.out.println(b.name);




    }
}


