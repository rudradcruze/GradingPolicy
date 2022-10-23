package diu.edu.bd.gradingpolicy;

import javafx.scene.control.Alert;

public class Common {

    Alert alert;
    public static void close(){
        System.exit(0);
    }

    public void alertError(String title, String contentText) {
        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

}
