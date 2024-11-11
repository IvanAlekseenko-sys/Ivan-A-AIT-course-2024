package homework_43.marks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Student {
    private static final int MIN = 1;
    private static final int MAX = 5;
    private static final int S_NUMBERS = 10;

    //fields
    String studentName;
    List<Integer> marks;

    public Student(String studentName) {
        this.studentName = studentName;
        this.marks = generateRandomMarks();
    }

    private List<Integer> generateRandomMarks() {
        List<Integer> randomMarks = new ArrayList<>();
        Random random = new Random ();
        for (int i = 0; i < S_NUMBERS; i++) {
            randomMarks.add(random.nextInt(MAX-MIN+1) + MIN );
        }
        return randomMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(studentName, student.studentName) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, marks);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentName='").append(studentName).append('\'');
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }


}
