package diu.edu.bd.gradingpolicy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class StudentController {

    @FXML
    private Button home_btn;

    @FXML
    private Button print_report;

    @FXML
    private Button see_result_btn;

    @FXML
    private TextField studeent_home_phone;

    @FXML
    private Label studentShowId;

    @FXML
    private AnchorPane student_home;

    @FXML
    private TextField student_home_g_name;

    @FXML
    private TextField student_home_g_phone;

    @FXML
    private TextField student_home_gender;

    @FXML
    private TextField student_home_hsc;

    @FXML
    private TextField student_home_id;

    @FXML
    private TextField student_home_name;

    @FXML
    private TextField student_home_ssc;

    @FXML
    private TextField student_home_status;

    @FXML
    private AnchorPane student_report;

    @FXML
    private Button student_report_btn;

    @FXML
    private ComboBox<?> student_report_choose_semester;

    @FXML
    private TableView<?> student_report_tableView;

    @FXML
    private TableColumn<?, ?> student_report_table_courseCode;

    @FXML
    private TableColumn<?, ?> student_report_table_courseTitle;

    @FXML
    private TableColumn<?, ?> student_report_table_credit;

    @FXML
    private TableColumn<?, ?> student_report_table_grade;

    @FXML
    private TableColumn<?, ?> student_report_table_gradePoint;

    @FXML
    private Label student_view_attendanceMarks;

    @FXML
    private Label student_view_cgpa;

    @FXML
    private Label student_view_courseCode;

    @FXML
    private Label student_view_credit;

    @FXML
    private Label student_view_grade;

    @FXML
    private Label student_view_quizMarks;

    @FXML
    private Label student_view_semester;

    @FXML
    private Label student_view_totalCredit;

    @FXML
    private Label teacherName_forlogin;

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void minimize(ActionEvent event) {

    }

    @FXML
    void selectTeacherViewMarksAssignEdit(MouseEvent event) {

    }

    @FXML
    void switchScreen(ActionEvent event) {

    }

}
