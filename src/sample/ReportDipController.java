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
import java.util.ResourceBundle;

public class ReportDipController implements Initializable {

    @FXML
    private TextField reportNameD;
    @FXML
    private TextField reportNumberD;
    @FXML
    private static TextField reportAwardD;
    @FXML
    private TextField reportClassD;
    @FXML
    private TextField reportScoreD;
    @FXML
    private TextField reportCreditsD;
    @FXML
    Button btnClick1, btnClick2;

    Student student = new Student();

    public static void FieldreportAward(String text) {
        reportAwardD.setText(text);

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
    System.out.println("Total " + (student.getCreditsL5()));
        //Calculating the indicator score
        int scoreL5 = (student.getLevel5Mod1()+student.getLevel5Mod2()+student.getLevel5Mod3()
                +student.getLevel5Mod4()+student.getLevel5Mod5() +student.getLevel5Mod6())/6;
        int scoreL4 = (student.getLevel4Mod1()+student.getLevel4Mod2()+student.getLevel4Mod3()
                +student.getLevel4Mod4()+student.getLevel4Mod5() +student.getLevel4Mod6())/6;
        int score = (scoreL4+scoreL5)/2;

        reportNameD.setText(student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase());
        reportNumberD.setText(student.getIndexNumber());
        reportAwardD.setText("Diploma in Higher Education (Dip.HE)");
        reportScoreD.setText(String.valueOf(score));
        reportCreditsD.setText(String.valueOf(student.getCreditsL4()+student.getCreditsL5()));

            if (score >= 70) {
                reportClassD.setText("Distinction");
            }else if (score>=60){
                reportClassD.setText("Merit");
            }else{
                reportClassD.setText("Ordinary Pass");
            }
    }
}



