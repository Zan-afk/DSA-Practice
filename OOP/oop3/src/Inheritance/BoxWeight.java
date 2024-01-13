package Inheritance;

import java.util.ArrayList;

    public class BoxWeight extends Box{
        double weight;

        public BoxWeight() {
//            super();
            this.weight = -1;

        }

        //    @Override
        static void greeting() {
            System.out.println("Hey, I am in Inheritance.BoxWeight class. Greetings!");
        }

        BoxWeight (BoxWeight other) {
            super(other);
            weight = other.weight;
        }

        BoxWeight(double side, double weight) {
            super(side);
            this.weight = weight;
        }

        public BoxWeight(double l, double h, double w, double weight) {
            // used to initialise values present in parent class
            super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
            this.weight = weight;
        }

        void carrier(String name){
            System.out.println("my name is"+name);
            System.out.println("i am in BOX weight");
        }


         void greet() {
            System.out.println("Hey, I am in Inheritance.Box weight class. Greetings!");
        }

    }

