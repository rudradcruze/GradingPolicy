package diu.edu.bd.gradingpolicy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TeacherController implements Initializable {

    private String teacherLoginId;

    public String getTeacherLoginId() {
        return teacherLoginId;
    }

    public void setTeacherLoginId(String teacherLoginId) {
        this.teacherLoginId = teacherLoginId;
    }

    public void setIdOfTeacher(String teacherId) {
        setTeacherLoginId(teacherId);
    }

    private double x = 0;
    private double y = 0;

    @FXML
    private Label teacherShowId;

    @FXML
    private AnchorPane admin_marks;

    @FXML
    private Button admin_marks_btn;

    @FXML
    private Label admin_student;

    @FXML
    private TextField bsc;

    @FXML
    private Button home_btn;

    @FXML
    private TableView<TeacherDashboardData> marksEditViewTable_admin;

    @FXML
    private Button marks_clear;

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
    private TextField marks_insert_student_id;

    @FXML
    private TextField marks_insert_student_name;

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
    private TableColumn<?, ?> marks_view_grade;

    @FXML
    private TableColumn<?, ?> marks_view_id;

    @FXML
    private TableColumn<?, ?> marks_view_name;

    @FXML
    private TableColumn<?, ?> marks_view_quiz;

    @FXML
    private TableColumn<?, ?> marks_view_semester;

    @FXML
    private TableColumn<?, ?> marks_view_teacher_id;

    @FXML
    private TableColumn<?, ?> marks_view_total;

    @FXML
    private Label teacherName_forlogin;

    @FXML
    private AnchorPane teacher_home;

    @FXML
    private TextField teacher_home_gender;

    @FXML
    private TextField teacher_home_hsc;

    @FXML
    private TextField teacher_home_id;

    @FXML
    private TextField teacher_home_msc;

    @FXML
    private TextField teacher_home_name;

    @FXML
    private TextField teacher_home_phone;

    @FXML
    private TextField teacher_home_ssc;

    @FXML
    private TextField teacher_home_status;

    @FXML
    void close(ActionEvent event) {
        Common.close();
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

    @FXML
    void logout(ActionEvent event) {
        try {
            Optional<ButtonType> option = (Optional<ButtonType>) Common.alertConfirmationReturn("Confirm Message", "Are you sure you want to log out");

            if(option.get().equals(ButtonType.OK)) {
                // Hide dashboard screen
                teacherName_forlogin.getScene().getWindow().hide();

                // Switch to login screen
                changeScreen("view/login.fxml");
            } else return;
        } catch (Exception e) { e.printStackTrace(); }
    }

    @FXML
    void minimize(ActionEvent event) {
        Stage stage = (Stage) teacherName_forlogin.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void selectMarksAssignEdit(MouseEvent event) {

    }

    public void clearTeacherMarksViewData() {
        marks_insert_attendance.setText("");
        marks_insert_quiz.setText("");
        marks_insert_assignment.setText("");
        marks_insert_final.setText("");
        marks_insert_course_code.setText("");
        marks_insert_semester.setPromptText("");
        marks_insert_student_id.setPromptText("");
        marks_insert_student_name.setPromptText("");
    }

    public void selectTeacherViewMarksAssignEdit() {
        TeacherDashboardData teacherDashboardData = marksEditViewTable_admin.getSelectionModel().getSelectedItem();
        int num = marksEditViewTable_admin.getSelectionModel().getSelectedIndex();

        if((num -1) < -1)
            return;

        marks_insert_attendance.setText(String.valueOf(teacherDashboardData.getAttendance()));
        marks_insert_quiz.setText(String.valueOf(teacherDashboardData.getQuiz()));
        marks_insert_assignment.setText(String.valueOf(teacherDashboardData.getAssignment()));
        marks_insert_final.setText(String.valueOf(teacherDashboardData.getFinalMarks()));
        marks_insert_course_code.setText(String.valueOf(teacherDashboardData.getCourseCode()));
        marks_insert_semester.setPromptText(String.valueOf(teacherDashboardData.getSemester()));
        marks_insert_student_id.setPromptText(String.valueOf(teacherDashboardData.getStudentId()));
        marks_insert_student_name.setPromptText(String.valueOf(teacherDashboardData.getStudentName()));
    }

    public ObservableList<TeacherDashboardData> addTeacherViewTableList() throws FileNotFoundException {
        File courseAssignFile = null;

        ObservableList<TeacherDashboardData> listTeacherViewAssign = FXCollections.observableArrayList();

        courseAssignFile = new File("src/main/resources/diu/edu/bd/gradingpolicy/csv/courseAssign.csv");

        Scanner courseAssignFileReader = new Scanner(courseAssignFile);

        while (courseAssignFileReader.hasNextLine()) {

            TeacherDashboardData teacherDashboardData;

            String row = courseAssignFileReader.nextLine();
            String[] data = row.split(",");

            teacherDashboardData = new TeacherDashboardData(data[1],
                    data[0],
                    data[2],
                    Double.parseDouble(data[3]),
                    Double.parseDouble(data[4]),
                    Double.parseDouble(data[5]),
                    Double.parseDouble(data[6]));

            if (checkTeachersStudent(data[0], data[2]) == true)
                listTeacherViewAssign.add(teacherDashboardData);
        }
        return listTeacherViewAssign;
    }

    public boolean checkTeachersStudent(String sendingCourseCode, String sendingCourseSemester) throws FileNotFoundException {
        String coursesFile = "src/main/resources/diu/edu/bd/gradingpolicy/csv/courses.csv";
        Scanner scanner = new Scanner(new File(coursesFile));

        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] data = row.split(",");

            if (sendingCourseCode.equals(data[1]) && sendingCourseSemester.equals(data[2]) && data[4].equals(getTeacherLoginId()))
                return true;
        }
        return false;
    }

    private ObservableList<TeacherDashboardData> addTeacherMarksAssignListD;
    public void setAddTeacherMarksAssignShowListData() throws FileNotFoundException, ParseException {
        addTeacherMarksAssignListD = addTeacherViewTableList();

        marks_view_id.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        marks_view_teacher_id.setCellValueFactory(new PropertyValueFactory<>("teacherId"));
        marks_view_name.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        marks_view_course_code.setCellValueFactory(new PropertyValueFactory<>("courseCode"));
        marks_view_semester.setCellValueFactory(new PropertyValueFactory<>("semester"));
        marks_view_attendance.setCellValueFactory(new PropertyValueFactory<>("attendance"));
        marks_view_quiz.setCellValueFactory(new PropertyValueFactory<>("quiz"));
        marks_view_assignment.setCellValueFactory(new PropertyValueFactory<>("assignment"));
        marks_view_final.setCellValueFactory(new PropertyValueFactory<>("finalMarks"));
        marks_view_total.setCellValueFactory(new PropertyValueFactory<>("total"));

        marksEditViewTable_admin.setItems(addTeacherMarksAssignListD);
    }

    @FXML
    void switchScreen(ActionEvent event) throws FileNotFoundException, ParseException {
        if(event.getSource() == home_btn) {
            teacher_home.setVisible(true);
            admin_marks.setVisible(false);

            home_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            admin_marks_btn.setStyle("-fx-background-color: #fff");

            showTeacherData();
        }
        else if (event.getSource() == admin_marks_btn) {
            teacher_home.setVisible(false);
            admin_marks.setVisible(true);

            admin_marks_btn.setStyle("-fx-background-color: linear-gradient(to bottom right, #d789d7, #d789d7, #9d65c9, #d789d7);");
            home_btn.setStyle("-fx-background-color: #fff");

            setAddTeacherMarksAssignShowListData();
        }
    }

    public void showTeacherData() throws FileNotFoundException {
        String filePath = "src/main/resources/diu/edu/bd/gradingpolicy/csv/teachers.csv";
        Scanner teacherFile = new Scanner(new File(filePath));

        while (teacherFile.hasNextLine()) {
            String row = teacherFile.nextLine();
            String[] data = row.split(",");

            if(data[0].equals(getTeacherLoginId()))
            {
                teacher_home_name.setText(data[1]);
                teacher_home_id.setText(data[0]);
                teacher_home_gender.setText(data[2]);
                teacher_home_phone.setText(data[3]);
                teacher_home_ssc.setText(data[4]);
                teacher_home_hsc.setText(data[5]);
                bsc.setText(data[6]);
                teacher_home_msc.setText(data[7]);
                teacher_home_status.setText(data[8]);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(LoginDataSave.staticId.equals(""))
            teacherShowId.setText("Teacher id error!");
        else {
            teacherShowId.setText(LoginDataSave.staticId);
            setTeacherLoginId(LoginDataSave.staticId);
        }

        try {
            showTeacherData();
            setAddTeacherMarksAssignShowListData();
        } catch (FileNotFoundException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
