package diu.edu.bd.gradingpolicy;

public class TeacherData extends Users {
    private String teacherBSC;
    private String teacherMSC;

    public TeacherData(String userId, String userName, String userGender, String userPhone, String userSSC, String userHSC, String teacherBSC, String teacherMSC, String userStatus) {
        super(userId, userName, userGender, userPhone, userSSC, userHSC, userStatus);
        this.teacherBSC = teacherBSC;
        this.teacherMSC = teacherMSC;
    }

    public String getTeacherBSC() {
        return teacherBSC;
    }

    public String getTeacherMSC() {
        return teacherMSC;
    }
}
