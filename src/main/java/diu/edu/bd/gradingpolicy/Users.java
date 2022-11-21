package diu.edu.bd.gradingpolicy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Users {
    private String userId;
    private String userName;
    private String userGender;
    private String userPhone;
    private String userSSC;
    private String userHSC;
    private String userStatus;

    public Users(String userId, String userName, String userGender, String userPhone, String userSSC, String userHSC, String userStatus) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userPhone = userPhone;
        this.userSSC = userSSC;
        this.userHSC = userHSC;
        this.userStatus = userStatus;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserSSC() {
        return userSSC;
    }

    public String getUserHSC() {
        return userHSC;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
