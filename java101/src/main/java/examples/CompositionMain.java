package examples;

import java.util.ArrayList;
import java.util.List;

public class CompositionMain {
    public static void main(String[] args) {
        // Creating the Objects of Classroom class.
        CompositionClassroom c1
                = new CompositionClassroom("C101", "Central Building");
        CompositionClassroom c2
                = new CompositionClassroom("C102", "Another Building");

    List<CompositionClassroom> classroomList = new ArrayList<>();
        classroomList.add(c1);
        classroomList.add(c2);

    CompositionUniversity university = new CompositionUniversity(classroomList);
    List<CompositionClassroom> totalClasrooms = university.getTotalClassroomsInUniversity();

    for (CompositionClassroom tc : totalClasrooms) {
        System.out.println("Name : " + tc.name
                + " and "
                + " Address : " + tc.address);
    }
    }
}
