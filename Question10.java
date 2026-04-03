interface Assignments{
    default void activity(){
        System.out.println("Assignments");
    }
}

interface Quizzes{
    default void activity(){
        System.out.println("Quizzes");
    }
}


class GuestInstructor{
    void teach(){
        System.out.println("Guest instructor is taking one-time lecture");
    }
}

public class Instructor implements Assignments, Quizzes{

    GuestInstructor guest = new GuestInstructor();


    public void startCourse(){
        System.out.println("Course started");
    }

    @Override
    public void activity(){
        Assignments.super.activity();
        Quizzes.super.activity();
        System.out.println("Course supports both assignments and quizzes");
    }

    public void specialLecture(){
        guest.teach();
    }

    public static void main(String[] args){
        Instructor course = new Instructor();

        course.startCourse();
        course.activity();
        course.specialLecture();
    }
}
