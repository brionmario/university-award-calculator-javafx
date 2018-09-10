package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;

public class ReportController implements Initializable {

    @FXML
    private TextField reportName;
    @FXML
    private TextField reportNumber;
    @FXML
    private static TextField reportAward;
    @FXML
    private TextField reportClass;
    @FXML
    private TextField reportScore;
    @FXML
    private TextField reportCredits;
    @FXML
    Button btnClick1, btnClick2;

    Student student = new Student();

    public static void FieldreportAward(String text) {
        reportAward.setText(text);

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
        System.out.println("Total " + (student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()));
        //Putting the averages in to an array to sort
        ArrayList<Integer> avg = new ArrayList<Integer>();
        avg.add(student.getLevel5Mod1());
        avg.add(student.getLevel5Mod2());
        avg.add(student.getLevel5Mod3());
        avg.add(student.getLevel5Mod4());
        avg.add(student.getLevel5Mod5());
        avg.add(student.getLevel5Mod6());

        avg.add(student.getLevel6Mod1());
        avg.add(student.getLevel6Mod2());
        avg.add(student.getLevel6Mod3());
        avg.add(student.getLevel6Mod4());
        avg.add(student.getLevel6Mod5());
        avg.add(student.getLevel6Mod6());

        //sort the arraylist
        Collections.sort(avg);

        //Calculate the sum of the averages
        int sum = 0;
        for (int i = 0; i < avg.size(); i++) {
            sum += avg.get(i);
        }
        //Calculate the indicator Score
        int score = (sum - avg.get(0)) / 11;

        reportName.setText(student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase());
        reportNumber.setText(student.getIndexNumber());
        reportScore.setText(String.valueOf(score));
        reportCredits.setText(String.valueOf(student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()));

        if ((student.getCreditsL4() + student.getCreditsL5()) == 240 && (student.getCreditsL6() >= 60
                && student.getCreditsL6() < 120)) {

            reportAward.setText("Non-Honours Degree");
            if (score >= 70) {
                reportClass.setText("Distinction");
            }else if (score>=60){
                reportClass.setText("Merit");
            }else{
                reportClass.setText("Ordinary Pass");
            }


        } else {
            reportAward.setText("Honours Degree");
            if (score >= 70) {
                reportClass.setText("1st Class Honours (1)");
            } else if (score >= 60) {
                reportClass.setText("2nd Class Honours Upper Division (2:i)");
            } else if (score >= 50) {
                reportClass.setText("2nd Class Honours Lower Division (2:ii)");
            } else if (score >= 40) {
                reportClass.setText("3rd Class Honours (3)");
            }
        }
    }
}



