package diu.edu.bd.gradingpolicy;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.security.auth.callback.Callback;
import java.io.*;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    private TableColumn<TeacherData, String> all_teacher_view_bsc;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_gender;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_hsc;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_id;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_msc;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_name;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_phone;

    @FXML
    private TextField all_teacher_view_search_id;

    @FXML
    private TextField all_teacher_view_search_name;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_ssc;

    @FXML
    private TableColumn<TeacherData, String> all_teacher_view_status;

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
    private TableColumn<SemesterData, String> semester_view_season;

    @FXML
    private TableColumn<SemesterData, String> semester_view_semester;

    @FXML
    private TableColumn<SemesterData, String> semester_view_year;

    @FXML
    private TextField semester_year;

    @FXML
    private Button student_reg_add;

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
    private TableColumn<StudentData, String> viewStudent_gName;

    @FXML
    private TableColumn<StudentData, String> viewStudent_gender;

    @FXML
    private TableColumn<StudentData, String> viewStudent_gphone;

    @FXML
    private TableColumn<StudentData, String> viewStudent_hsc;

    @FXML
    private TableColumn<StudentData, String> viewStudent_id;

    @FXML
    private TableColumn<StudentData, String> viewStudent_name;

    @FXML
    private TableColumn<StudentData, String> viewStudent_phone;

    @FXML
    private TextField viewStudent_searchId;

    @FXML
    private TextField viewStudent_searchName;

    @FXML
    private ComboBox<?> viewStudent_searchSemester;

    @FXML
    private TableColumn<SemesterData, String> viewStudent_ssc;

    @FXML
    private TableColumn<SemesterData, String> viewStudent_status;

    @FXML
    private MenuItem viewTeacher_btn;

    @FXML
    private TableView<StudentData> studentAllTableView;

    @FXML
    private TableView<StudentData> editViewTable;

    @FXML
    private TableView<SemesterData> viewSemesterTableView;

    @FXML
    private Button semester_clear;

    @FXML
    private TableView<TeacherData> teacherViewTableShow;

    @FXML
    private TableView<TeacherData> teacherEditTableView;

    // ***********************************I
    // ******* Basic Initial Work ********
    // ***********************************I

    // Method to close the screen
    @FXML
    void close(ActionEvent event) {
        Common.close();
    }

    @FXML
    private TableView<CourseData> courseTableView;

    @FXML
    private Button admin_assign_course;


    @FXML
    private AnchorPane assign_AncorView;

    // Method to minimize screen
    public void minimize(){
        Stage stage = (Stage) admin.getScene().getWindow();
        stage.setIconified(true);
    }

    // Method to change the inner interface
    public void switchScreen(ActionEvent event) throws FileNotFoundException, ParseException {
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");

            // To become update when clicked
            setAddStudentsShowListData();
            addGender();
            addStatusList();
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");

            setAddTeacherShowListData ();
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");

            addCourseType();
            addSemesterToSelectBox();
            setAddCourseShowListData();
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
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
            assign_AncorView.setVisible(false);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");

            addSemesterList();
            setAddSemesterShowListData();
        } else if (event.getSource() == admin_assign_course) {
            admin.setVisible(false);
            allStudent.setVisible(false);
            viewStudent.setVisible(false);
            student_registration.setVisible(false);
            all_teacher_view.setVisible(false);
            teacher_edit.setVisible(false);
            teacher_registration.setVisible(false);
            admin_marks.setVisible(false);
            availableCourse.setVisible(false);
            semester.setVisible(false);
            assign_AncorView.setVisible(true);

            // Active Style
            home_btn.setStyle("-fx-background-color: #fff");
            admin_student_btn.setStyle("-fx-background-color: #fff");
            admin_teacher_btn.setStyle("-fx-background-color: #fff");
            admin_available_btn.setStyle("-fx-background-color: #fff");
            admin_marks_btn.setStyle("-fx-background-color: #fff");
            admin_create_semester_btn.setStyle("-fx-background-color: #fff");
            admin_assign_course.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");

            addCourseToSelectBox();
            setAddCourseAssignShowListData();
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

    // ***********************************
    // ************* Students ************
    // ***********************************

    private String[] genderList = {"Male", "Female", "Others"};
    public void addGender() {
        List<String> genderArrayList = new ArrayList<>();

        for (String data : genderList)
            genderArrayList.add(data);

        ObservableList obList = FXCollections.observableArrayList(genderArrayList);
        allStudent_edit_gender.setItems(obList);
        student_reg_gender.setItems(obList);
        teacher_reg_gender.setItems(obList);
        teacher_edit_gender.setItems(obList);
    }

    private String[] statusList = {"Active", "Inactive", "Suspended"};
    public void addStatusList() {
        List<String> statusArrayLise = new ArrayList<>();

        for (String data : statusList)
            statusArrayLise.add(data);

        ObservableList obList = FXCollections.observableArrayList(statusArrayLise);
        allStudent_edit_status.setItems(obList);
        student_reg_status.setItems(obList);
        teacher_reg_status.setItems(obList);
        teacher_edit_status.setItems(obList);
    }

    public ObservableList<StudentData> addStudentListData() throws FileNotFoundException {

        File studentFile = null;

        ObservableList<StudentData> listStudents = FXCollections.observableArrayList();

        studentFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv");
        Scanner studentFileReader = new Scanner(studentFile);

        while (studentFileReader.hasNextLine()) {

            StudentData studentData;

            String row = studentFileReader.nextLine();
            String[] data = row.split(",");

            studentData = new StudentData(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]);

            listStudents.add(studentData);
        }
        return listStudents;
    }

    private ObservableList<StudentData> addStudentListD;
    public void setAddStudentsShowListData () throws FileNotFoundException, ParseException {
        addStudentListD = addStudentListData();

        viewStudent_id.setCellValueFactory(new PropertyValueFactory<>("userId"));
        allStudent_view_id.setCellValueFactory(new PropertyValueFactory<>("userId"));
        viewStudent_name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        allStudent_view_name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        viewStudent_gender.setCellValueFactory(new PropertyValueFactory<>("userGender"));
        allStudent_view_gender.setCellValueFactory(new PropertyValueFactory<>("userGender"));
        viewStudent_phone.setCellValueFactory(new PropertyValueFactory<>("userPhone"));
        allStudent_view_phone.setCellValueFactory(new PropertyValueFactory<>("userPhone"));
        viewStudent_ssc.setCellValueFactory(new PropertyValueFactory<>("userSSC"));
        allStudent_view_ssc.setCellValueFactory(new PropertyValueFactory<>("userSSC"));
        viewStudent_hsc.setCellValueFactory(new PropertyValueFactory<>("userHSC"));
        allStudent_view_hsc.setCellValueFactory(new PropertyValueFactory<>("userHSC"));
        viewStudent_gName.setCellValueFactory(new PropertyValueFactory<>("studentGuardianName"));
        allStudent_view_gName.setCellValueFactory(new PropertyValueFactory<>("studentGuardianName"));
        viewStudent_gphone.setCellValueFactory(new PropertyValueFactory<>("studentGuardianPhone"));
        allStudent_view_gPhone.setCellValueFactory(new PropertyValueFactory<>("studentGuardianPhone"));
        viewStudent_status.setCellValueFactory(new PropertyValueFactory<>("userStatus"));
        allStudent_view_status.setCellValueFactory(new PropertyValueFactory<>("userStatus"));

        studentAllTableView.setItems(addStudentListD);
        editViewTable.setItems(addStudentListD);
    }

    public void addStudentSelect() {
        StudentData studentData = editViewTable.getSelectionModel().getSelectedItem();
        int num = editViewTable.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        allStudent_edit_name.setText(String.valueOf(studentData.getUserName()));
        allStudent_edit_phone.setText(String.valueOf(studentData.getUserPhone()));
        allStudent_edit_ssc.setText(String.valueOf(studentData.getUserSSC()));
        allStudent_edit_hsc.setText(String.valueOf(studentData.getUserHSC()));
        allStudent_edit_gName.setText(String.valueOf(studentData.getStudentGuardianName()));
        allStudent_edit_gPhone.setText(String.valueOf(studentData.getStudentGuardianPhone()));

        allStudent_edit_gender.setPromptText(String.valueOf(studentData.getUserGender()));
        allStudent_edit_status.setPromptText(String.valueOf(studentData.getUserStatus()));

    }

    public void addStudentData() throws IOException, ParseException {
        FileWriter fw = null;
        FileWriter userCreate = null;
        BufferedWriter bw = null;
        BufferedWriter userCreateBuffer = null;
        PrintWriter pw = null;
        PrintWriter userCreatePrintWriter = null;

        try {
            fw = new FileWriter("src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv", true);
            userCreate = new FileWriter("src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv", true);
            bw = new BufferedWriter(fw);
            userCreateBuffer = new BufferedWriter(userCreate);
            pw = new PrintWriter(bw);
            userCreatePrintWriter = new PrintWriter(userCreateBuffer);

            if (student_reg_id.getText().isEmpty() || student_reg_name.getText().isEmpty() || student_reg_phone.getText().isEmpty() || student_reg_ssc.getText().isEmpty() || student_reg_hsc.getText().isEmpty() || student_reg_gurdianName.getText().isEmpty() || student_reg_gurdianPhone.getText().isEmpty()) {
                Common.alertError("Error Message", "Please fill up all blank fields.");
            } else {
                pw.println(student_reg_id.getText() + "," + student_reg_name.getText() + "," + student_reg_gender.getValue() + "," + student_reg_phone.getText() + "," + student_reg_ssc.getText() + "," + student_reg_hsc.getText() + "," + student_reg_gurdianName.getText() + "," + student_reg_gurdianPhone.getText() + "," + student_reg_status.getValue());
                userCreatePrintWriter.println(student_reg_id.getText() + "," + "Student" + "," + student_reg_id.getText());
                Common.alertInfo("Information Message", "Student Create Successfully!");
                Common.alertInfo("Information Message", "Student account also created successfully!");
            }
            pw.flush();
            userCreatePrintWriter.flush();

        } finally {
            try {
                pw.close();
                userCreatePrintWriter.close();
                bw.close();
                userCreateBuffer.close();
                fw.close();
                userCreate.close();
            } catch (IOException io) {
                System.out.println("Something went wrong!");
            }
            clearStudentAddViewData();
            setAddStudentsShowListData();
        }
    }

    public void clearStudentAddViewData() {
        student_reg_id.setText("");
        student_reg_name.setText("");
        student_reg_gender.setPromptText("Choose");
        student_reg_phone.setText("");
        student_reg_ssc.setText("");
        student_reg_hsc.setText("");
        student_reg_gurdianName.setText("");
        student_reg_gurdianPhone.setText("");
        student_reg_status.setPromptText("Choose");
    }

    public void clearStudentEditSection() {
        allStudent_edit_name.setText("");
        allStudent_edit_gender.setPromptText("Choose");
        allStudent_edit_phone.setText("");
        allStudent_edit_status.setPromptText("Choose");
        allStudent_edit_ssc.setText("");
        allStudent_edit_hsc.setText("");
        allStudent_edit_gName.setText("");
        allStudent_edit_gPhone.setText("");
    }

    public void updateStudentData() throws IOException, ParseException {

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/students.csv";
        String tempFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/tempStudents.csv";

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        StudentData studentData = editViewTable.getSelectionModel().getSelectedItem();
        int num = editViewTable.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        String oldUserId = String.valueOf(studentData.getUserId());

        String newUserName = allStudent_edit_name.getText();
        String newUserGender = (String) allStudent_edit_gender.getValue();
        String newUserPhone = allStudent_edit_phone.getText();
        String newUserSSC = allStudent_edit_ssc.getText();
        String newUserHSC = allStudent_edit_hsc.getText();
        String newUserGName = allStudent_edit_gName.getText();
        String newUserGPhone = allStudent_edit_gPhone.getText();
        String newUserStatus = (String) allStudent_edit_status.getValue();

        FileWriter fw = new FileWriter(tempFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        sca = new Scanner(new File(filePath));
        sca.useDelimiter("[,\n]");

        Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to Update Student Data!");

        if(option.get().equals(ButtonType.OK)) {

            String ID = null;

            while (sca.hasNextLine()) {

                String row = sca.nextLine();
                String[] data = row.split(",");

                ID = data[0];

                if (ID.contains(oldUserId))
                {
                    pw.println(oldUserId + "," + newUserName + "," + newUserGender + "," + newUserPhone + "," + newUserSSC + "," + newUserHSC + "," + newUserGName + "," + newUserGPhone + "," + newUserStatus);
                }
                else
                    pw.println(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6] + "," + data[7] + "," + data[8]);
            }
            sca.close();
            oldFile.delete();

            pw.flush();
            pw.close();

            File rename = new File(filePath);
            newFile.renameTo(rename);

            Common.alertInfo("Information Message", "Student update successfully");
        } else return;
        clearStudentEditSection();
        setAddStudentsShowListData();
    }

    // ***********************************
    // ************* Semester ************
    // ***********************************

    private String[] semesterList = {"Spring", "Summer", "Fall"};
    public void addSemesterList() {
        List<String> semesterArrayList = new ArrayList<>();

        for (String data : semesterList)
            semesterArrayList.add(data);

        ObservableList obList = FXCollections.observableArrayList(semesterArrayList);
        semester_season.setItems(obList);
    }

    public ObservableList<SemesterData> addSemesterListData() throws FileNotFoundException, ParseException {

        File semesterFile = null;

        ObservableList<SemesterData> listSemester = FXCollections.observableArrayList();

        semesterFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/semesters.csv");
        Scanner semesterFileReader = new Scanner(semesterFile);

        while (semesterFileReader.hasNextLine()) {

            SemesterData semesterData;

            String row = semesterFileReader.nextLine();
            String[] data = row.split(",");

            semesterData = new SemesterData(data[0], data[1]);

            listSemester.add(semesterData);
        }
        return listSemester;
    }

    private ObservableList<SemesterData> addSemesterListD;
    public void setAddSemesterShowListData () throws FileNotFoundException, ParseException  {

        addSemesterListD = addSemesterListData();

        semester_view_season.setCellValueFactory(new PropertyValueFactory<>("semester_season"));
        semester_view_year.setCellValueFactory(new PropertyValueFactory<>("semester_year"));
        semester_view_semester.setCellValueFactory(new PropertyValueFactory<>("semesterCombo"));

        viewSemesterTableView.setItems(addSemesterListD);
    }

    public void addSemesterSelect() {
        SemesterData semesterData = viewSemesterTableView.getSelectionModel().getSelectedItem();
        int num = viewSemesterTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        semester_season.setPromptText(String.valueOf(semesterData.getSemester_season()));
        semester_year.setText(String.valueOf(semesterData.getSemester_year()));
    }

    public void addSemesterData() throws IOException, ParseException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("src/main/resources/diu/edu/bd/gradingpolicy/csv/semesters.csv", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            if (semester_year.getText().isEmpty()) {
                Common.alertError("Error Message", "Please fill up all blank fields.");
            } else {
                pw.println(semester_season.getValue() + "," + semester_year.getText());
                Common.alertInfo("Information Message", "Semester Create Successfully.");
            }
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
                System.out.println("Something went wrong!");
            }
            setAddSemesterShowListData();
            clearSemesterData();
        }
    }

    public void clearSemesterData() {
        semester_season.setPromptText("Choose");
        semester_year.setText("");
    }
    Scanner sca = null;
    public void updateSemesterData() throws IOException, ParseException {

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/semesters.csv";
        String tempFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/temp.csv";

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        SemesterData semesterData = viewSemesterTableView.getSelectionModel().getSelectedItem();
        int num = viewSemesterTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        String oldSeason = String.valueOf(semesterData.getSemester_season());
        String oldYear = String.valueOf(semesterData.getSemester_year());
        String newSeason = (String) semester_season.getValue();
        String newYear = semester_year.getText();

        FileWriter fw = new FileWriter(tempFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        sca = new Scanner(new File(filePath));
        sca.useDelimiter("[,\n]");

        String fileSeason = null, fileYear = null;

        Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to Update Semester");

        if(option.get().equals(ButtonType.OK)) {

            while (sca.hasNextLine()) {

                String row = sca.nextLine();
                String[] data = row.split(",");

                fileSeason = data[0];
                fileYear = data[1];

                if (fileSeason.equals(oldSeason) && fileYear.equals(oldYear))
                    pw.println(newSeason + "," + newYear);
                else
                    pw.println(fileSeason + "," + fileYear);
            }
            sca.close();
            oldFile.delete();

            pw.flush();
            pw.close();

            File rename = new File(filePath);
            newFile.renameTo(rename);

            Common.alertInfo("Information Message", "Semester update successfully");

            setAddSemesterShowListData();
            clearSemesterData();
        } else return;
    }

    // ***********************************
    // ************ Teacher **************
    // ***********************************

    public void selectTeachersEdit() {
        TeacherData teacherData = teacherEditTableView.getSelectionModel().getSelectedItem();
        int num = teacherEditTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        teacher_edit_name.setText(String.valueOf(teacherData.getUserName()));
        teacher_edit_gender.setPromptText(String.valueOf(teacherData.getUserGender()));
        teacher_edit_phone.setText(String.valueOf(teacherData.getUserPhone()));
        teacher_edit_status.setPromptText(String.valueOf(teacherData.getUserStatus()));
        teacher_edit_ssc.setText(String.valueOf(teacherData.getUserSSC()));
        teacher_edit_hsc.setText(String.valueOf(teacherData.getUserHSC()));
        teacher_edit_bsc.setText(String.valueOf(teacherData.getTeacherBSC()));
        teacher_edit_msc.setText(String.valueOf(teacherData.getTeacherMSC()));
    }

    public ObservableList<TeacherData> addTeacherListData() throws FileNotFoundException {

        File teacherFile = null;

        ObservableList<TeacherData> listTeacher = FXCollections.observableArrayList();

        teacherFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv");
        Scanner teacherFileReader = new Scanner(teacherFile);

        while (teacherFileReader.hasNextLine()) {

            TeacherData teacherData;

            String row = teacherFileReader.nextLine();
            String[] data = row.split(",");

            teacherData = new TeacherData(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]);

            listTeacher.add(teacherData);
        }
        return listTeacher;
    }

    private ObservableList<TeacherData> addTeacherListD;
    public void setAddTeacherShowListData () throws FileNotFoundException, ParseException {
        addTeacherListD = addTeacherListData();

        all_teacher_view_id.setCellValueFactory(new PropertyValueFactory<>("userId"));
        teacher_edit_view_id.setCellValueFactory(new PropertyValueFactory<>("userId"));
        all_teacher_view_name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        teacher_edit_view_name.setCellValueFactory(new PropertyValueFactory<>("userName"));
        all_teacher_view_gender.setCellValueFactory(new PropertyValueFactory<>("userGender"));
        teacher_edit_view_gender.setCellValueFactory(new PropertyValueFactory<>("userGender"));
        all_teacher_view_phone.setCellValueFactory(new PropertyValueFactory<>("userPhone"));
        teacher_edit_view_phone.setCellValueFactory(new PropertyValueFactory<>("userPhone"));
        all_teacher_view_ssc.setCellValueFactory(new PropertyValueFactory<>("userSSC"));
        teacher_edit_view_ssc.setCellValueFactory(new PropertyValueFactory<>("userSSC"));
        all_teacher_view_hsc.setCellValueFactory(new PropertyValueFactory<>("userHSC"));
        teacher_edit_view_hsc.setCellValueFactory(new PropertyValueFactory<>("userHSC"));
        all_teacher_view_bsc.setCellValueFactory(new PropertyValueFactory<>("teacherBSC"));
        teacher_edit_view_bsc.setCellValueFactory(new PropertyValueFactory<>("teacherBSC"));
        all_teacher_view_msc.setCellValueFactory(new PropertyValueFactory<>("teacherMSC"));
        teacher_edit_view_msc.setCellValueFactory(new PropertyValueFactory<>("teacherMSC"));
        all_teacher_view_status.setCellValueFactory(new PropertyValueFactory<>("userStatus"));
        teacher_edit_view_status.setCellValueFactory(new PropertyValueFactory<>("userStatus"));

        teacherViewTableShow.setItems(addTeacherListD);
        teacherEditTableView.setItems(addTeacherListD);
    }

    public void clearCreateTeacherFields() {
        teacher_reg_id.setText("");
        teacher_reg_name.setText("");
        teacher_reg_gender.setPromptText("Choose");
        teacher_reg_phone.setText("");
        teacher_reg_ssc.setText("");
        teacher_reg_hsc.setText("");
        teacher_reg_bsc.setText("");
        teacher_reg_msc.setText("");
        teacher_reg_status.setPromptText("Choose");
    }

    public void createTeacher() throws IOException {
        FileWriter teacherFile = null;
        FileWriter userFile = null;
        BufferedWriter teacherFileBuffer = null;
        BufferedWriter userFileBuffer = null;
        PrintWriter teacherFilePrint = null;
        PrintWriter userFilePrint = null;

        try {
            teacherFile = new FileWriter("src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv", true);
            userFile = new FileWriter("src/main/resources/diu/edu/bd/gradingpolicy/csv/users.csv", true);

            teacherFileBuffer = new BufferedWriter(teacherFile);
            userFileBuffer = new BufferedWriter(userFile);
            teacherFilePrint = new PrintWriter(teacherFileBuffer);
            userFilePrint = new PrintWriter(userFileBuffer);

            if (teacher_reg_id.getText().isEmpty() || teacher_reg_name.getText().isEmpty() || teacher_reg_phone.getText().isEmpty() || teacher_reg_ssc.getText().isEmpty() || teacher_reg_hsc.getText().isEmpty() || teacher_reg_bsc.getText().isEmpty() || teacher_reg_msc.getText().isEmpty()) {
                Common.alertError("Error Message", "Please fill up all blank fields.");
            } else {
                teacherFilePrint.println(teacher_reg_id.getText() + "," + teacher_reg_name.getText() + "," + teacher_reg_gender.getValue() + "," + teacher_reg_phone.getText() + "," + teacher_reg_ssc.getText() + "," + teacher_reg_hsc.getText() + "," + teacher_reg_bsc.getText() + "," + teacher_reg_msc.getText() + "," + teacher_reg_status.getValue());
                userFilePrint.println(teacher_reg_id.getText() + "," + "Teacher" + "," + teacher_reg_id.getText());

                Common.alertInfo("Information Message", "Teacher Create Successfully!");
                Common.alertInfo("Information Message", "Teacher account also created successfully!");
                clearCreateTeacherFields();
            }
            teacherFilePrint.flush();
            userFilePrint.flush();
        } finally {
            try {
                teacherFile.close();
                userFile.close();
                teacherFileBuffer.close();
                userFileBuffer.close();
                teacherFilePrint.close();
                userFilePrint.close();
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    public void updateTeacherData() throws IOException, ParseException {

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv";
        String tempFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/tempTeacher.csv";

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        TeacherData teacherData = teacherEditTableView.getSelectionModel().getSelectedItem();
        int num = teacherEditTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        String oldUserId = String.valueOf(teacherData.getUserId());

        String newUserName = teacher_edit_name.getText();
        String newUserGender = (String) teacher_edit_gender.getValue();
        String newUserPhone = teacher_edit_phone.getText();
        String newUserSSC = teacher_edit_ssc.getText();
        String newUserHSC = teacher_edit_hsc.getText();
        String newUserBSC = teacher_edit_bsc.getText();
        String newUserMSC = teacher_edit_msc.getText();
        String newUserStatus = (String) teacher_edit_status.getValue();

        FileWriter fw = new FileWriter(tempFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        sca = new Scanner(new File(filePath));
        sca.useDelimiter("[,\n]");

        Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to Update Teacher Data!");

        if(option.get().equals(ButtonType.OK)) {

            String ID = null;

            while (sca.hasNextLine()) {

                String row = sca.nextLine();
                String[] data = row.split(",");

                ID = data[0];

                if (ID.contains(oldUserId))
                {
                    pw.println(oldUserId + "," + newUserName + "," + newUserGender + "," + newUserPhone + "," + newUserSSC + "," + newUserHSC + "," + newUserBSC + "," + newUserMSC + "," + newUserStatus);
                }
                else
                    pw.println(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6] + "," + data[7] + "," + data[8]);
            }
            sca.close();
            oldFile.delete();

            pw.flush();
            pw.close();

            File rename = new File(filePath);
            newFile.renameTo(rename);

            Common.alertInfo("Information Message", "Teacher update successfully");
        } else return;
        clearTeacherEditSelection();
        setAddTeacherShowListData();
    }

    public void clearTeacherEditSelection() {
        teacher_edit_name.setText("");
        teacher_edit_gender.setPromptText("Choose");
        teacher_edit_phone.setText("");
        teacher_edit_status.setPromptText("Choose");
        teacher_edit_ssc.setText("");
        teacher_edit_hsc.setText("");
        teacher_edit_bsc.setText("");
        teacher_edit_msc.setText("");
    }

    // ***********************************
    // ************* Course **************
    // ***********************************

    public void selectCourseEdit() {
        CourseData courseData = courseTableView.getSelectionModel().getSelectedItem();
        int num = courseTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        availableCourse_course.setText(String.valueOf(courseData.getCourseName()));
        availableCourse_courseCode.setText(String.valueOf(courseData.getCourseCode()));
        availableCourse_semester.setPromptText(String.valueOf(courseData.getSemester()));
        availableCourse_type.setPromptText(String.valueOf(courseData.getCourseType()));
        availableCourse_teacher.setText(String.valueOf(courseData.getTeacherId()));
    }

    Scanner scan = null;
    public void updateCourseData() throws IOException, ParseException {

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";
        String tempFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/tempCourses.csv";

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        CourseData courseData = courseTableView.getSelectionModel().getSelectedItem();
        int num = courseTableView.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        String oldCourseCode = String.valueOf(courseData.getCourseCode());
        String oldSemesterName = String.valueOf(courseData.getSemester());

        String newCourseName = availableCourse_course.getText();
        String newCourseCode = availableCourse_courseCode.getText();
        String newCourseSemester = (String) availableCourse_semester.getValue();
        String newCourseType = (String) availableCourse_type.getValue();
        String newCourseTeacherId = availableCourse_teacher.getText();

        FileWriter fw = new FileWriter(tempFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        scan = new Scanner(new File(filePath));
        scan.useDelimiter("[,\n]");

        Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to Update Course Data!");

        if(option.get().equals(ButtonType.OK)) {

            String courseCode = null;
            String courseSemester = null;

            while (scan.hasNextLine()) {

                String row = scan.nextLine();
                String[] data = row.split(",");

                courseCode = data[1];
                courseSemester = data[2];

                if (courseCode.equals(oldCourseCode) && courseSemester.equals(oldSemesterName))
                {
                    pw.println(newCourseName + "," + newCourseCode + "," + newCourseSemester + "," + newCourseType + "," + newCourseTeacherId);
                }
                else
                    pw.println(data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4]);
            }
            scan.close();
            oldFile.delete();

            pw.flush();
            pw.close();

            File rename = new File(filePath);
            newFile.renameTo(rename);

            Common.alertInfo("Information Message", "Teacher update successfully");
        } else return;
        courseClear();
        setAddCourseShowListData();
    }

    private String[] courseTypeList = {"Theory", "Lab"};
    public void addCourseType() {
        List<String> courseTypeArrayList = new ArrayList<>();

        for (String data : courseTypeList)
            courseTypeArrayList.add(data);

        ObservableList observableList = FXCollections.observableArrayList(courseTypeArrayList);
        availableCourse_type.setItems(observableList);
    }

    public void addSemesterToSelectBox() throws FileNotFoundException {
        List<String> semesterArrayList = new ArrayList<>();

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/semesters.csv";
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter("[,\n]");

        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] data = row.split(",");

            semesterArrayList.add(data[0] + " " + data[1]);
        }
        scanner.close();
        ObservableList observableList = FXCollections.observableArrayList(semesterArrayList);
        availableCourse_semester.setItems(observableList);
        courseAssign_courseSemester.setItems(observableList);
    }

    public ObservableList<CourseData> addCourseListData() throws FileNotFoundException {

        File courseFile = null;

        ObservableList<CourseData> listCourse = FXCollections.observableArrayList();

        courseFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv");
        Scanner courseFileReader = new Scanner(courseFile);

        while (courseFileReader.hasNextLine()) {

            CourseData courseData;

            String row = courseFileReader.nextLine();
            String[] data = row.split(",");

            courseData = new CourseData(data[1],
                    data[0],
                    data[2],
                    data[3],
                    data[4]);

            listCourse.add(courseData);
        }
        return listCourse;
    }

    private ObservableList<CourseData> addCourseListD;
    public void setAddCourseShowListData () throws FileNotFoundException, ParseException {
        addCourseListD = addCourseListData();

        availableCourseView_code.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        availableCourseView_name.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        availableCourseView_type.setCellValueFactory(new PropertyValueFactory<>("courseType"));
        availableCourseView_credit.setCellValueFactory(new PropertyValueFactory<>("courseCredit"));
        availableCourseView_teacher.setCellValueFactory(new PropertyValueFactory<>("teacherId"));
        availableCourseView_teacherName.setCellValueFactory(new PropertyValueFactory<>("teacherName"));

        courseTableView.setItems(addCourseListD);
    }

    public void courseClear() {
        availableCourse_course.setText("");
        availableCourse_courseCode.setText("");
        availableCourse_semester.setPromptText("Choose Semester");
        availableCourse_type.setPromptText("Theory/Lab");
        availableCourse_teacher.setText("");
    }

    public void addCourses() throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";

        try {
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            if(availableCourse_course.getText().isEmpty() || availableCourse_courseCode.getText().isEmpty() || availableCourse_teacher.getText().isEmpty())
                Common.alertError("Error Message", "Please fill up all blank fields");
            else {
                printWriter.println(availableCourse_course.getText() + "," + availableCourse_courseCode.getText() + "," + availableCourse_semester.getValue() + "," + availableCourse_type.getValue() + "," + availableCourse_teacher.getText());

                courseClear();
                Common.alertInfo("Information Message", "Course Created Successfully");
            }
            printWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
            printWriter.close();
            setAddCourseShowListData();
        } catch (IOException e) {
            throw new IOException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // ***********************************
    // ********** Course Assign **********
    // ***********************************

    @FXML
    private TableView<CourseAssignData> assign_ViewTable;

    @FXML
    private ComboBox<?> courseAssign_courseCode;

    @FXML
    private TextField courseAssgn_studentId;

    @FXML
    private ComboBox<?> courseAssign_courseSemester;

    @FXML
    private TableColumn<CourseAssignData, String> assign_codeCode;

    @FXML
    private TableColumn<CourseAssignData, String> assign_semester;

    @FXML
    private TableColumn<CourseAssignData, String> assign_courseName;

    @FXML
    private TableColumn<CourseAssignData, String> assign_studentId;

    @FXML
    private TableColumn<CourseAssignData, String> assign_studentName;

    @FXML
    private TableColumn<CourseAssignData, String> assign_teacherId;

    @FXML
    private TableColumn<CourseAssignData, String> assign_teacherName;

    public ObservableList<CourseAssignData> addCourseAssignListData() throws FileNotFoundException {

        File courseFileAssign = null;

        ObservableList<CourseAssignData> listCourseAssign = FXCollections.observableArrayList();

        courseFileAssign = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/courseAssign.csv");
        Scanner courseAssignFileReader = new Scanner(courseFileAssign);

        while (courseAssignFileReader.hasNextLine()) {

            CourseAssignData courseAssignData;

            String row = courseAssignFileReader.nextLine();
            String[] data = row.split(",");

            courseAssignData = new CourseAssignData(data[0],
                    data[1],
                    data[2]);

            listCourseAssign.add(courseAssignData);
        }
        return listCourseAssign;
    }

    private ObservableList<CourseAssignData> addCourseAssignListD;
    public void setAddCourseAssignShowListData () throws FileNotFoundException, ParseException {
        addCourseAssignListD = addCourseAssignListData();

        assign_codeCode.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        assign_semester.setCellValueFactory(new PropertyValueFactory<>("semester"));
        assign_courseName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        assign_studentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        assign_studentName.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        assign_teacherId.setCellValueFactory(new PropertyValueFactory<>("teacherId"));
        assign_teacherName.setCellValueFactory(new PropertyValueFactory<>("teacherName"));

        assign_ViewTable.setItems(addCourseAssignListD);
    }

    public void selectCourseAssignEdit() {
        CourseAssignData courseAssignData = assign_ViewTable.getSelectionModel().getSelectedItem();
        int num = assign_ViewTable.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        courseAssign_courseCode.setPromptText(String.valueOf(courseAssignData.getCourseCode()));
        courseAssgn_studentId.setText(String.valueOf(courseAssignData.getStudentId()));
        courseAssign_courseSemester.setPromptText(String.valueOf(courseAssignData.getSemester()));
    }

    public void clearCourseAssign() {
        courseAssign_courseCode.setPromptText("Choose");
        courseAssgn_studentId.setText("");
        courseAssign_courseSemester.setPromptText("Choose");
    }

    public void addCourseToSelectBox() throws FileNotFoundException {
        List<String> courseArrayList = new ArrayList<>();

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter("[,\n]");

        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] data = row.split(",");

            courseArrayList.add(data[1]);
        }
        scanner.close();
        ObservableList observableList = FXCollections.observableArrayList(courseArrayList);
        courseAssign_courseCode.setItems(observableList);
    }

    public void addCourseAssign() throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courseAssign.csv";

        try {
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            if(courseAssgn_studentId.getText().isEmpty())
                Common.alertError("Error Message", "Please fill up all blank fields");
            else {
                printWriter.println(courseAssign_courseCode.getValue() + "," + courseAssgn_studentId.getText() + "," + courseAssign_courseSemester.getValue() + 0 + 0 + 0 + 0);

                clearCourseAssign();
                Common.alertInfo("Information Message", "CourseAssign Successfully");
            }
            printWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
            printWriter.close();
            setAddCourseAssignShowListData();
        } catch (IOException | ParseException e) {
            throw new IOException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Show Immediately when we process dashboard
        try {
            setAddStudentsShowListData();
            addGender();
            addStatusList();
            addSemesterList();
            setAddSemesterShowListData();
            clearSemesterData();
            updateSemesterData();
            clearStudentAddViewData();
            updateStudentData();
            setAddTeacherShowListData();
            addCourseType();
            addSemesterToSelectBox();
            setAddCourseShowListData();
            addCourseToSelectBox();
            setAddCourseAssignShowListData();
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
