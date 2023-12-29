package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6, 7.9, 9.9);
//        box1.getL();
//        Box box2 = new Box(box1);
////        System.out.println(box1.w + " " + box1.h);
//
//        Inheritance.BoxWeight box3 = new Inheritance.BoxWeight();
//        Inheritance.Box box4 = new Inheritance.BoxWeight(2, 3, 4, 8);
//        System.out.println(box4.w  + " " + box3.weight);
//
//
//        Inheritance.Box box5 = new Inheritance.BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);
//
//        // there are many variables in both parent and child classes
//        // you are given access to variables that are in the ref type i.e. Inheritance.BoxWeight
//        // hence, you should have access to weight variable
//        // this also means, that the ones you are trying to access should be initialised
//        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
//        // this is why error
//        Inheritance.BoxWeight box6 = new Inheritance.Box(2, 3, 4);
//        System.out.println(box6);
//
////        Inheritance.Box.greeting();
//        Box newbb = new BoxPrice();
//        System.out.println(newbb.w);
//
//        BoxWeight box = new BoxWeight();
//// chcek this for static method override  Box box10 = new BoxWeight(); //it will actually call the method which in boxweight class but it actually calling box method hence static methods not get overrriden
//        BoxWeight.greeting(); // you can inherit but you cannot override

        Box bb = new BoxWeight();

        BoxWeight bb1 = new BoxWeight();
        bb1.greeting();
       bb.greeting();
       BoxWeight.greeting();




    }




}