package diu.edu.bd.gradingpolicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TeacherDashboardData {
    private String studentId;
    private String teacherId;
    private String studentName;
    private String courseCode;
    private String semester;
    private double attendance;
    private double quiz;
    private double assignment;
    private double finalMarks;
    private double total;
    private String grade;

    Common common = new Common();

    public TeacherDashboardData(String studentId, String courseCode, String semester, double attendance, double quiz, double assignment, double finalMarks) throws FileNotFoundException {
        String courseFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";
        String studentFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv";
        Scanner courseFileScanner = new Scanner(new File(courseFile));
        Scanner studentFileScanner = new Scanner(new File(studentFile));

        this.studentId = studentId;

        while (courseFileScanner.hasNextLine()) {
            String row = courseFileScanner.nextLine();
            String [] dataCourseTeacher = row.split(",");

            if (dataCourseTeacher[1].equals(courseCode) && dataCourseTeacher[2].equals(semester))
                this.teacherId = dataCourseTeacher[4];
        }

        while (studentFileScanner.hasNextLine()) {
            String row = studentFileScanner.nextLine();
            String [] data = row.split(",");

            if (data[0].equals(studentId))
                this.studentName = data[1];
        }

        this.courseCode = courseCode;
        this.semester = semester;
        this.attendance = attendance;
        this.quiz = quiz;
        this.assignment = assignment;
        this.finalMarks = finalMarks;
        this.total = (attendance + quiz + assignment + finalMarks);
        this.grade = common.gradeGenerate(this.total);

        courseFileScanner.close();
        studentFileScanner.close();
    }

    public String getGrade() {
        return grade;
    }

    public double getAssignment() {
        return assignment;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public double getAttendance() {
        return attendance;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public double getTotal() {
        return total;
    }
}
