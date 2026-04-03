
interface LiveLecture{
     default void behaviour(){
         System.out.println("Lecture live");
    }
    default void startSession(){
        System.out.println("Teacher controlled ");
    }

}
interface RecordedLecture{
    default void  behaviour(){
        System.out.println("Recorded Lecture");
    }
    default void  startSession(){
        System.out.println("User Controlled to Play Content");
    }
}


public class HybridCourse implements LiveLecture,RecordedLecture{
        @Override
        public void behaviour(){
            LiveLecture.super.behaviour();
            RecordedLecture.super.behaviour();

            System.out.println("Hybrid Course Takes both live and recorded lecture");
        }

    @Override
    public void startSession() {
            LiveLecture.super.startSession();
            RecordedLecture.super.startSession();
        System.out.println("Both Lectures Required Start Session");
    }


    public static void main(String[] args){
            HybridCourse HC = new HybridCourse();
            HC.behaviour();
            HC.startSession();

        }
}
