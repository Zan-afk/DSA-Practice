package EnumExample;

public class Basic {

    enum Week{
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        //these are enum constants and by default it public,static,final
        //the type of all these variables is week

        Week(){
            System.out.println("Constructor called for  "+ this);
        }
        //this constructor only can be private or default not public or protected
        //why? we don't want to create new objects
        //this is not the enum concept, that's why
    }

    public static void main(String[] args) {
        Week week;
        week = Week.monday;

        for (Week day: Week.values()) {
            System.out.println(day);
        }


    }
}
