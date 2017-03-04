package sample;

/* Copyrights reserved
Developed by Brion Mario
 */

//importing the required packages
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Level5Controller implements Initializable {

    //declare the combo box components inside the scene
    @FXML
    private ComboBox CBox1L5;
    @FXML
    private ComboBox CBox2L5;


    @FXML
    TextField fieldOOP1, fieldOOP2, fieldOOP3, fieldCSA1, fieldCSA2, fieldCSA3, fieldSD1, fieldSD2, fieldSD3, fieldDS1, fieldDS2,
            fieldDS3, fieldO1S1L5, fieldO2S1L5, fieldO3S1L5, fieldO1S2L5, fieldO2S2L5, fieldO3S2L5;
    @FXML
    Label lblInput;
    @FXML
    private static TextField fieldRetake1L5;
    @FXML
    private static Label lblRetake1L5;
    @FXML
    private static Label lblErrorRetake1L5;
    @FXML
    Button btnRetake1L5;
    //error label should be static coz we have to call it
    @FXML
    private static Label lblErrorL5;

    @FXML
    private static TextField fieldRetake2Mod1L5;
    @FXML
    private static TextField fieldRetake2Mod2L5;
    @FXML
    private static Label lblRetake2Mod1L5;
    @FXML
    private static Label lblRetake2Mod2L5;
    @FXML
    private static Label lblErrorRetake2L5;
    @FXML
    Button btnRetake2L5;

    @FXML
    private static TextField fieldRetake3Mod1L5;
    @FXML
    private static TextField fieldRetake3Mod2L5;
    @FXML
    private static TextField fieldRetake3Mod3L5;
    @FXML
    private static Label lblRetake3Mod1L5;
    @FXML
    private static Label lblRetake3Mod2L5;
    @FXML
    private static Label lblRetake3Mod3L5;
    @FXML
    private static Label lblErrorRetake3L5;
    @FXML
    Button btnRetake3L5;

    //ONE MODULE RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake1L5(String text) {
        lblErrorRetake1L5.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake1L5(String text) {
        lblRetake1L5.setText(text);

    }

    //THREE MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake3L5(String text) {
        lblErrorRetake3L5.setText(text);
    }

    //Create a method to store the retake 3 label 1
    public static void LabelRetake3Mod1L5(String text) {
        lblRetake3Mod1L5.setText(text);

    }
    //Create a method to store the retake 3 label 2
    public static void LabelRetake3Mod2L5(String text) {
        lblRetake3Mod2L5.setText(text);

    }
    //Create a method to store the retake 3 label 3
    public static void LabelRetake3Mod3L5(String text) {
        lblRetake3Mod3L5.setText(text);

    }

    //TWO MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake2L5(String text) {
        lblErrorRetake2L5.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod1L5(String text) {
        lblRetake2Mod1L5.setText(text);

    }
    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod2L5(String text) {
        lblRetake2Mod2L5.setText(text);

    }
    //Create an instance(object) of the student class
    Student student = new Student();

    //Create an array list to store the input
    ArrayList<Student> students = new ArrayList<Student>();

    private static int creditL5;



    //Create Arrays to hold the values inside the combo boxes

    ObservableList<String> CBox1Level5list = FXCollections.observableArrayList("CCG502 - Applied Maths & Physics",
            "CCG503 - 3D Graphics Programming");

    ObservableList<String> CBox2Level5list = FXCollections.observableArrayList("CCG506 - Mobile Application Development",
            "CCG507 - Server-side Programming");


    //Create a method to store the error label text
    public static void ErrorLabelL5(String text) {
        lblErrorL5.setText(text);
    }

    public void ErrorBoxL5(ActionEvent event) throws IOException {
        Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL5.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root8, 350, 160));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("ALERT!");
        errorStage.show();
        errorStage.setResizable(false);

    }

    //METHODS FOR 1 REATAKE WINDOW
    public void Retake1ModL5(ActionEvent event) throws IOException {

            Parent root15 = FXMLLoader.load(getClass().getResource("Retake1ModL5.fxml"));
            Stage errorStage = new Stage();
            errorStage.setScene(new Scene(root15, 438, 286));
            errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
            errorStage.setTitle("Retake");
            errorStage.show();
            errorStage.setResizable(false);


    }
    @FXML
    public void handlebtnRetake1L5(ActionEvent event) {

        try {
            Integer markRetake1 = Integer.parseInt(fieldRetake1L5.getText());
            student.setLevel5Retake1(markRetake1);
            if (student.getLevel5Retake1() >= 40 && student.getLevel5Retake1() <=100) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Level6.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 06");

                student.setCreditsL5(creditL5 +=20);
                //System.out.println(student.getCreditsL5());
            } else {
                Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL5.fxml"));
                Stage errorStage = new Stage();
                errorStage.setScene(new Scene(root8, 350, 160));
                errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                errorStage.setTitle("Alert!");
                errorStage.show();
                errorStage.setResizable(false);
                Level5Controller.ErrorLabelL5("The student haven't passed one Module. No credits will be awarded.");
                //System.out.println(student.getCreditsL5());

                Parent root4 = FXMLLoader.load(getClass().getResource("Level6.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 06");
            }
        } catch (Exception e) {

        }
    }

    //METHODS FOR 2 REATAKES WINDOW
    public void Retake2ModL5(ActionEvent event) throws IOException {

        Parent root16 = FXMLLoader.load(getClass().getResource("Retake2ModL5.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root16, 438, 308));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Two Modules - Level 05");
        errorStage.show();
        errorStage.setResizable(false);

    }
    @FXML
    public void handlebtnRetake2L5(ActionEvent event) {

        try {
            Integer markRetake2Mod1 = Integer.parseInt(fieldRetake2Mod1L5.getText());
            Integer markRetake2Mod2 = Integer.parseInt(fieldRetake2Mod2L5.getText());
            student.setLevel5Retake2Mod1(markRetake2Mod1);
            student.setLevel5Retake2Mod2(markRetake2Mod2);
            if ((student.getLevel5Retake2Mod1() >= 40 && student.getLevel5Retake2Mod1()<=100) &&
                    (student.getLevel5Retake2Mod2()>=40 && student.getLevel5Retake2Mod2()<=100)) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Level6.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 06");

                student.setCreditsL5(creditL5 +40);
                //System.out.println(student.getCreditsL5());


            }else{
                Level5Controller.ErrorLabelRetake2L5("Sorry! You are not Eligible to move on to Level 6");
            }
        } catch (Exception e) {

        }

    }

    //METHODS FOR 3 RETAKE MODULES
    public void Retake3ModL5(ActionEvent event) throws IOException {

        Parent root17 = FXMLLoader.load(getClass().getResource("Retake3ModL5.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root17, 438, 342));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Three Modules - Level 05");
        errorStage.show();
        errorStage.setResizable(false);

    }
    @FXML
    public void handlebtnRetake3L5(ActionEvent event) {

        try {
            Integer markRetake3Mod1 = Integer.parseInt(fieldRetake3Mod1L5.getText());
            Integer markRetake3Mod2 = Integer.parseInt(fieldRetake3Mod2L5.getText());
            Integer markRetake3Mod3 = Integer.parseInt(fieldRetake3Mod3L5.getText());
            student.setLevel5Retake3Mod1(markRetake3Mod1);
            student.setLevel5Retake3Mod2(markRetake3Mod2);
            student.setLevel5Retake3Mod3(markRetake3Mod3);
            if ((student.getLevel5Retake3Mod1() >= 40 && student.getLevel5Retake3Mod1() <=100)
                    && (student.getLevel5Retake3Mod2()>=40 && student.getLevel5Retake3Mod2()<=100)
                    && (student.getLevel5Retake3Mod3()>=40 && student.getLevel5Retake3Mod3()<=100)) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Level6.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 06");
                student.setCreditsL5(creditL5 +60);

            }else{
                Level5Controller.ErrorLabelRetake3L5("Sorry! You are not Eligible to move on to Level 6");
            }
        } catch (Exception e) {

        }

    }

    @FXML
    public void btnExitL5Action(ActionEvent event) throws IOException {

        System.out.println(student.getCreditsL4());
        if (student.getCreditsL4() == 120) {
            Parent root6 = FXMLLoader.load(getClass().getResource("ReportCert.fxml"));
            Scene scene6 = new Scene(root6);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene6);
        } else {
            Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL5.fxml"));
            Stage errorStage = new Stage();
            errorStage.setScene(new Scene(root8, 350, 160));
            errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
            errorStage.setTitle("Eligibility Issue");
            errorStage.show();
            errorStage.setResizable(false);
            Level5Controller.ErrorLabelL5("Sorry! You're not eligible for a Cert.HE");
        }
    }

    @FXML
    private void handlebtnProceedL5(ActionEvent event) throws IOException {

        Level5Controller controlL5 = new Level5Controller();

        try {

            //Module 01 marks
            Integer markOOP1 = Integer.parseInt(fieldOOP1.getText());
            Integer markOOP2 = Integer.parseInt(fieldOOP2.getText());
            Integer markOOP3 = Integer.parseInt(fieldOOP3.getText());

            //Module 02 marks
            Integer markCSA1 = Integer.parseInt(fieldCSA1.getText());
            Integer markCSA2 = Integer.parseInt(fieldCSA2.getText());
            Integer markCSA3 = Integer.parseInt(fieldCSA3.getText());

            //Module 03 marks
            Integer markSD1 = Integer.parseInt(fieldSD1.getText());
            Integer markSD2 = Integer.parseInt(fieldSD2.getText());
            Integer markSD3 = Integer.parseInt(fieldSD3.getText());

            //Module 04 marks
            Integer markDS1 = Integer.parseInt(fieldDS1.getText());
            Integer markDS2 = Integer.parseInt(fieldDS2.getText());
            Integer markDS3 = Integer.parseInt(fieldDS3.getText());

            //Module 05 marks
            Integer markO1S1L5 = Integer.parseInt(fieldO1S1L5.getText());
            Integer markO2S1L5 = Integer.parseInt(fieldO2S1L5.getText());
            Integer markO3S1L5 = Integer.parseInt(fieldO3S1L5.getText());

            //Module 06 marks
            Integer markO1S2L5 = Integer.parseInt(fieldO1S2L5.getText());
            Integer markO2S2L5 = Integer.parseInt(fieldO2S2L5.getText());
            Integer markO3S2L5 = Integer.parseInt(fieldO3S2L5.getText());

            student.setLevel5Mod1((markOOP1 + markOOP2 + markOOP3) / 3);
            student.setLevel5Mod2((markCSA1 + markCSA2 + markCSA3) / 3);
            student.setLevel5Mod3((markSD1 + markSD2 + markSD3) / 3);
            student.setLevel5Mod4((markDS1 + markDS2 + markDS3) / 3);
            student.setLevel5Mod5((markO1S1L5 + markO2S1L5 + markO3S1L5) / 3);
            student.setLevel5Mod6((markO1S2L5 + markO2S2L5 + markO3S2L5) / 3);




            if (fieldOOP1.getText().equals("") || fieldOOP2.getText().equals("") || fieldOOP3.getText().equals("") ||
                    fieldCSA1.getText().equals("") || fieldCSA2.getText().equals("") || fieldCSA3.getText().equals("") ||
                    fieldSD1.getText().equals("") || fieldSD2.getText().equals("") || fieldSD3.getText().equals("") ||
                    fieldDS1.getText().equals("") || fieldDS2.getText().equals("") || fieldDS3.getText().equals("") ||
                    fieldO1S1L5.getText().equals("") || fieldO2S1L5.getText().equals("") || fieldO3S1L5.getText().equals("") ||
                    fieldO1S2L5.getText().equals("") || fieldO2S2L5.getText().equals("") || fieldO3S2L5.getText().equals("")) {

            } else {

                if ((markOOP1 >= 0 && markOOP1 <= 100) && (markOOP2 >= 0 && markOOP2 <= 100) && (markOOP3 >= 0 && markOOP3 <= 100) &&
                        (markCSA1 >= 0 && markCSA1 <= 100) && (markCSA2 >= 0 && markCSA2 <= 100) && (markCSA3 >= 0 && markCSA3 <= 100) &&
                        (markSD1 >= 0 && markSD1 <= 100) && (markSD2 >= 0 && markSD2 <= 100) && (markSD3 >= 0 && markSD3 <= 100) &&
                        (markDS1 >= 0 && markDS1 <= 100) && (markDS2 >= 0 && markDS2 <= 100) && (markDS3 >= 0 && markDS3 <= 100) &&
                        (markO1S1L5 >= 0 && markO1S1L5 <= 100) && (markO2S1L5 >= 0 && markO2S1L5 <= 100) && (markO3S1L5 >= 0 && markO3S1L5 <= 100) &&
                        (markO1S2L5 >= 0 && markO1S2L5 <= 100) && (markO2S2L5 >= 0 && markO2S2L5 <= 100) && (markO3S2L5 >= 0 && markO3S2L5 <= 100)) {


                    if ((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                            && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)) {

                        Parent root4 = FXMLLoader.load(getClass().getResource("Level6.fxml"));
                        Scene scene3 = new Scene(root4);
                        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        primaryStage.setScene(scene3);
                        primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 06");

                        student.setCreditsL5(creditL5 +=120);
                        System.out.println("lev 5 " + student.getCreditsL5());
                        //System.out.println("Total " + (student.getCreditsL5()+student.getCreditsL4()));


                    } else {


                        //------------------------------------------------------------------------------------------------------
                        //------------------------------------------------------------------------------------------------------
                        //------------------------------------------------------------------------------------------------------
                        //ONE MODULE RETAKE-----------------------------------------------------------------------------------------

                        //CCS501 Retake
                        if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The module CCS501 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCS501 - Object Oriented Programming");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);
                            //System.out.println(student.getCreditsL5());



                            //ECSI400 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2()  < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The module CCS504 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCS504 - Client-Server Architecture");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);


                            //CCS503 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The module CCS503 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCS503 - Software Development Group Project");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);


                            //CCS502 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The module CCS502 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);


                            //CCG 502/503 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() < 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);


                            //CCG 506/507 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake1ModL5(event);
                            Level5Controller.ErrorLabelRetake1L5("The Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake1L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake1L5(event);

                            student.setCreditsL5(creditL5 +=100);

                            //TWO MODULES RETAKE-----------------------------------------------------------------------------------------

                            //CCS501 and CCS504 Retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS501 and CCS504 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake2Mod2L5("CCS504 - Client-Server Architecture");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);
                            //System.out.println(student.getCreditsL5());

                            //CCS501 and CCS503 Retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS501 and CCS503 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake2Mod2L5("CCS503 - Software Development Group Project");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS501 and CCS502 Retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS501 and CCS502 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake2Mod2L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS501 and OPS1 Retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >=  40) && (student.getLevel5Mod5() < 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS501 and the Optional Module for Semester 01 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake2Mod2L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS501 and OPS2 Retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >=  40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6()< 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules ECSI404 and ECSI405 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake2Mod2L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS504 and CCS503 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3()< 40)
                                && (student.getLevel5Mod4() >=  40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS504 and CCS503 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake2Mod2L5("CCS503 - Software Development Group Project");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS504 and CCS502 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >=  40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS504 and CCS502 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake2Mod2L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS504 and OPS1 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >=  40)
                                && (student.getLevel5Mod4() >=  40) && (student.getLevel5Mod5()< 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS504 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake2Mod2L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);


                            //CCS504 and OPS2 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2()< 40) && (student.getLevel5Mod3() >=  40)
                                && (student.getLevel5Mod4() >=  40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6()  < 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS504 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake2Mod2L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);


                            //CCS503 and CCS502 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3()  <  40)
                                && (student.getLevel5Mod4() <  40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS503 and CCS502 have to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake2Mod2L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS503 and OPS1 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() <  40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5()  < 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS503 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake2Mod2L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS503 and OPS2 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() <  40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS503 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake2Mod2L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS502 and OPS1 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4()< 40) && (student.getLevel5Mod5() < 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS502 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake2Mod2L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //CCS502 and OPS2 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4()< 40) && (student.getLevel5Mod5() >=40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The modules CCS502 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake2Mod2L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //OPS1 and OPS2 Retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() < 40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake2ModL5(event);
                            Level5Controller.ErrorLabelRetake2L5("The Optional Modules for Semester 01 & 02 has to be re-taken.");
                            Level5Controller.LabelRetake2Mod1L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake2Mod2L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake2L5(event);

                            student.setCreditsL5(creditL5 +=80);

                            //THREE MODULES RETAKE-----------------------------------------------------------------------------------------

                            //CCS501 and CCS504 and CCS503 retake
                        }else if((student.getLevel5Mod1()  < 40) && (student.getLevel5Mod2()  < 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){


                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501 and CCS504 and CCS503 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod3L5("CCS503 - Software Development Group Project");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);


                            //CCS501 and CCS504 and CCS502 retake
                        }else if((student.getLevel5Mod1()  < 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() >= 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501 and CCS504 and CCS502 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod3L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS501 and CCS504 and OPS1 retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2()  < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >=40) && (student.getLevel5Mod5() < 40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501 and CCS504 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod3L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS501 and CCS504 and OPS2 retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >=40) && (student.getLevel5Mod5()>=40 ) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501 and CCS504 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS504 and CCS503 and CCS502 retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2()  < 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5()>=40 ) && (student.getLevel5Mod6() >=40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS504 and CCS503 and CCS502 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod2L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod3L5("CCS502 - Database Systems");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS504 and CCS503 and OPS1 retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3()< 40)
                                && (student.getLevel5Mod4() >=40) && (student.getLevel5Mod5()< 40 ) && (student.getLevel5Mod6() >=40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS504 and CCS503 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod2L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod3L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS504 and CCS503 and OPS2 retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >=40) && (student.getLevel5Mod5() >=40 ) && (student.getLevel5Mod6()< 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS504 and CCS503 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod2L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS503 and CCS502 and OPS1 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >=40 && student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() < 40 ) && (student.getLevel5Mod6()>=40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS503 and CCS502 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod2L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod3L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS503 and CCS502 and OPS2 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() >=40 ) && (student.getLevel5Mod6()< 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS503 and CCS502 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod2L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS503 and CCS502 and CCS501 retake
                        }else if((student.getLevel5Mod1() <40) && (student.getLevel5Mod2() >= 40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4()< 40) && (student.getLevel5Mod5() >=40 ) && (student.getLevel5Mod6()>=40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS503 and CCS502 and CCS501 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod2L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod3L5("CCS501 - Object Oriented Programming");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);


                            //CCS502 and OPS1 and OPS2 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2()>=40) && (student.getLevel5Mod3() >=40)
                                && (student.getLevel5Mod4()  < 40) && (student.getLevel5Mod5()  <40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS502 the Optional Modules for Semester 01 & 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod2L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS502 and OPS1 and CCS501 retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2()>=40) && (student.getLevel5Mod3() >=40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5()  <40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS502, the Optional Module for Semester 01 and CCS501 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod2L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCS501 - Object Oriented Programming");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS502 and OPS1 and CCS504 retake
                        }else if((student.getLevel5Mod1() >= 40) && (student.getLevel5Mod2()<40) && (student.getLevel5Mod3() >=40)
                                && (student.getLevel5Mod4() < 40) && (student.getLevel5Mod5() <40) && (student.getLevel5Mod6() >= 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS502, the Optional Module for Semester 01 and CCS504 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod2L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCS504 - Client-Server Architecture");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //OPS1 and OPS2 and CCS501 retake
                        }else if((student.getLevel5Mod1() < 40) && (student.getLevel5Mod2()>=40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5()  <40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The Optional Modules for Semester 01 & 02 and CCS501 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod2L5("CCG506 / CCG507 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCS501 - Object Oriented Programming");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);


                            //OPS1 and OPS2 and CCS504 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2() < 40) && (student.getLevel5Mod3() >= 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() <40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The Optional Modules for Semester 01 & 02 and CCS504 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod2L5("CCG506 / CCG507 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCS504 - Client-Server Architecture");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //OPS1 and OPS2 and CCS503 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2() >=40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() <40) && (student.getLevel5Mod6() < 40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The Optional Modules for Semester 01 & 02 and CCS503 have to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCG502 / CCG503 (Optional Module)");
                            Level5Controller.LabelRetake3Mod2L5("CCG506 / CCG507 (Optional Module)");
                            Level5Controller.LabelRetake3Mod3L5("CCS503 - Software Development Group Project");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS501 and CCS503 and OPS1 retake
                        }else if((student.getLevel5Mod1() <40) && (student.getLevel5Mod2() >=40) && (student.getLevel5Mod3() < 40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() <40) && (student.getLevel5Mod6() >=  40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501, CCS503 and the Optional Module for Semester 01 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod3L5("CCG502 / CCG503 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS501 and CCS502 and OPS2 retake
                        }else if((student.getLevel5Mod1() <40) && (student.getLevel5Mod2() >=40) && (student.getLevel5Mod3() >=40)
                                && (student.getLevel5Mod4() <40) && (student.getLevel5Mod5() >=40) && (student.getLevel5Mod6() <40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501, CCS502 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS504 and CCS502 and OPS2 retake
                        }else if((student.getLevel5Mod1() >=40) && (student.getLevel5Mod2() <40) && (student.getLevel5Mod3() >=40)
                                && (student.getLevel5Mod4() <40) && (student.getLevel5Mod5() <40) && (student.getLevel5Mod6() >=  40)){

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS504, CCS502 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS504 - Client-Server Architecture");
                            Level5Controller.LabelRetake3Mod2L5("CCS502 - Database Systems");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

                            //CCS501 and CCS503 and OPS2 retake
                        }else if((student.getLevel5Mod1() <40) && (student.getLevel5Mod2() >=40) && (student.getLevel5Mod3() <40)
                                && (student.getLevel5Mod4() >= 40) && (student.getLevel5Mod5() >=40) && (student.getLevel5Mod6() <40)) {

                            controlL5.Retake3ModL5(event);
                            Level5Controller.ErrorLabelRetake3L5("The modules CCS501, CCS503 and the Optional Module for Semester 02 has to be re-taken.");
                            Level5Controller.LabelRetake3Mod1L5("CCS501 - Object Oriented Programming");
                            Level5Controller.LabelRetake3Mod2L5("CCS503 - Software Development Group Project");
                            Level5Controller.LabelRetake3Mod3L5("CCG506 / CCG507 (Optional Module)");
                            controlL5.handlebtnRetake3L5(event);

                            student.setCreditsL5(creditL5 +=60);

        /*                } else if((student.getLevel5Mod1() >=30 && student.getLevel5Mod1() <40) || (student.getLevel5Mod2() >=30 && student.getLevel5Mod2() <40) ||
                                (student.getLevel5Mod3() >=30 && student.getLevel5Mod3() <40) || (student.getLevel5Mod4() >=30 && student.getLevel5Mod4() <40)
                                || (student.getLevel5Mod5() >=30 && student.getLevel5Mod5() <40) || (student.getLevel5Mod6() >=30 && student.getLevel5Mod6() <40)){

                            if((student.getLevel5Mod1() >=30 && student.getLevel5Mod1() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for CCS501 - Object Oriented Programming");
                                Level5Controller.LabelRetake1L5("CCS501 - Object Oriented Programming");
                                controlL5.handlebtnRetake1L5(event);

                            }if((student.getLevel5Mod2() >=30 && student.getLevel5Mod2() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for CCS504 - Client-Server Architecture");
                                Level5Controller.LabelRetake1L5("CCS504 - Client-Server Architecture");
                                controlL5.handlebtnRetake1L5(event);

                            }if((student.getLevel5Mod3() >=30 && student.getLevel5Mod3() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for CCS503 - Software Development Group Project");
                                Level5Controller.LabelRetake1L5("CCS503 - Software Development Group Project");
                                controlL5.handlebtnRetake1L5(event);

                            }if((student.getLevel5Mod4() >=30 && student.getLevel5Mod4() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for CCS502 - Database Systems");
                                Level5Controller.LabelRetake1L5("CCS502 - Database Systems");
                                controlL5.handlebtnRetake1L5(event);

                            }if((student.getLevel5Mod5() >=30 && student.getLevel5Mod5() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for the Optional Module in Semester 01");
                                Level5Controller.LabelRetake1L5("CCG502 / CCG503 (Optional Module)");
                                controlL5.handlebtnRetake1L5(event);

                            }if((student.getLevel5Mod6() >=30 && student.getLevel5Mod6() <40)){
                                controlL5.Retake1ModL5(event);
                                Level5Controller.ErrorLabelRetake1L5("You have a resit for the Optional Module in Semester 02");
                                Level5Controller.LabelRetake1L5("CCG506 / CCG507 (Optional Module)");
                                controlL5.handlebtnRetake1L5(event);

                            }

*/


                            //--------------------------------------------------------------------------
                            //--------------------------------------------------------------------------
                        } else {

                            Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL5.fxml"));
                            Stage errorStage = new Stage();
                            errorStage.setScene(new Scene(root8, 350, 160));
                            errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                            errorStage.setTitle("Eligibility Issue");
                            errorStage.show();
                            errorStage.setResizable(false);
                            Level5Controller.ErrorLabelL5("Sorry! You're not eligible to enter Level 06");
                        }
                    }

                } else {


                    if (!(markOOP1 >= 0 && markOOP1 <= 100)) {
                        fieldOOP1.clear();
                    } else if (!(markOOP2 >= 0 && markOOP2 <= 100)) {
                        fieldOOP2.clear();
                    } else if (!(markOOP3 >= 0 && markOOP3 <= 100)) {
                        fieldOOP3.clear();
                    } else if (!(markCSA1 >= 0 && markCSA1 <= 100)) {
                        fieldCSA1.clear();
                    } else if (!(markCSA2 >= 0 && markCSA2 <= 100)) {
                        fieldCSA2.clear();
                    } else if (!(markCSA3 >= 0 && markCSA3 <= 100)) {
                        fieldCSA3.clear();

                    } else if (!(markSD1 >= 0 && markSD1 <= 100)) {
                        fieldSD1.clear();
                    } else if (!(markSD2 >= 0 && markSD2 <= 100)) {
                        fieldSD2.clear();
                    } else if (!(markSD3 >= 0 && markSD3 <= 100)) {
                        fieldSD3.clear();

                    } else if (!(markDS1 >= 0 && markDS1 <= 100)) {
                        fieldDS1.clear();
                    } else if (!(markDS2 >= 0 && markDS2 <= 100)) {
                        fieldDS2.clear();
                    } else if (!(markDS3 >= 0 && markDS3 <= 100)) {
                        fieldDS3.clear();

                    } else if (!(markO1S1L5 >= 0 && markO1S1L5 <= 100)) {
                        fieldO1S1L5.clear();
                    } else if (!(markO2S1L5 >= 0 && markO2S1L5 <= 100)) {
                        fieldO2S1L5.clear();
                    } else if (!(markO3S1L5 >= 0 && markO3S1L5 <= 100)) {
                        fieldO3S1L5.clear();

                    } else if (!(markO1S2L5 >= 0 && markO1S2L5 <= 100)) {
                        fieldO1S2L5.clear();
                    } else if (!(markO2S2L5 >= 0 && markO2S2L5 <= 100)) {
                        fieldO2S2L5.clear();
                    } else if (!(markO3S2L5 >= 0 && markO3S2L5 <= 100)) {
                        fieldO3S2L5.clear();
                    }
                    lblInput.setText("Wrong Input! Please enter the marks for each exam out of 100");

                }


            }

        } catch (Exception e) {
            try {
                Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL5.fxml"));
                Stage errorStage = new Stage();
                errorStage.setScene(new Scene(root8, 350, 160));
                errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                errorStage.setTitle("Oops.....Empty Fields.");
                errorStage.show();
                errorStage.setResizable(false);
                Level5Controller.ErrorLabelL5("Oops!.....Some fields are empty. Please fill them to continue.");

            } catch (Exception ea) {

            }

        }
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            //CBox1L5.setValue("CCG502 - Applied Maths & Physics"); //The first item inside the combo box
            CBox1L5.setItems(CBox1Level5list); //linking the array list to the combobox

            //CBox2L5.setValue("CCG506 - Mobile Application Development"); //The first item inside the combo box
            CBox2L5.setItems(CBox2Level5list); //linking the array list to the combobox
        }catch(Exception ae){

        }


    }



}

