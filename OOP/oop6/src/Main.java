import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hello world!");
        Human ani =new Human(55,"aniket");
//        Human zan = new Human(ani);

        Human zan =  (Human) (ani.clone());

//        System.out.println(ani.name);
//        System.out.println(zan.name);

        System.out.println(Arrays.toString(zan.arr));
        System.out.println(Arrays.toString(ani.arr));

        zan.arr[0]= 500;

//        System.out.println(zan.name);
//        System.out.println(ani.name);
        System.out.println(Arrays.toString(zan.arr));
        System.out.println(Arrays.toString(ani.arr));





    }

}