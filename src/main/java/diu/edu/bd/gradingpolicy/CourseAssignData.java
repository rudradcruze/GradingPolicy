package diu.edu.bd.gradingpolicy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseAssignData {
    private String courseCode;
    private String semester;
    private String courseName;
    private String studentId;
    private String studentName;
    private String teacherId;
    private String teacherName;

    public CourseAssignData(String courseCode,String studentId, String semester) throws FileNotFoundException {

        this.courseCode = courseCode;
        this.semester = semester;
        this.studentId = studentId;

        // Path
        String student = "src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv";
        String courses = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";
        String teacherFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv";

        // Scanner
        Scanner studentScanner = new Scanner(new File(student));
        Scanner courseScanner = new Scanner(new File(courses));
        Scanner teacherScanner = new Scanner(new File(teacherFile));

        while (studentScanner.hasNextLine()) {
            String row = studentScanner.nextLine();
            String[] data = row.split(",");

            if(data[0].equals(this.studentId))
                this.studentName = data[1];
        }

        while (courseScanner.hasNextLine()) {
            String row = courseScanner.nextLine();
            String[] data = row.split(",");

            if(data[1].equals(this.courseCode))
            {
                this.courseName = data[0];
                this.teacherId = data[4];
            }
        }

        while (teacherScanner.hasNextLine()) {
            String row = teacherScanner.nextLine();
            String[] data = row.split(",");

            if(data[0].equals(teacherId))
                this.teacherName = data[1];
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
