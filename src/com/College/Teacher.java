package com.College;

import java.util.ArrayList;

public class Teacher implements Employee{
    private String firstName;
    private String lastName;
    private double salary;
    private ArrayList<Course> courses;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
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
        if (!(o instanceof Teacher)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Teacher c = (Teacher) o;

        // Compare the data members and return accordingly
        return this.firstName.equals(c.firstName)
                && lastName.equals(c.lastName);
    }

}
