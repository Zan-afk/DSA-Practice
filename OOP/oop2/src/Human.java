 public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long poulation;

     Human(int age,String name,int salary,boolean married)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.poulation +=1;
    }

    void hun(){
        System.out.println("in hun");
    }

}
