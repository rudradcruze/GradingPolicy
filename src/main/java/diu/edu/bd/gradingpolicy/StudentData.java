package diu.edu.bd.gradingpolicy;


public class StudentData extends Users {

    private String studentGuardianName;
    private String studentGuardianPhone;

    public StudentData(String userId, String userName, String userGender, String userPhone, String userSSC, String userHSC, String studentGuardianName, String studentGuardianPhone, String userStatus) {
        super(userId, userName, userGender, userPhone, userSSC, userHSC, userStatus);
        this.studentGuardianName = studentGuardianName;
        this.studentGuardianPhone = studentGuardianPhone;
    }

    public String getStudentGuardianName() {
        return studentGuardianName;
    }

    public String getStudentGuardianPhone() {
        return studentGuardianPhone;
    }
}