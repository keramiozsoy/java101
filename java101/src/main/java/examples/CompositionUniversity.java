package examples;

import java.util.List;

// University has more than one Classroom.
public class CompositionUniversity {
    // reference to refer to list of Classroom.
    private final List<CompositionClassroom> classroomList;

    CompositionUniversity(List<CompositionClassroom> paramClassroomList)
    {
        this.classroomList = paramClassroomList;
    }

    // Getting total number of Classrooms
    public List<CompositionClassroom> getTotalClassroomsInUniversity()
    {
        return classroomList;
    }
}
