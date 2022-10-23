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
        if(userLoginType.getValue().isEmpty() || userLoginUserID.getText().isEmpty() || userLoginUserPassword.getText().isEmpty()) {
            common.alertError("Error!", "Please fill up all fields.");
        }

        String userType = userLoginType.getValue();
        String id = userLoginUserID.getText();
        String password = userLoginUserPassword.getText();

//        New

//        try {
//            File myObj = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String row = myReader.nextLine();
//                String[] data = row.split(",");
//                System.out.println(data[0] + data[1] + data[2]);
//
//                if(data[0].contains("16"))
//                    System.out.println("Positive");
//                else
//                    System.out.println("Negative");
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

//        Old

//        String file = "src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv";
//        BufferedReader reader = null;
//        String line = "";
//
//        try {
//            reader = new BufferedReader(new FileReader(file));
//            while ((line = reader.readLine()) != null) {
//                String[] row = line.split(",");
//                System.out.println(row);
////                String tempId = ;
//
//                if(row[0].equals(id)) {
//                    System.out.println("id" + id + " row " + row[0] +"==");
//                    System.out.println("Matched");
//                }
//                else {
//                    System.out.println("id " + id + " row " + row[0]+"---");
//                    System.out.println("Invalid");
//                }
//
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public void requestResetCode() throws IOException {
        changeScreen("view/requestCode.fxml");
    }

    public void changeScreen(String view) throws IOException {
//        Hide the login panel
        requestResetCode.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource(view));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

}
