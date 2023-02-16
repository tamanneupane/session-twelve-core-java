package day2.inheritance;

public class SchoolApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNumber(student, 1);
        student.setName(student, "ABC");
        student.setDOB(student, "1998-01-01");

        Teacher teacher = new Teacher();
        teacher.setSalary(teacher, 5000);
        teacher.setName(teacher, "DEF");
        teacher.setDOB(teacher, "1985-01-01");



    }
}
