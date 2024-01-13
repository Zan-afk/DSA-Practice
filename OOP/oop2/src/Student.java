public class Student {

    int rollno;
    String name;
    int marks;




    void greetings(){
        System.out.println("hello "+ this.name + marks);
    }

    void changeName(String newName){
        name = newName;
    }

//    Student(){
//        this.rollno=13;
//        this.name="kunal zzz";
//        this.marks = 90;
//    }

    Student(){
        this (50,"default name",55);
    }


    Student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks =marks;
    }

    //constuctor overloading
    Student(Student otherStudent){
        this.name = otherStudent.name;
        this.rollno = otherStudent.rollno;
        this.marks = otherStudent.marks;
    }


}
