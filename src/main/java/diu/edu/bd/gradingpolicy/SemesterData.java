package diu.edu.bd.gradingpolicy;

public class SemesterData {
    private String semester_season;
    private String semester_year;

    private String semesterCombo;

    public SemesterData(String semester_season, String semester_year) {
        this.semester_season = semester_season;
        this.semester_year = semester_year;
        this.semesterCombo = semester_season + " " + semester_year;
    }

    public String getSemesterCombo() {
        return semesterCombo;
    }

    public String getSemester_season() {
        return semester_season;
    }

    public String getSemester_year() {
        return semester_year;
    }
}
