package diu.edu.bd.gradingpolicy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RequestCodeController  {

    RequestCodeController requestCodeController;

    @FXML
    private Button requestCode;

    @FXML
    private TextField userResetId;

    public void close(ActionEvent event) {
        Common.close();
    }

    @FXML
    void login(ActionEvent event) throws IOException {
        goToLogin();
    }

    public void resetPassword(ActionEvent event) throws IOException {
        requestCode.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("view/resetPassword.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    public void goToLogin() throws IOException {
        requestCode.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

}
