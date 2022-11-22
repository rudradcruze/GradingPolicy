package diu.edu.bd.gradingpolicy;
// https://designs.ai/colors/palette/1532 - Color Palate
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

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

    public static void alertWarning(String title, String contentText) {
        Alert alert;
        alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    public static void alertInfo(String title, String contentText) {
        Alert alert;
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    public static Optional<ButtonType> alertConfirmationReturn(String title, String contentText) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);

        Optional<ButtonType> option = alert.showAndWait();
        return option;
    }

    public String gradeGenerate(double grade) {
        if (grade >= 80 && grade <= 100)
            return "A+";
        else if (grade >= 75)
            return "A";
        else if (grade >= 70)
            return "A-";
        else if (grade >= 65)
            return "B+";
        else if (grade >= 60)
            return "B";
        else if (grade >= 55)
            return "B-";
        else if (grade >= 50)
            return "C+";
        else if (grade >= 45)
            return "C";
        else if (grade >= 40)
            return "D";
        else if(grade >= 0)
            return "F";
        else
            return "-1";
    }
}
