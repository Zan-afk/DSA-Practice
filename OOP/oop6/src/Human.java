public class Human implements Cloneable {

    int age;
    String name;

    int[] arr;

    public Human (int age, String name){

        this.age = age;
        this.name = name;
        this.arr = new int[]{1,233,5,58,8};
    }


//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

    public Object clone() throws CloneNotSupportedException{

        //this is shallow copy
//        return super.clone();

        //creating deep copy
        Human zan = (Human) super.clone();

        zan.arr = new int[zan.arr.length];
        for (int i = 0; i < zan.arr.length; i++) {

            zan.arr[i] = this.arr[i];
        }

        return zan;
    }
}
