package Inheritance;

 public class Box {
    private double l;
    double h;
    double w;
//    double weight;

     static void greeting() {
        System.out.println("Hey, I am in Inheritance.Box class. Greetings!");
    }

//   void greet() {
//        System.out.println("Hey, I am in Inheritance.Box class. Greetings!");
//    }

     void carrier(String name){
        System.out.println("my name is"+name);
        System.out.println("i am in BOX");
    }
    public double getL() {
        return l;
    }

     Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Inheritance.Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }


}
