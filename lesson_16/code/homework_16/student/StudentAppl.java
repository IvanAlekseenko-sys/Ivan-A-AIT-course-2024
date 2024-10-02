package homework_16.student;
//В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.

import homework_16.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student x1 = new Student(1, "A1", "AA1", 2005, "Math");
        Student x2 = new Student(2, "B1", "BB1", 2005, "Linguistic");
        Student x3 = new Student(3, "C1", "CC1", 2004, "Philosophy");
        Student x4 = new Student(4, "D1", "DD1", 2006, "Sport");

        System.out.println(x1.display());
        System.out.println(x2.display());
        System.out.println(x3.display());
        System.out.println(x4.display());

        System.out.println();

        // процесс обучения
        x1.study();
        x2.takeVacation();
        x3.passExam();
        x4.expell();
    }//end of main
}//end of class


