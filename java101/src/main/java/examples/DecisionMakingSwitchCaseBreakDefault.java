package examples;

public class DecisionMakingSwitchCaseBreakDefault {

    public static void main(String[] args) {

        // The student wants to join lessons
        String paintLesson = "PAINT";
        String musicLesson = "MUSIC";
        String programmingLesson = "PROGRAMMING";

        String sportLesson = "SPORT";

        switch (sportLesson){
            case "PAINT": System.out.println("Lesson Paint");
            break;

            case "MUSIC": System.out.println("Lesson Music");
            break;

            case "PROGRAMMING": System.out.println("Lesson Programming");
            break;

            default: System.out.println("Warning !!! This is default answer which is SPORT");

        }
    }
}
