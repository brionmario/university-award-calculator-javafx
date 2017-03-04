package sample;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

    Student student = new Student();

    @FXML
    private TextField fieldUName;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField fieldPassword;
    @FXML
    private Label lblMismatch;
    @FXML
    private Button btnConfirm;
    @FXML
    private TextField fieldStuNo;
    @FXML
    private static Label lblAdmin;

    public static void setTextToLabel (String text) {
        lblAdmin.setText(text);
    }

    //Declaring and initializing a drop shadow
    DropShadow shadow = new DropShadow();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Executed when the Login Button is pressed
    @FXML
    private void handlebtnLogin(ActionEvent event) throws IOException {

        String strUName = fieldUName.getText();
        String strUPass = fieldPassword.getText();

        //Checking if the password and username is correct
      if ((strUName.equalsIgnoreCase("admin") && strUPass.equals("admin")) ||
               (strUName.equalsIgnoreCase("brion") && strUPass.equals("brion"))||
                       (strUName.equalsIgnoreCase("gugsi") && strUPass.equals("gugsi")) ) {
          //Switchin the scene
            Parent root1 = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            Scene scene1 = new Scene(root1);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle("UNIVERSITY OF GUGSI - Welcome");
            primaryStage.setScene(scene1);
            primaryStage.show();
            Controller.setTextToLabel(strUName.toUpperCase());

        }else{
          //setting the error label
            lblMismatch.setText("Username and Password mismatch. Please try again. \n " +
                    "Use \"admin\" , \"gugsi\" or \"brion\"  as the default username " +
                    "and \"admin\" , \"gugsi\" or \"brion\" as the default password");
        }

    }
    @FXML
    public void handlebtnConfirm(ActionEvent event) throws IOException {

        try {


           // Integer studentNo = Integer.parseInt(fieldStuNo.getText());
          //  student.setStudentNumber(studentNo);

            Parent root2 = FXMLLoader.load(getClass().getResource("Level4.fxml"));
            Scene scene2 = new Scene(root2);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 04");
            primaryStage.setScene(scene2);
        }catch (Exception e){

        }

    }





    //A dropshadow will appear when the mouse is hovered
    @FXML
    public void handleEnter(MouseEvent e) {
        btnLogin.setEffect(shadow);

    }
    //The dropshadow will disdappear when the mouse is taken out
    @FXML
    public void handleExit(MouseEvent e) {
        btnLogin.setEffect(null);

    }
    //A dropshadow will appear when the mouse is hovered
    @FXML
    public void handleEnter1(MouseEvent e) {
        btnConfirm.setEffect(shadow);


    }
    //The dropshadow will disdappear when the mouse is taken out
    @FXML
    public void handleExit2(MouseEvent e) {
        btnConfirm.setEffect(null);

    }

}
