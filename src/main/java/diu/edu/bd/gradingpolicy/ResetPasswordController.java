package diu.edu.bd.gradingpolicy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ResetPasswordController {

    @FXML
    private PasswordField resetPassConfirmPass;
    @FXML
    private TextField resetPassID;
    @FXML
    private PasswordField resetPassNewPass;
    @FXML
    private PasswordField resetPassOldPass;
    @FXML
    private TextField resetPassResetCode;

    void close() {
        Common.close();
    }

    @FXML
    void resetPassword(ActionEvent event) {

    }

}
