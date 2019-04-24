package school;

import java.util.HashMap;

public class Course {



    private String name;
    private final Integer courseId;
    private Integer courseCredits;
    private String department;
    private HashMap roster;

    public Course(String name, Integer courseId,
                  Integer courseCredits, String department,
                  HashMap roster) {

        this.name = name;
        this.courseId = courseId;
        this.courseCredits = courseCredits;
        this.department = department;
        this.roster = roster;
    }

}
