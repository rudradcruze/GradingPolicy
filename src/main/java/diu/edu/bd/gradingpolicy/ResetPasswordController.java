package diu.edu.bd.gradingpolicy;

import diu.edu.bd.gradingpolicy.Common;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ResetPasswordController extends commonAbstract {

    public void changeView(String view) throws IOException {
        resetPassConfirmPass.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource(view));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

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

    public void close() {
        Common.close();
    }

    public void changeLogin(ActionEvent event) throws IOException {
        changeView("view/login.fxml");
    }

    public void requestForRestPassword (ActionEvent event) throws IOException {
        changeView("view/requestCode.fxml");
    }

    @FXML
    void resetPassword(ActionEvent event) {

    }

}
