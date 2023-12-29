public class Main {


    void greeting(){

        System.out.println("hellooo");
    }

   int greetings=0;


    public static void main(String[] args) {

        //---------------------constuctor and this keyword-------------

//        Student kunal = new Student(78,"kk",98);
//
//        Student rahul = new Student();
//        rahul.greetings();
//        rahul.changeName("rahul zanje");
//        rahul.greetings();
//
//        Student random = new Student(kunal);
//        System.out.println(random.name);
//
//        Student random2 = new Student();
//        System.out.println(random2.name);

        //---------------Final keyword--------------------

//         FinalVariable ani = new FinalVariable("zan");
//
//        System.out.println(ani.a);
//        System.out.println(ani.fname);
//        System.out.println(ani.lname);
//
//        ani = new FinalVariable("zanje");
//        System.out.println(ani.lname);


        //----------------- GC finalize();--------------------
//        FinalVariable a;
//        for (int i = 0; i < 1000000000; i++) {
//
//            a =new FinalVariable();
//        }



        Human aniket =new Human(22,"aniket",10000,false);
        Human rahul =new Human(32,"rahul",100000,true);
        Human gavu =new Human(20,"gavu",1000,false);


//        Main b = new Main();
//        b.greeting();
//        b.greetings = 12;




    }




}

//  class FinalVariable{
//
//    final int a = 10;
//    final String fname ="aniket" ;
//
//    String lname  ;
//
//
////    public FinalVariable(String lname){
////        this.lname = lname;
////    }
//
//
//     @Override
//     protected void finalize() throws Throwable {
//         System.out.println("object is destroyed");
//     }
// }