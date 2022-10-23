package diu.edu.bd.gradingpolicy;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginController implements Initializable {

    Common common;

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
            close();
        }

        String userType = userLoginType.getValue();
        String id = userLoginUserID.getText();
        String password = userLoginUserPassword.getText();

        Scanner userFileReader = null;
        File usersFile = null;
        try {
            usersFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv");
            userFileReader = new Scanner(usersFile);
            while (userFileReader.hasNextLine()) {
                String row = userFileReader.nextLine();
                String[] data = row.split(",");

                if (data[0].contains(id) && data[2].contains(password) && password.contains(data[2])) {
                    System.out.println("data-0 = " + data[0]);
                    System.out.println("id = " + id);
                    System.out.println("data-2 = " + data[2]);
                    System.out.println("pass = " + password);
                    System.out.println("Positive");
                } else {
                    Common.alertError("Error!", "Credential wrong. Please enter valid information.");
                }

                if (data[1].equals(userType)) {
                    System.out.println("Positive");
                } else {
//                    System.out.println("ID = " + userType);
                    System.out.println("Negative");
                }

            }
        } catch (FileNotFoundException e) {
            Common.alertError("Error!", "An error occurred, File Error!");
            e.printStackTrace();
        } finally {
            userFileReader.close();
        }

    }

    public void requestResetCode() throws IOException {
        changeScreen("view/requestCode.fxml");
    }

    public void changeScreen(String view) throws IOException {
        requestResetCode.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource(view));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

}
