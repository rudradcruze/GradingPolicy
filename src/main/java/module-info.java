module diu.edu.bd.gradingpolicy {
    requires javafx.controls;
    requires javafx.fxml;


    opens diu.edu.bd.gradingpolicy to javafx.fxml;
    exports diu.edu.bd.gradingpolicy;
//    opens diu.edu.bd.gradingpolicy.controllers to javafx.fxml;
//    exports diu.edu.bd.gradingpolicy.controllers;
//    exports controllers;
//    opens controllers to javafx.fxml;
}