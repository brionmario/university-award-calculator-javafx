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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Level6Controller implements Initializable {

    @FXML
    private ComboBox CBox1L6;

    @FXML
    private ComboBox CBox2L6;

    //Create Arrays to hold the values inside the combo boxes
    ObservableList<String> CBox1Level6list = FXCollections.observableArrayList("CCS607 - Advanced Server-side Web Programming",
            "CCS605 - Concurrent Programming");

    ObservableList<String> CBox2Level6list = FXCollections.observableArrayList("CCG602 - Advanced Maths & Game AI",
            "CCS602 - Mobile Native Application Development");

    @FXML
    TextField fieldCSP1, fieldCSP2, fieldCSP3, fieldRAP1, fieldRAP2, fieldRAP3, fieldSF1, fieldSF2, fieldSF3, fieldiOS1, fieldiOS2,
            fieldiOS3, fieldO1S1L6, fieldO2S1L6, fieldO3S1L6, fieldO1S2L6, fieldO2S2L6, fieldO3S2L6;
    @FXML
    Label lblInput;
    @FXML
    private static TextField fieldRetake1L6;
    @FXML
    private static Label lblRetake1L6;
    @FXML
    private static Label lblErrorRetake1L6;
    @FXML
    Button btnRetake1L6;
    //error label should be static coz we have to call it
    @FXML
    private static Label lblErrorL6;

    @FXML
    private static TextField fieldRetake2Mod1L6;
    @FXML
    private static TextField fieldRetake2Mod2L6;
    @FXML
    private static Label lblRetake2Mod1L6;
    @FXML
    private static Label lblRetake2Mod2L6;
    @FXML
    private static Label lblErrorRetake2L6;
    @FXML
    Button btnRetake2L6;

    @FXML
    private static TextField fieldRetake3Mod1L6;
    @FXML
    private static TextField fieldRetake3Mod2L6;
    @FXML
    private static TextField fieldRetake3Mod3L6;
    @FXML
    private static Label lblRetake3Mod1L6;
    @FXML
    private static Label lblRetake3Mod2L6;
    @FXML
    private static Label lblRetake3Mod3L6;
    @FXML
    private static Label lblErrorRetake3L6;
    @FXML
    Button btnRetake3L6;

    //ONE MODULE RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake1L6(String text) {
        lblErrorRetake1L6.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake1L6(String text) {
        lblRetake1L6.setText(text);

    }

    //THREE MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake3L6(String text) {
        lblErrorRetake3L6.setText(text);
    }

    //Create a method to store the retake 3 label 1
    public static void LabelRetake3Mod1L6(String text) {
        lblRetake3Mod1L6.setText(text);

    }

    //Create a method to store the retake 3 label 2
    public static void LabelRetake3Mod2L6(String text) {
        lblRetake3Mod2L6.setText(text);

    }

    //Create a method to store the retake 3 label 3
    public static void LabelRetake3Mod3L6(String text) {
        lblRetake3Mod3L6.setText(text);

    }

    //TWO MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake2L6(String text) {
        lblErrorRetake2L6.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod1L6(String text) {
        lblRetake2Mod1L6.setText(text);

    }

    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod2L6(String text) {
        lblRetake2Mod2L6.setText(text);

    }
    //Create an instance(object) of the student class
    Student student = new Student();

    //Create an array list to store the input
    ArrayList<Student> students = new ArrayList<Student>();

    private static int creditL6;


    //Create a method to store the error label text
    public static void ErrorLabelL6(String text) {
        lblErrorL6.setText(text);
    }


    public void ErrorBoxL6(ActionEvent event) throws IOException {
        Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL6.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root8, 350, 160));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("ALERT!");
        errorStage.show();
        errorStage.setResizable(false);

    }

    //METHODS FOR 1 REATAKE WINDOW
    public void Retake1ModL6(ActionEvent event) throws IOException {

        Parent root15 = FXMLLoader.load(getClass().getResource("Retake1ModL6.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root15, 438, 286));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake");
        errorStage.show();
        errorStage.setResizable(false);

    }

    @FXML
    public void handlebtnRetake1L6(ActionEvent event) {

        try {
            Integer markRetake1 = Integer.parseInt(fieldRetake1L6.getText());
            student.setLevel6Retake1(markRetake1);
            if (student.getLevel6Retake1() >= 40 && student.getLevel6Retake1() <= 100) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");

                student.setCreditsL6(creditL6 += 20);
                //System.out.println(student.getCreditsL6());
            } else {
                Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL6.fxml"));
                Stage errorStage = new Stage();
                errorStage.setScene(new Scene(root8, 350, 160));
                errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                errorStage.setTitle("Alert!");
                errorStage.show();
                errorStage.setResizable(false);
                Level6Controller.ErrorLabelL6("The student haven't passed one Module. No credits will be awarded.");
                System.out.println(student.getCreditsL6());

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
            }
        } catch (Exception e) {

        }
    }

    //METHODS FOR 2 REATAKES WINDOW
    public void Retake2ModL6(ActionEvent event) throws IOException {

        Parent root16 = FXMLLoader.load(getClass().getResource("Retake2ModL6.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root16, 438, 308));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Two Modules - Level 06");
        errorStage.show();
        errorStage.setResizable(false);

    }

    @FXML
    public void handlebtnRetake2L6(ActionEvent event) {

        try {
            Integer markRetake2Mod1 = Integer.parseInt(fieldRetake2Mod1L6.getText());
            Integer markRetake2Mod2 = Integer.parseInt(fieldRetake2Mod2L6.getText());
            student.setLevel6Retake2Mod1(markRetake2Mod1);
            student.setLevel6Retake2Mod2(markRetake2Mod2);
            if ((student.getLevel6Retake2Mod1() >= 40 && student.getLevel6Retake2Mod1() <= 100)
                    && (student.getLevel6Retake2Mod2() >= 40 && student.getLevel6Retake2Mod2() <= 100)) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");

                student.setCreditsL6(creditL6 += 40);


            }else if ((student.getLevel6Retake2Mod1() >= 40 && student.getLevel6Retake2Mod1() <= 100)
                    || (student.getLevel6Retake2Mod2() >= 40 && student.getLevel6Retake2Mod2() <= 100)) {

                Level6Controller.ErrorLabelRetake2L6("You haven' passed one module. Only 20 credits will be awarded.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");

                student.setCreditsL6(creditL6 += 20);
                //System.out.println(student.getCreditsL6());

            } else {
                Level6Controller.ErrorLabelRetake2L6("You haven' passed the two modules. No credits will be awarded.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
            }
        } catch (Exception e) {

        }

    }

    //METHODS FOR 3 RETAKE MODULES
    public void Retake3ModL6(ActionEvent event) throws IOException {

        Parent root17 = FXMLLoader.load(getClass().getResource("Retake3ModL6.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root17, 438, 342));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Three Modules - Level 06");
        errorStage.show();
        errorStage.setResizable(false);

    }

    @FXML
    public void handlebtnRetake3L6(ActionEvent event) {

        try {
            Integer markRetake3Mod1 = Integer.parseInt(fieldRetake3Mod1L6.getText());
            Integer markRetake3Mod2 = Integer.parseInt(fieldRetake3Mod2L6.getText());
            Integer markRetake3Mod3 = Integer.parseInt(fieldRetake3Mod3L6.getText());
            student.setLevel6Retake3Mod1(markRetake3Mod1);
            student.setLevel6Retake3Mod2(markRetake3Mod2);
            student.setLevel6Retake3Mod3(markRetake3Mod3);
            if ((student.getLevel6Retake3Mod1() >= 40 && student.getLevel6Retake3Mod1() <= 100)
                    && (student.getLevel6Retake3Mod2() >= 40 && student.getLevel6Retake3Mod2() <= 100)
                    && (student.getLevel6Retake3Mod3() >= 40 && student.getLevel6Retake3Mod3() <= 100)) {

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                student.setCreditsL5(creditL6 +=60);

            }else if ((student.getLevel6Retake3Mod1() >= 40 && student.getLevel6Retake3Mod1() <= 100)
                    || (student.getLevel6Retake3Mod2() >= 40 && student.getLevel6Retake3Mod2() <= 100)
                    && (student.getLevel6Retake3Mod3() >= 40 && student.getLevel6Retake3Mod3() <= 100)) {

                Level6Controller.ErrorLabelRetake3L6("You haven't passed one module. Only 40 credits will be awarded.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                student.setCreditsL5(creditL6 += 40);

            }else if ((student.getLevel6Retake3Mod1() >= 40 && student.getLevel6Retake3Mod1() <= 100)
                    && (student.getLevel6Retake3Mod2() >= 40 && student.getLevel6Retake3Mod2() <= 100)
                    || (student.getLevel6Retake3Mod3() >= 40 && student.getLevel6Retake3Mod3() <= 100)) {

                Level6Controller.ErrorLabelRetake3L6("You haven't passed one module. Only 40 credits will be awarded.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                student.setCreditsL5(creditL6 += 40);
            }else if ((student.getLevel6Retake3Mod1() >= 40 && student.getLevel6Retake3Mod1() <= 100)
                    || (student.getLevel6Retake3Mod2() >= 40 && student.getLevel6Retake3Mod2() <= 100)
                    || (student.getLevel6Retake3Mod3() >= 40 && student.getLevel6Retake3Mod3() <= 100)) {

                Level6Controller.ErrorLabelRetake3L6("You haven't passed two modules. Only 20 credits will be awarded.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                student.setCreditsL5(creditL6 += 20);
            }else {
                Level6Controller.ErrorLabelRetake3L6("You haven't passed the three retake modules.");

                Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                Scene scene3 = new Scene(root4);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                student.setCreditsL5(creditL6 += 0);
            }
        } catch (Exception e) {

        }

    }
    @FXML
    public void btnExitL6Action(ActionEvent event) throws IOException {

        System.out.println(student.getCreditsL5());
        if (student.getCreditsL4()==120 && student.getCreditsL5() == 120) {
            Parent root6 = FXMLLoader.load(getClass().getResource("ReportDip.fxml"));
            Scene scene6 = new Scene(root6);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setScene(scene6);
        } else {
            Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL6.fxml"));
            Stage errorStage = new Stage();
            errorStage.setScene(new Scene(root8, 350, 160));
            errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
            errorStage.setTitle("Eligibility Issue");
            errorStage.show();
            errorStage.setResizable(false);
            Level6Controller.ErrorLabelL6("Sorry! You're not eligible for a Dip.HE");
        }
    }

    @FXML
    private void handlebtnSubmitL6(ActionEvent event) throws IOException {

        //System.out.println("Total is this " + (student.getCreditsL4()+student.getCreditsL5()+student.getCreditsL6()));

        Level6Controller controlL6 = new Level6Controller();

        try {

            //Module 01 marks
            Integer markCSP1 = Integer.parseInt(fieldCSP1.getText());
            Integer markCSP2 = Integer.parseInt(fieldCSP2.getText());
            Integer markCSP3 = Integer.parseInt(fieldCSP3.getText());

            //Module 02 marks
            Integer markRAP1 = Integer.parseInt(fieldRAP1.getText());
            Integer markRAP2 = Integer.parseInt(fieldRAP2.getText());
            Integer markRAP3 = Integer.parseInt(fieldRAP3.getText());

            //Module 03 marks
            Integer markSF1 = Integer.parseInt(fieldSF1.getText());
            Integer markSF2 = Integer.parseInt(fieldSF2.getText());
            Integer markSF3 = Integer.parseInt(fieldSF3.getText());

            //Module 04 marks
            Integer markiOS1 = Integer.parseInt(fieldiOS1.getText());
            Integer markiOS2 = Integer.parseInt(fieldiOS2.getText());
            Integer markiOS3 = Integer.parseInt(fieldiOS3.getText());

            //Module 05 marks
            Integer markO1S1L6 = Integer.parseInt(fieldO1S1L6.getText());
            Integer markO2S1L6 = Integer.parseInt(fieldO2S1L6.getText());
            Integer markO3S1L6 = Integer.parseInt(fieldO3S1L6.getText());

            //Module 06 marks
            Integer markO1S2L6 = Integer.parseInt(fieldO1S2L6.getText());
            Integer markO2S2L6 = Integer.parseInt(fieldO2S2L6.getText());
            Integer markO3S2L6 = Integer.parseInt(fieldO3S2L6.getText());

            student.setLevel6Mod1((markCSP1 + markCSP2 + markCSP3) / 3);
            student.setLevel6Mod2((markRAP1 + markRAP2 + markRAP3) / 3);
            student.setLevel6Mod3((markSF1 + markSF2 + markSF3) / 3);
            student.setLevel6Mod4((markiOS1 + markiOS2 + markiOS3) / 3);
            student.setLevel6Mod5((markO1S1L6 + markO2S1L6 + markO3S1L6) / 3);
            student.setLevel6Mod6((markO1S2L6 + markO2S2L6 + markO3S2L6) / 3);

            if (fieldCSP1.getText().equals("") || fieldCSP2.getText().equals("") || fieldCSP3.getText().equals("")
                    || fieldRAP1.getText().equals("") || fieldRAP2.getText().equals("") || fieldRAP3.getText().equals("")
                    || fieldSF1.getText().equals("") || fieldSF2.getText().equals("") || fieldSF3.getText().equals("")
                    || fieldiOS1.getText().equals("") || fieldiOS2.getText().equals("") || fieldiOS3.getText().equals("")
                    || fieldO1S1L6.getText().equals("") || fieldO2S1L6.getText().equals("") || fieldO3S1L6.getText().equals("")
                    || fieldO1S2L6.getText().equals("") || fieldO2S2L6.getText().equals("") || fieldO3S2L6.getText().equals("")) {

            } else if ((markCSP1 >= 0 && markCSP1 <= 100) && (markCSP2 >= 0 && markCSP2 <= 100) && (markCSP3 >= 0 && markCSP3 <= 100)
                    && (markRAP1 >= 0 && markRAP1 <= 100) && (markRAP2 >= 0 && markRAP2 <= 100) && (markRAP3 >= 0 && markRAP3 <= 100)
                    && (markSF1 >= 0 && markSF1 <= 100) && (markSF2 >= 0 && markSF2 <= 100) && (markSF3 >= 0 && markSF3 <= 100)
                    && (markiOS1 >= 0 && markiOS1 <= 100) && (markiOS2 >= 0 && markiOS2 <= 100) && (markiOS3 >= 0 && markiOS3 <= 100)
                    && (markO1S1L6 >= 0 && markO1S1L6 <= 100) && (markO2S1L6 >= 0 && markO2S1L6 <= 100) && (markO3S1L6 >= 0 && markO3S1L6 <= 100)
                    && (markO1S2L6 >= 0 && markO1S2L6 <= 100) && (markO2S2L6 >= 0 && markO2S2L6 <= 100) && (markO3S2L6 >= 0 && markO3S2L6 <= 100)) {

                if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                        && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                    student.setCreditsL6(creditL6 += 120);
                    Parent root4 = FXMLLoader.load(getClass().getResource("Report.fxml"));
                    Scene scene3 = new Scene(root4);
                    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    primaryStage.setScene(scene3);
                    primaryStage.setTitle("UNIVERSITY OF GUGSI - Final Report");
                    System.out.println("lev 6 " + student.getCreditsL6());


                    //System.out.println("Total " + (student.getCreditsL6() +student.getCreditsL5()+ student.getCreditsL4()));

                } else //------------------------------------------------------------------------------------------------------
                    //------------------------------------------------------------------------------------------------------
                    //------------------------------------------------------------------------------------------------------
                    //ONE MODULE RETAKE-----------------------------------------------------------------------------------------
                    //CCS501 Retake
                    if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The module CCS699 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCS699 - Computer Science Project");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);
                        //System.out.println(student.getCreditsL5());

                        //ECSI400 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The module CCS603 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCS603 - Reasoning About Programs");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);

                        //CCS503 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The module CCS602 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCS602 - Security & Forensics");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);

                        //CCS502 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The module CCS613 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);

                        //CCG 502/503 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);

                        //CCG 506/507 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake1ModL6(event);
                        Level6Controller.ErrorLabelRetake1L6("The Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake1L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake1L6(event);

                        student.setCreditsL6(creditL6 += 100);

                        //TWO MODULES RETAKE-----------------------------------------------------------------------------------------
                        //CCS501 and CCS504 Retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS699 and CCS603 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake2Mod2L6("CCS603 - Reasoning About Programs");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);
                        System.out.println(student.getCreditsL6());

                        //CCS501 and CCS503 Retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS699 and CCS602 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake2Mod2L6("CCS602 - Security & Forensics");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS501 and CCS502 Retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS699 and CCS613 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake2Mod2L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS501 and OPS1 Retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS699 and the Optional Module for Semester 01 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake2Mod2L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS501 and OPS2 Retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS699 and the Optional Module for Semester 02 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake2Mod2L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS504 and CCS503 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS603 and CCS602 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake2Mod2L6("CCS602 - Security & Forensics");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS504 and CCS502 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS603 and CCS613 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake2Mod2L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS504 and OPS1 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS603 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake2Mod2L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS504 and OPS2 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS603 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake2Mod2L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS503 and CCS502 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS602 and CCS613 have to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake2Mod2L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS503 and OPS1 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS602 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake2Mod2L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS503 and OPS2 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS602 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake2Mod2L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS502 and OPS1 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS613 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake2Mod2L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //CCS502 and OPS2 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The modules CCS613 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake2Mod2L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //OPS1 and OPS2 Retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake2ModL6(event);
                        Level6Controller.ErrorLabelRetake2L6("The Optional Modules for Semester 01 & 02 has to be re-taken.");
                        Level6Controller.LabelRetake2Mod1L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake2Mod2L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake2L6(event);

                        student.setCreditsL6(creditL6 += 80);

                        //THREE MODULES RETAKE-----------------------------------------------------------------------------------------
                        //CCS501 and CCS504 and CCS503 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699 and CCS603 and CCS602 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod3L6("CCS602 - Security & Forensics");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS504 and CCS502 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699 and CCS603 and CCS613 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod3L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS504 and OPS1 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699 and CCS603 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod3L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS504 and OPS2 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699 and CCS603 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS504 and CCS503 and CCS502 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS603 and CCS602 and CCS613 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod2L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod3L6("CCS613 - iOS Development");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS504 and CCS503 and OPS1 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS603 and CCS602 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod2L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod3L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS504 and CCS503 and OPS2 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS603 and CCS602 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod2L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS503 and CCS502 and OPS1 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40 && student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS602 and CCS613 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod2L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod3L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS503 and CCS502 and OPS2 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS602 and CCS613 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod2L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS503 and CCS502 and CCS501 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS602 and CCS613 and CCS699 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod2L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod3L6("CCS699 - Computer Science Project");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS502 and OPS1 and OPS2 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS613 the Optional Modules for Semester 01 & 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod2L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS502 and OPS1 and CCS501 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS613, the Optional Module for Semester 01 and CCS699 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod2L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCS699 - Computer Science Project");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS502 and OPS1 and CCS504 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS613, the Optional Module for Semester 01 and CCS603 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod2L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCS603 - Reasoning About Programs");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //OPS1 and OPS2 and CCS501 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The Optional Modules for Semester 01 & 02 and CCS699 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod2L6("CCG602 / CCS602 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCS699 - Computer Science Project");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //OPS1 and OPS2 and CCS504 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The Optional Modules for Semester 01 & 02 and CCS603 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod2L6("CCG602 / CCS602 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCS603 - Reasoning About Programs");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //OPS1 and OPS2 and CCS503 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The Optional Modules for Semester 01 & 02 and CCS602 have to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS607 / CCS605 (Optional Module)");
                        Level6Controller.LabelRetake3Mod2L6("CCG602 / CCS602 (Optional Module)");
                        Level6Controller.LabelRetake3Mod3L6("CCS602 - Security & Forensics");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS503 and OPS1 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699, CCS602 and the Optional Module for Semester 01 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod3L6("CCS607 / CCS605 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS502 and OPS2 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699, CCS613 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS504 and CCS502 and OPS2 retake
                    } else if ((student.getLevel6Mod1() >= 40) && (student.getLevel6Mod2() < 40) && (student.getLevel6Mod3() >= 40)
                            && (student.getLevel6Mod4() < 40) && (student.getLevel6Mod5() < 40) && (student.getLevel6Mod6() >= 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS603, CCS613 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS603 - Reasoning About Programs");
                        Level6Controller.LabelRetake3Mod2L6("CCS613 - iOS Development");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

                        //CCS501 and CCS503 and OPS2 retake
                    } else if ((student.getLevel6Mod1() < 40) && (student.getLevel6Mod2() >= 40) && (student.getLevel6Mod3() < 40)
                            && (student.getLevel6Mod4() >= 40) && (student.getLevel6Mod5() >= 40) && (student.getLevel6Mod6() < 40)) {

                        controlL6.Retake3ModL6(event);
                        Level6Controller.ErrorLabelRetake3L6("The modules CCS699, CCS602 and the Optional Module for Semester 02 has to be re-taken.");
                        Level6Controller.LabelRetake3Mod1L6("CCS699 - Computer Science Project");
                        Level6Controller.LabelRetake3Mod2L6("CCS602 - Security & Forensics");
                        Level6Controller.LabelRetake3Mod3L6("CCG602 / CCS602 (Optional Module)");
                        controlL6.handlebtnRetake3L6(event);

                        student.setCreditsL6(creditL6 += 60);

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

                        Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL6.fxml"));
                        Stage errorStage = new Stage();
                        errorStage.setScene(new Scene(root8, 350, 160));
                        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                        errorStage.setTitle("Eligibility Issue");
                        errorStage.show();
                        errorStage.setResizable(false);
                        Level6Controller.ErrorLabelL6("Sorry! You're not eligible");
                    }

            } else {

                if (!(markCSP1 >= 0 && markCSP1 <= 100)) {
                    fieldCSP1.clear();
                } else if (!(markCSP2 >= 0 && markCSP2 <= 100)) {
                    fieldCSP2.clear();
                } else if (!(markCSP3 >= 0 && markCSP3 <= 100)) {
                    fieldCSP3.clear();
                } else if (!(markRAP1 >= 0 && markRAP1 <= 100)) {
                    fieldRAP1.clear();
                } else if (!(markRAP2 >= 0 && markRAP2 <= 100)) {
                    fieldRAP2.clear();
                } else if (!(markRAP3 >= 0 && markRAP3 <= 100)) {
                    fieldRAP3.clear();

                } else if (!(markSF1 >= 0 && markSF1 <= 100)) {
                    fieldSF1.clear();
                } else if (!(markSF2 >= 0 && markSF2 <= 100)) {
                    fieldSF2.clear();
                } else if (!(markSF3 >= 0 && markSF3 <= 100)) {
                    fieldSF3.clear();

                } else if (!(markiOS1 >= 0 && markiOS1 <= 100)) {
                    fieldiOS1.clear();
                } else if (!(markiOS2 >= 0 && markiOS2 <= 100)) {
                    fieldiOS2.clear();
                } else if (!(markiOS3 >= 0 && markiOS3 <= 100)) {
                    fieldiOS3.clear();

                } else if (!(markO1S1L6 >= 0 && markO1S1L6 <= 100)) {
                    fieldO1S1L6.clear();
                } else if (!(markO2S1L6 >= 0 && markO2S1L6 <= 100)) {
                    fieldO2S1L6.clear();
                } else if (!(markO3S1L6 >= 0 && markO3S1L6 <= 100)) {
                    fieldO3S1L6.clear();

                } else if (!(markO1S2L6 >= 0 && markO1S2L6 <= 100)) {
                    fieldO1S2L6.clear();
                } else if (!(markO2S2L6 >= 0 && markO2S2L6 <= 100)) {
                    fieldO2S2L6.clear();
                } else if (!(markO3S2L6 >= 0 && markO3S2L6 <= 100)) {
                    fieldO3S2L6.clear();
                }
                lblInput.setText("Wrong Input! Please enter the marks for each exam out of 100");

            }

        } catch (Exception e) {
            try {
                Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL6.fxml"));
                Stage errorStage = new Stage();
                errorStage.setScene(new Scene(root8, 350, 160));
                errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                errorStage.setTitle("Oops.....Empty Fields.");
                errorStage.show();
                errorStage.setResizable(false);
                Level6Controller.ErrorLabelL6("Oops!.....Some fields are empty. Please fill them to continue.");

            } catch (Exception ea) {

            }

        }
    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
            try {
                //CBox1L6.setValue("CCS607 - Advanced Server-side Web Programming"); //The first item inside the combo box
                CBox1L6.setItems(CBox1Level6list); //linking the array list to the combobox

                //CBox2L6.setValue("CCG602 - Advanced Maths & Game AI"); //The first item inside the combo box
                CBox2L6.setItems(CBox2Level6list); //linking the array list to the combobox
            }catch (Exception ae){

            }

    }

}
