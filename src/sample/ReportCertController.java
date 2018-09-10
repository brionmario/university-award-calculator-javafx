package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class ReportCertController implements Initializable {

    @FXML
    private TextField reportNameC;
    @FXML
    private TextField reportNumberC;
    @FXML
    private static TextField reportAwardC;
    @FXML
    private TextField reportClassC;
    @FXML
    private TextField reportScoreC;
    @FXML
    private TextField reportCreditsC;
    @FXML
    Button btnClick1, btnClick2;

    Student student = new Student();

    public static void FieldreportAward(String text) {
        reportAwardC.setText(text);

    }

    @FXML
    private void handlebtnClick1(ActionEvent event) throws IOException {

        Parent root6 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene6 = new Scene(root6);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(scene6);


    }

    @FXML
    private void handlebtnClick2(ActionEvent event) throws IOException {

        Parent root7 = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        Scene scene7 = new Scene(root7);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(scene7);


    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        //Calculating the total average of level 4
        int score = (student.getLevel4Mod1()+student.getLevel4Mod2()+student.getLevel4Mod3()+student.getLevel4Mod4()
                +student.getLevel4Mod5() +student.getLevel4Mod6())/6;

        reportNameC.setText(student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase());
        reportNumberC.setText(student.getIndexNumber());
        reportAwardC.setText("Certificate in Higher Education (Cert.HE)");
        reportScoreC.setText(String.valueOf(score));
        reportCreditsC.setText(String.valueOf(student.getCreditsL4()));
            //Checking for the clss
            if (score >= 70) {
                reportClassC.setText("Distinction");
            }else if (score>=60){
                reportClassC.setText("Merit");
            }else{
                reportClassC.setText("Ordinary Pass");
            }
    }
}



