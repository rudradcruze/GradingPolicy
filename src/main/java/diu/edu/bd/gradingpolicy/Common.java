package diu.edu.bd.gradingpolicy;

import javafx.scene.control.Alert;

public class Common {

    public static void close(){
        System.exit(0);
    }

    public static void alertError(String title, String contentText) {
        Alert alert;
        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

}
