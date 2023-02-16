package day2.inheritance;

public class Teacher extends Person {

    private double salary;

    public void setSalary(Teacher teacher, double salary){
        teacher.salary = salary;
    }

    public double getSalary(Teacher teacher){
        return teacher.salary;
    }
}
