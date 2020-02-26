package com.College;

import java.util.HashMap;

public class Student implements Person{
    private String firstName;
    private String lastName;
    private HashMap<Course,Grade> FinishedCourses;
    private HashMap<Course,Grade> currentCourses;




    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }


    @Override
    public String toString() {
        return String.format("Teacher: %s %s",this.firstName,this.lastName);
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
        if (!(o instanceof Student)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Student c = (Student) o;

        // Compare the data members and return accordingly
        return this.firstName.equals(c.firstName)
                && lastName.equals(c.lastName);
    }

}





