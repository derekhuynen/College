package com.College;

import java.util.ArrayList;

public class Course {
    private String courseName;
    Major major;
    private Teacher teacher;
    private ArrayList<Student> students;


    public Course( String s){

    }

    @Override
    public String toString() {
        return String.format("Teacher: %s Course: %s", this.teacher, this.courseName);
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Course)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Course c = (Course) o;

        // Compare the data members and return accordingly
        return this.courseName.equals(c.courseName)
                && teacher.equals(c.teacher);
    }
}
