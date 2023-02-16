package day2.inheritance;

public class Student extends Person {

    private long rollNumber;

    public void setRollNumber(Student student, long rollNumber){
        student.rollNumber = rollNumber;
    }

    public long getRollNumber(Student student){
        return student.rollNumber;
    }
}
