package diu.edu.bd.gradingpolicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseData {
    private String courseCode;
    private String courseName;
    private String semester;
    private String courseType;
    private String teacherId;
    private String courseCredit;
    private String teacherName;

    public CourseData(String courseCode, String courseName, String semester, String courseType, String teacherId) throws FileNotFoundException {
        File teacherFile = null;
        teacherFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv");
        String str = "Theory";

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.semester = semester;
        this.courseType = courseType;
        this.teacherId = teacherId;

        if(courseType.equals(str))
            this.courseCredit = "3";
        else
            this.courseCredit = "1";

        Scanner scanner = new Scanner(teacherFile);
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] data = row.split(",");

            if(data[0].equals(teacherId))
                this.teacherName = data[1];
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseType() {
        return courseType;
    }

    public String getTeacherId() {
        return teacherId;
    }
}
