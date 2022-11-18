package diu.edu.bd.gradingpolicy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class SuperAdminController implements Initializable {

    private double x = 0;
    private double y = 0;

    @FXML
    private MenuItem addStudent_btn;

    @FXML
    private MenuItem addTeacher_btn;

    @FXML
    private AnchorPane admin;

    @FXML
    private Button admin_available_btn;

    @FXML
    private BarChart<?, ?> admin_chart_Students;

    @FXML
    private Button admin_create_semester_btn;

    @FXML
    private AnchorPane admin_marks;

    @FXML
    private Button admin_marks_btn;

    @FXML
    private Label admin_student;

    @FXML
    private Label admin_studentFemale;

    @FXML
    private Label admin_studentMale;

    @FXML
    private LineChart<?, ?> admin_student_female;

    @FXML
    private MenuButton admin_student_btn;

    @FXML
    private MenuItem admin_student_btn_all;

    @FXML
    private MenuItem admin_student_btn_view;

    @FXML
    private MenuItem admin_student_btn_add;

    @FXML
    private LineChart<?, ?> admin_student_male;

    @FXML
    private Label admin_teacher;

    @FXML
    private MenuButton admin_teacher_btn;

    @FXML
    private MenuItem admin_teacher_btn_all;

    @FXML
    private MenuItem admin_teacher_btn_view;

    @FXML
    private MenuItem admin_teacher_btn_add;

    @FXML
    private AnchorPane allStudent;

    @FXML
    private MenuItem allStudent_btn;

    @FXML
    private Button allStudent_edit_delete;

    @FXML
    private DatePicker allStudent_edit_dob;

    @FXML
    private TextField allStudent_edit_gName;

    @FXML
    private TextField allStudent_edit_gPhone;

    @FXML
    private ComboBox<?> allStudent_edit_gender;

    @FXML
    private TextField allStudent_edit_hsc;

    @FXML
    private TextField allStudent_edit_name;

    @FXML
    private TextField allStudent_edit_phone;

    @FXML
    private Button allStudent_edit_save;

    @FXML
    private TextField allStudent_edit_ssc;

    @FXML
    private ComboBox<?> allStudent_edit_status;

    @FXML
    private TextField allStudent_search_id;

    @FXML
    private TableColumn<?, ?> allStudent_view_dob;

    @FXML
    private TableColumn<?, ?> allStudent_view_gName;

    @FXML
    private TableColumn<?, ?> allStudent_view_gPhone;

    @FXML
    private TableColumn<?, ?> allStudent_view_gender;

    @FXML
    private TableColumn<?, ?> allStudent_view_hsc;

    @FXML
    private TableColumn<?, ?> allStudent_view_id;

    @FXML
    private TableColumn<?, ?> allStudent_view_name;

    @FXML
    private TableColumn<?, ?> allStudent_view_phone;

    @FXML
    private TableColumn<?, ?> allStudent_view_ssc;

    @FXML
    private TableColumn<?, ?> allStudent_view_status;

    @FXML
    private MenuItem allTeacher_btn;

    @FXML
    private AnchorPane all_teacher_view;

    @FXML
    private TableColumn<?, ?> all_teacher_view_bsc;

    @FXML
    private TableColumn<?, ?> all_teacher_view_dob;

    @FXML
    private TableColumn<?, ?> all_teacher_view_gender;

    @FXML
    private TableColumn<?, ?> all_teacher_view_hsc;

    @FXML
    private TableColumn<?, ?> all_teacher_view_id;

    @FXML
    private TableColumn<?, ?> all_teacher_view_msc;

    @FXML
    private TableColumn<?, ?> all_teacher_view_name;

    @FXML
    private TableColumn<?, ?> all_teacher_view_phone;

    @FXML
    private TextField all_teacher_view_search_id;

    @FXML
    private TextField all_teacher_view_search_name;

    @FXML
    private TableColumn<?, ?> all_teacher_view_ssc;

    @FXML
    private TableColumn<?, ?> all_teacher_view_status;

    @FXML
    private AnchorPane availableCourse;

    @FXML
    private TableColumn<?, ?> availableCourseView_code;

    @FXML
    private TableColumn<?, ?> availableCourseView_credit;

    @FXML
    private TableColumn<?, ?> availableCourseView_name;

    @FXML
    private TableColumn<?, ?> availableCourseView_sl;

    @FXML
    private TableColumn<?, ?> availableCourseView_teacher;

    @FXML
    private TableColumn<?, ?> availableCourseView_teacherName;

    @FXML
    private TableColumn<?, ?> availableCourseView_type;

    @FXML
    private Button availableCourse_add;

    @FXML
    private Button availableCourse_clear;

    @FXML
    private TextField availableCourse_course;

    @FXML
    private TextField availableCourse_courseCode;

    @FXML
    private Button availableCourse_delete;

    @FXML
    private ComboBox<?> availableCourse_semester;

    @FXML
    private TextField availableCourse_teacher;

    @FXML
    private ComboBox<?> availableCourse_type;

    @FXML
    private Button availableCourse_update;

    @FXML
    private Button home_btn;

    @FXML
    private TextField marks_insert_assignment;

    @FXML
    private TextField marks_insert_attendance;

    @FXML
    private TextField marks_insert_course_code;

    @FXML
    private TextField marks_insert_final;

    @FXML
    private TextField marks_insert_quiz;

    @FXML
    private ComboBox<?> marks_insert_semester;

    @FXML
    private TextField marks_search_id;

    @FXML
    private Button marks_update;

    @FXML
    private TableColumn<?, ?> marks_view_assignment;

    @FXML
    private TableColumn<?, ?> marks_view_attendance;

    @FXML
    private TableColumn<?, ?> marks_view_course_code;

    @FXML
    private TableColumn<?, ?> marks_view_final;

    @FXML
    private TableColumn<?, ?> marks_view_id;

    @FXML
    private TableColumn<?, ?> marks_view_name;

    @FXML
    private TableColumn<?, ?> marks_view_quiz;

    @FXML
    private AnchorPane semester;

    @FXML
    private Button semester_add;

    @FXML
    private ComboBox<?> semester_season;

    @FXML
    private Button semester_update;

    @FXML
    private TableColumn<?, ?> semester_view_season;

    @FXML
    private TableColumn<?, ?> semester_view_semester;

    @FXML
    private TableColumn<?, ?> semester_view_sl;

    @FXML
    private TableColumn<?, ?> semester_view_year;

    @FXML
    private TextField semester_year;

    @FXML
    private Button student_reg_add;

    @FXML
    private DatePicker student_reg_dob;

    @FXML
    private ComboBox<?> student_reg_gender;

    @FXML
    private TextField student_reg_gurdianName;

    @FXML
    private TextField student_reg_gurdianPhone;

    @FXML
    private TextField student_reg_hsc;

    @FXML
    private TextField student_reg_id;

    @FXML
    private TextField student_reg_name;

    @FXML
    private TextField student_reg_phone;

    @FXML
    private TextField student_reg_ssc;

    @FXML
    private ComboBox<?> student_reg_status;

    @FXML
    private AnchorPane student_registration;

    @FXML
    private AnchorPane teacher_edit;

    @FXML
    private TextField teacher_edit_bsc;

    @FXML
    private Button teacher_edit_delete;

    @FXML
    private DatePicker teacher_edit_dob;

    @FXML
    private ComboBox<?> teacher_edit_gender;

    @FXML
    private TextField teacher_edit_hsc;

    @FXML
    private TextField teacher_edit_msc;

    @FXML
    private TextField teacher_edit_name;

    @FXML
    private TextField teacher_edit_phone;

    @FXML
    private TextField teacher_edit_search_id;

    @FXML
    private TextField teacher_edit_ssc;

    @FXML
    private ComboBox<?> teacher_edit_status;

    @FXML
    private Button teacher_edit_update;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_bsc;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_dob;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_gender;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_hsc;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_id;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_msc;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_name;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_phone;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_ssc;

    @FXML
    private TableColumn<?, ?> teacher_edit_view_status;

    @FXML
    private Button teacher_reg_add;

    @FXML
    private TextField teacher_reg_bsc;

    @FXML
    private DatePicker teacher_reg_dob;

    @FXML
    private ComboBox<?> teacher_reg_gender;

    @FXML
    private TextField teacher_reg_hsc;

    @FXML
    private TextField teacher_reg_id;

    @FXML
    private TextField teacher_reg_msc;

    @FXML
    private TextField teacher_reg_name;

    @FXML
    private TextField teacher_reg_phone;

    @FXML
    private TextField teacher_reg_ssc;

    @FXML
    private ComboBox<?> teacher_reg_status;

    @FXML
    private AnchorPane teacher_registration;

    @FXML
    private AnchorPane viewStudent;

    @FXML
    private MenuItem viewStudent_btn;

    @FXML
    private TableColumn<?, ?> viewStudent_dob;

    @FXML
    private TableColumn<?, ?> viewStudent_gName;

    @FXML
    private TableColumn<?, ?> viewStudent_gender;

    @FXML
    private TableColumn<?, ?> viewStudent_gphone;

    @FXML
    private TableColumn<?, ?> viewStudent_hsc;

    @FXML
    private TableColumn<?, ?> viewStudent_id;

    @FXML
    private TableColumn<?, ?> viewStudent_name;

    @FXML
    private TableColumn<?, ?> viewStudent_phone;

    @FXML
    private TextField viewStudent_searchId;

    @FXML
    private TextField viewStudent_searchName;

    @FXML
    private ComboBox<?> viewStudent_searchSemester;

    @FXML
    private TableColumn<?, ?> viewStudent_ssc;

    @FXML
    private TableColumn<?, ?> viewStudent_status;

    @FXML
    private MenuItem viewTeacher_btn;

    // Method to close the screen
    @FXML
    void close(ActionEvent event) {
        Common.close();
    }

    // Method to minimize screen
    public void minimize(){
        Stage stage = (Stage) admin.getScene().getWindow();
        stage.setIconified(true);
    }

    // Method to change the inner interface
    public void switchScreen(ActionEvent event) {
        if(event.getSource() == home_btn) {
            admin.setVisible(true);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_student_btn_all) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(true);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_student_btn_view) {
            admin.setVisible(false);
            allStudent.setVisible(true);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_student_btn_add) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(true);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_teacher_btn_all) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(true);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_teacher_btn_view) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(true);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_teacher_btn_add) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(true);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_available_btn) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(true);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_marks_btn) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(true);
            availableCourse.setVisible(false);
            semester.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
        } else if (event.getSource() == admin_create_semester_btn) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(true);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
        }
    }

    // Method to logout
    public void logout() {
        try {
            Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to log out");

            if(option.get().equals(ButtonType.OK)) {
                // Hide dashboard screen
                admin.getScene().getWindow().hide();

                // Switch to login screen
                changeScreen("view/login.fxml");
            } else return;
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void changeScreen(String view) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(view));

        Stage stage = new Stage();
        Scene scene = new Scene(root);

        root.setOnMousePressed((MouseEvent event) -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getSceneX() - x);
            stage.setY(event.getSceneY() - y);

            stage.setOpacity(1);
        });

        root.setOnMouseReleased((MouseEvent event) -> {
            stage.setOpacity(1);
        });

        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
