package diu.edu.bd.gradingpolicy;

import diu.edu.bd.gradingpolicy.Common;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginController implements Initializable {

    Common common;
    private double x = 0;
    private double y = 0;

    //    All users type
    private String[] userType = {"Student", "Teacher", "Super Admin"};

    @FXML
    private Button loginInButton;

    @FXML
    private Button requestResetCode;

    @FXML
    private AnchorPane main_login;

    @FXML
    private ChoiceBox<String> userLoginType;

    @FXML
    private TextField userLoginUserID;

    @FXML
    private PasswordField userLoginUserPassword;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userLoginType.getItems().addAll(userType);
    }


    public void close() {
        common.close();
    }

    public void loginInButton() {

        //    Check empty
        if (userLoginType.getValue().isEmpty() || userLoginUserID.getText().isEmpty() || userLoginUserPassword.getText().isEmpty()) {
            common.alertError("Error!", "Please fill up all fields.");
        }

        String userType = userLoginType.getValue();
        String id = userLoginUserID.getText();
        String password = userLoginUserPassword.getText();

        Scanner userFileReader = null;
        File usersFile = null;
        try {
            usersFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv");
            userFileReader = new Scanner(usersFile);
            Integer flag = 1;
            while (userFileReader.hasNextLine()) {
                String row = userFileReader.nextLine();
                String[] data = row.split(",");

                if (data[0].contains(id) && data[2].contains(password) && password.contains(data[2]) && data[1].equals(userType)) {

                    flag = 0;
                    common.alertInfo("Login Successful", "Your have successfully login as " + userType + " in Grading Policy system.");

                    // Change the viewing dashboard according to the users.
                    if (userType.equals("Student"))
                        changeScreen("diu/edu/bd/gradingpolicy/view/teacher.fxml");
                    else if (userType.equals("Super Admin"))
                        changeScreen("view/superAdmin.fxml");
                    else
                        changeScreen("view/student.fxml");
                }
            }
            if (flag == 1)
                common.alertError("Error!", "Credential wrong!!!!");

            userFileReader.close();
        } catch (FileNotFoundException e) {
            common.alertError("Error!", "An error occurred, File Error!");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void requestResetCode() throws IOException {
        changeScreen("view/requestCode.fxml");
    }

    public void changeScreen(String view) throws IOException {
        requestResetCode.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("view/student.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }
}
