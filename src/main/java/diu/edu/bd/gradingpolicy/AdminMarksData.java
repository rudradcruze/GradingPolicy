package diu.edu.bd.gradingpolicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminMarksData {

    Common common = new Common();

    private String studentId;
    private String studentName;
    private String courseCode;
    private String courseSemester;
    private double attendanceMarks;
    private double quizMarks;
    private double assignmentMarks;
    private double finalMarks;
    private double total;
    private String grade;

    public AdminMarksData(String courseCode, String studentId, String courseSemester, double attendanceMarks, double quizMarks, double assignmentMarks, double finalMarks) throws FileNotFoundException {
        this.courseCode = courseCode;
        this.studentId = studentId;

        String student = "src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv";
        Scanner studentScanner = new Scanner(new File(student));

        while (studentScanner.hasNextLine()) {
            String row = studentScanner.nextLine();
            String[] data = row.split(",");

            if(data[0].equals(this.studentId))
                this.studentName = data[1];
        }

        this.courseSemester = courseSemester;
        this.attendanceMarks = attendanceMarks;
        this.quizMarks = quizMarks;
        this.assignmentMarks = assignmentMarks;
        this.finalMarks = finalMarks;
        this.total = (this.attendanceMarks + this.quizMarks + this.assignmentMarks + this.finalMarks);
        this.grade = common.gradeGenerate(this.total);
    }

    public double getTotal() {
        return total;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public double getAttendanceMarks() {
        return attendanceMarks;
    }

    public double getQuizMarks() {
        return quizMarks;
    }

    public double getAssignmentMarks() {
        return assignmentMarks;
    }

    public double getFinalMarks() {
        return finalMarks;
    }
}
