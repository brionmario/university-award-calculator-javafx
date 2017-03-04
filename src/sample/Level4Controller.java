package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Level4Controller implements Initializable {

    @FXML
    TextField fieldIndex;
    @FXML
    TextField fieldFirstName;
    @FXML
    TextField fieldLastName;
    @FXML
    TextField fieldCSF1, fieldCSF2, fieldCSF3, fieldCom1, fieldCom2, fieldCom3, fieldIDM1, fieldIDM2, fieldIDM3, fieldSDP1_1, fieldSDP1_2,
            fieldSDP1_3, fieldIS1, fieldIS2, fieldIS3, fieldSDP2_1, fieldSDP2_2, fieldSDP2_3;
    @FXML
    Label lblInput;
    @FXML
    private static TextField fieldRetake1;
    @FXML
    private static Label lblRetake1;
    @FXML
    private static Label lblErrorRetake1;
    @FXML
    Button btnRetake1;
    //error label should be static coz we have to call it
    @FXML
    private static Label lblError;

    @FXML
    private static TextField fieldRetake2Mod1;
    @FXML
    private static TextField fieldRetake2Mod2;
    @FXML
    private static Label lblRetake2Mod1;
    @FXML
    private static Label lblRetake2Mod2;
    @FXML
    private static Label lblErrorRetake2;
    @FXML
    Button btnRetake2;

    @FXML
    private static TextField fieldRetake3Mod1;
    @FXML
    private static TextField fieldRetake3Mod2;
    @FXML
    private static TextField fieldRetake3Mod3;
    @FXML
    private static Label lblRetake3Mod1;
    @FXML
    private static Label lblRetake3Mod2;
    @FXML
    private static Label lblRetake3Mod3;
    @FXML
    private static Label lblErrorRetake3;
    @FXML
    Button btnRetake3;



    //ONE MODULE RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake1(String text) {
        lblErrorRetake1.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake1(String text) {
        lblRetake1.setText(text);

    }


    //THREE MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake3(String text) {
        lblErrorRetake3.setText(text);
    }

    //Create a method to store the retake 3 label 1
    public static void LabelRetake3Mod1(String text) {
        lblRetake3Mod1.setText(text);

    }
    //Create a method to store the retake 3 label 2
    public static void LabelRetake3Mod2(String text) {
        lblRetake3Mod2.setText(text);

    }
    //Create a method to store the retake 3 label 3
    public static void LabelRetake3Mod3(String text) {
        lblRetake3Mod3.setText(text);

    }

    //TWO MODULES RETAKE WINDOW COMPONENTS
    //Create a method to store the alert label text
    public static void ErrorLabelRetake2(String text) {
        lblErrorRetake2.setText(text);
    }

    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod1(String text) {
        lblRetake2Mod1.setText(text);

    }
    //Create a method to store the retake 1 label
    public static void LabelRetake2Mod2(String text) {
        lblRetake2Mod2.setText(text);

    }

    //Create an array list to store the input
    ArrayList<Student> students = new ArrayList<Student>();

    //Create an instance(object) of the student class
    Student student = new Student();

    private static int creditL4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

    //Create a method to store the error label text
    public static void ErrorLabel(String text) {
        lblError.setText(text);
    }

    //Method for the error box
    public void ErrorBox(ActionEvent event) throws IOException {
        Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL4.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root8, 350, 160));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Condoned");
        errorStage.show();
        errorStage.setResizable(false);

        Parent root3 = FXMLLoader.load(getClass().getResource("Level5.fxml"));
        Scene scene3 = new Scene(root3);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(scene3);
        primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 05");

    }

    //METHODS FOR 1 REATAKE WINDOW
    public void Retake1Mod(ActionEvent event) throws IOException {

        Parent root9 = FXMLLoader.load(getClass().getResource("Retake1ModL4.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root9, 438, 286));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake");
        errorStage.show();
        errorStage.setResizable(false);

    }
    @FXML
    public void handlebtnRetake1(ActionEvent event) {

        try {
            Integer markRetake1 = Integer.parseInt(fieldRetake1.getText());
            student.setLevel4Retake1(markRetake1);
            if (student.getLevel4Retake1() >= 40 && student.getLevel4Retake1() <=100) {

                Parent root3 = FXMLLoader.load(getClass().getResource("Level5.fxml"));
                Scene scene3 = new Scene(root3);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 05");
                student.setCreditsL4(creditL4+=20);
            } else {
                Level4Controller.ErrorLabelRetake1("Sorry! You are not Eligible to move on to Level 5");
            }
        } catch (Exception e) {

        }
    }

        //METHODS FOR 2 REATAKES WINDOW
    public void Retake2Mod(ActionEvent event) throws IOException {

        Parent root10 = FXMLLoader.load(getClass().getResource("Retake2ModL4.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root10, 438, 308));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Two Modules");
        errorStage.show();
        errorStage.setResizable(false);

    }
    @FXML
    public void handlebtnRetake2(ActionEvent event) {

        try {
            Integer markRetake2Mod1 = Integer.parseInt(fieldRetake2Mod1.getText());
            Integer markRetake2Mod2 = Integer.parseInt(fieldRetake2Mod2.getText());
            student.setLevel4Retake2Mod1(markRetake2Mod1);
            student.setLevel4Retake2Mod2(markRetake2Mod2);
            if (student.getLevel4Retake2Mod1() >= 40 && student.getLevel4Retake2Mod2()>=40) {

                Parent root3 = FXMLLoader.load(getClass().getResource("Level5.fxml"));
                Scene scene3 = new Scene(root3);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 05");
                student.setCreditsL4(creditL4+=40);

            }else{
                Level4Controller.ErrorLabelRetake2("Sorry! You are not Eligible to move on to Level 5");
            }
        } catch (Exception e) {

        }

    }

    //METHODS FOR 3 RETAKE MODULES
    public void Retake3Mod(ActionEvent event) throws IOException {

        Parent root11 = FXMLLoader.load(getClass().getResource("Retake3ModL4.fxml"));
        Stage errorStage = new Stage();
        errorStage.setScene(new Scene(root11, 438, 342));
        errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        errorStage.setTitle("Retake - Three Modules");
        errorStage.show();
        errorStage.setResizable(false);

    }
    @FXML
    public void handlebtnRetake3(ActionEvent event) {

        try {
            Integer markRetake3Mod1 = Integer.parseInt(fieldRetake3Mod1.getText());
            Integer markRetake3Mod2 = Integer.parseInt(fieldRetake3Mod2.getText());
            Integer markRetake3Mod3 = Integer.parseInt(fieldRetake3Mod3.getText());
            student.setLevel4Retake3Mod1(markRetake3Mod1);
            student.setLevel4Retake3Mod2(markRetake3Mod2);
            student.setLevel4Retake3Mod3(markRetake3Mod3);
            if ((student.getLevel4Retake3Mod1() >= 40 && student.getLevel4Retake1() <=100) && (student.getLevel4Retake3Mod2()>=40 &&
                    student.getLevel4Retake3Mod2() <=100) && (student.getLevel4Retake3Mod3()>=40 && student.getLevel4Retake3Mod3()<=100)) {

                Parent root3 = FXMLLoader.load(getClass().getResource("Level5.fxml"));
                Scene scene3 = new Scene(root3);
                Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                primaryStage.setScene(scene3);
                primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 05");
                student.setCreditsL4(creditL4+=60);

            }else{
                Level4Controller.ErrorLabelRetake3("Sorry! You are not Eligible to move on to Level 5");
            }
        } catch (Exception e) {

        }

    }


    @FXML
    public void handlebtnProceedL4(ActionEvent event) {

        Level4Controller controlL4 = new Level4Controller();

        try {

            //Module 01 marks
            Integer markCSF1 = Integer.parseInt(fieldCSF1.getText());
            Integer markCSF2 = Integer.parseInt(fieldCSF2.getText());
            Integer markCSF3 = Integer.parseInt(fieldCSF3.getText());

            //Module 02 marks
            Integer markCom1 = Integer.parseInt(fieldCom1.getText());
            Integer markCom2 = Integer.parseInt(fieldCom2.getText());
            Integer markCom3 = Integer.parseInt(fieldCom3.getText());

            //Module 03 marks
            Integer markIDM1 = Integer.parseInt(fieldIDM1.getText());
            Integer markIDM2 = Integer.parseInt(fieldIDM2.getText());
            Integer markIDM3 = Integer.parseInt(fieldIDM3.getText());

            //Module 04 marks
            Integer markSDP1_1 = Integer.parseInt(fieldSDP1_1.getText());
            Integer markSDP1_2 = Integer.parseInt(fieldSDP1_2.getText());
            Integer markSDP1_3 = Integer.parseInt(fieldSDP1_3.getText());

            //Module 05 marks
            Integer markIS1 = Integer.parseInt(fieldIS1.getText());
            Integer markIS2 = Integer.parseInt(fieldIS2.getText());
            Integer markIS3 = Integer.parseInt(fieldIS3.getText());

            //Module 06 marks
            Integer markSDP2_1 = Integer.parseInt(fieldSDP2_1.getText());
            Integer markSDP2_2 = Integer.parseInt(fieldSDP2_2.getText());
            Integer markSDP2_3 = Integer.parseInt(fieldSDP2_3.getText());

            student.setFirstName(fieldFirstName.getText());
            student.setLastName(fieldLastName.getText());
            student.setIndexNumber(fieldIndex.getText());
            student.setLevel4Mod1((markCSF1 + markCSF2 + markCSF3) / 3);
            student.setLevel4Mod2((markCom1 + markCom2 + markCom3) / 3);
            student.setLevel4Mod3((markIDM1 + markIDM2 + markIDM3) / 3);
            student.setLevel4Mod4((markSDP1_1 + markSDP1_2 + markSDP1_3) / 3);
            student.setLevel4Mod5((markIS1 + markIS2 + markIS3) / 3);
            student.setLevel4Mod6((markSDP2_1 + markSDP2_2 + markSDP2_3) / 3);



            //Checking if the text fields are empty
            if (fieldCSF1.getText().equals("") || fieldCSF2.getText().equals("") || fieldCSF3.getText().equals("") ||
                    fieldCom1.getText().equals("") || fieldCom2.getText().equals("") || fieldCom3.getText().equals("") ||
                    fieldIDM1.getText().equals("") || fieldIDM2.getText().equals("") || fieldIDM3.getText().equals("") ||
                    fieldSDP1_1.getText().equals("") || fieldSDP1_2.getText().equals("") || fieldSDP1_3.getText().equals("") ||
                    fieldIS1.getText().equals("") || fieldIS2.getText().equals("") || fieldIS3.getText().equals("") ||
                    fieldSDP2_1.getText().equals("") || fieldSDP2_2.getText().equals("") || fieldSDP2_3.getText().equals("") ||
                    fieldFirstName.getText().equals("") || fieldLastName.getText().equals("") || fieldIndex.getText().equals("")) {

                if (fieldIndex.getText().isEmpty() || fieldFirstName.getText().isEmpty() || fieldLastName.getText().isEmpty()) {
                    lblInput.setText("Either Index number, First Name or Last Name is missing. Please re-enter.");
                } else if (fieldIndex.getText().isEmpty() || fieldFirstName.getText().isEmpty() || fieldLastName.getText().isEmpty()) {
                    lblInput.setText("Please enter student's Index number, First name and Last name.");
                }


            } else {

                if ((markCSF1 >= 0 && markCSF1 <= 100) && (markCSF2 >= 0 && markCSF2 <= 100) && (markCSF3 >= 0 && markCSF3 <= 100) &&
                        (markCom1 >= 0 && markCom1 <= 100) && (markCom2 >= 0 && markCom2 <= 100) && (markCom3 >= 0 && markCom3 <= 100) &&
                        (markIDM1 >= 0 && markIDM1 <= 100) && (markIDM2 >= 0 && markIDM2 <= 100) && (markIDM3 >= 0 && markIDM3 <= 100) &&
                        (markSDP1_1 >= 0 && markSDP1_1 <= 100) && (markSDP1_2 >= 0 && markSDP1_2 <= 100) && (markSDP1_3 >= 0 && markSDP1_3 <= 100) &&
                        (markIS1 >= 0 && markIS1 <= 100) && (markIS2 >= 0 && markIS2 <= 100) && (markIS3 >= 0 && markIS3 <= 100) &&
                        (markSDP2_1 >= 0 && markSDP2_1 <= 100) && (markSDP2_2 >= 0 && markSDP2_2 <= 100) && (markSDP2_3 >= 0 && markSDP2_3 <= 100)) {

                    //Average is greater than 40 for all 6 modules
                    if ((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                            && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)) {

                        Parent root3 = FXMLLoader.load(getClass().getResource("Level5.fxml"));
                        Scene scene3 = new Scene(root3);
                        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        primaryStage.setScene(scene3);
                        primaryStage.setTitle("UNIVERSITY OF GUGSI - Level 05");

                        student.setCreditsL4(creditL4 += 120);
                        System.out.println("Lev 4 " + student.getCreditsL4());

                    } else {


                        //ONE MODULE CONDONED-----------------------------------------------------------------------------------------

                            //ECSI404 Condoned
                         if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI404 has been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                            //ECSI400 Condoned
                        }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI400 has been Condoned.");

                             student.setCreditsL4(creditL4+=120);

                            //ECSI412 Condoned
                        }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI412 has been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                            //ECSI410 Condoned
                        }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                && (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI410 has been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                            //ECSI411 Condoned
                        }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40)
                                && (student.getLevel4Mod6() >= 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI411 has been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                            //ECSI405 Condoned
                        }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) &&
                                (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                            controlL4.ErrorBox(event);
                            Level4Controller.ErrorLabel("The module ECSI405 has been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //TWO MODULES CONDONED -------------------------------------------------------------------------------------------

                             //ECSI404 and ECSI400 Condoned
                            }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI404 and ECSI400 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI404 and ECSI412 Condoned
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI404 and ECSI412 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI404 and ECSI410 Condoned
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI404 and ECSI410 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI404 and ECSI411 Condoned
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI404 and ECSI411 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI404 and ECSI405 Condoned
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI404 and ECSI405 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI400 and ECSI412 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI400 and ECSI412 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI400 and ECSI410 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI400 and ECSI410 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI400 and ECSI411 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI400 and ECSI411 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI400 and ECSI405 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI400 and ECSI405 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI412 and ECSI410 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=  30 && student.getLevel4Mod3() <  40)
                                 && (student.getLevel4Mod4() >=  30 && student.getLevel4Mod4() <  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI412 and ECSI410 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI412 and ECSI411 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=  30 && student.getLevel4Mod3() <  40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI412 and ECSI411 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI412 and ECSI405 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=  30 && student.getLevel4Mod3() <  40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI412 and ECSI405 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI410 and ECSI411 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI410 and ECSI411 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI410 and ECSI405 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI410 and ECSI405 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //ECSI411 and ECSI405 Condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.ErrorBox(event);
                             Level4Controller.ErrorLabel("The modules ECSI411 and ECSI405 have been Condoned.");
                             student.setCreditsL4(creditL4+=120);

                             //TWO MODULES CONDONED ONE RETAKE-----------------------------------------------------------------------------------------

                             //ECSI404 and ECSI400 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 30
                                 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){


                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI400 have been Condoned and the Student has to retake ECSI412.");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI400 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 30
                                 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI400 have been Condoned and the Student has to retake ECSI410.");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI400 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI400 have been Condoned and the Student has to retake ECSI411.");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI400 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI400 have been Condoned and the Student has to retake ECSI405.");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI412 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI412 have been Condoned and the Student has to retake ECSI410.");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI412 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5()< 30 ) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI412 have been Condoned and the Student has to retake ECSI411.");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI412 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()< 30)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI412 have been Condoned and the Student has to retake ECSI405.");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI412 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI412 have been Condoned and the Student has to retake ECSI404.");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI410 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() < 30 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI410 have been Condoned and the Student has to retake ECSI411.");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI410 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()< 30)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI410 have been Condoned and the Student has to retake ECSI405.");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI410 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI410 have been Condoned and the Student has to retake ECSI404.");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI410 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2()<30) && (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI410 have been Condoned and the Student has to retake ECSI400.");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI411 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI411 have been Condoned and the Student has to retake ECSI405.");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI411 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI411 have been Condoned and the Student has to retake ECSI404.");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI411 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()<30) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI411 have been Condoned and the Student has to retake ECSI400.");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI411 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI411 have been Condoned and the Student has to retake ECSI412.");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI411 and ECSI405 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI411 and ECSI405 have been Condoned and the Student has to retake ECSI404.");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI411 and ECSI405 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI411 and ECSI405 have been Condoned and the Student has to retake ECSI400.");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI411 and ECSI405 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI411 and ECSI405 have been Condoned and the Student has to retake ECSI412.");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI411 and ECSI405 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4()< 30) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() <40) && (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI411 and ECSI405 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI412 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI412 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI412 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4()< 30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI412 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI412 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI412 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI412 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() < 30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI412 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI410 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI410 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI410 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6()<30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI410 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI410 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6()>= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI410 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI410 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6()>= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI410 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI411 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6()<30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI411 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI411 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() <30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6()>= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI411 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI411 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() <30)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6()>= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI411 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI411 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()<30) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6()>= 40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI411 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI405 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI405 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI405 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3()< 30)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI405 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI405 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()>30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI405 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI405 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()<40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()>=40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI404 and ECSI405 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI410 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() <30)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI410 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI410 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI410 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI410 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI410 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI410 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5()>=40) && (student.getLevel4Mod6() <30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI410 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI411 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI411 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI411 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3() <30)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI411 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI411 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()>=40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI411 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI411 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()>=40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() <30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI411 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI405 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()>=40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI405 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI405 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()<30)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI405 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI405 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()>=40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI405 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI400 and ECSI405 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()<40) && (student.getLevel4Mod3()>=40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI405 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI411 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI411 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI411 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() <30) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI411 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI411 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() >=40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI411 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI411 Condoned ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()<40) && (student.getLevel4Mod6() <30)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI411 have been Condoned and the Student has to retake ECSI405");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI405 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI405 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI405 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() <30) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI405 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI405 Condoned ECSI410 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI405 have been Condoned and the Student has to retake ECSI410");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI412 and ECSI405 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()<40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI405 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI405 Condoned ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >=40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI405 have been Condoned and the Student has to retake ECSI404");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI405 Condoned ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() <30) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >=40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI405 have been Condoned and the Student has to retake ECSI400");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI405 Condoned ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() <30)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() >=40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI405 have been Condoned and the Student has to retake ECSI412");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //ECSI410 and ECSI405 Condoned ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()<40) && (student.getLevel4Mod5() <30) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()<40)) {

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The modules ECSI410 and ECSI405 have been Condoned and the Student has to retake ECSI411");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //------------------------------------------------------------------------------------------------------
                             //------------------------------------------------------------------------------------------------------
                             //------------------------------------------------------------------------------------------------------
                             //ONE RETAKE 2 CONDONED-----------------------------------------------------------------------------------------




                             //------------------------------------------------------------------------------------------------------
                             //------------------------------------------------------------------------------------------------------
                             //------------------------------------------------------------------------------------------------------
                             //ONE MODULE RETAKE-----------------------------------------------------------------------------------------

                             //ECSI404 Retake
                         } else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                     && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI404 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                                 //ECSI400 Retake
                             }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()  < 30) && (student.getLevel4Mod3() >= 40)
                                     && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI400 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                                 //ECSI412 Retake
                             }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() < 30)
                                     && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI412 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);


                                 //ECSI410 Retake
                             }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                     && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI410 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);


                                 //ECSI411 Retake
                             }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                     && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI411 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);


                                 //ECSI405 Retake
                             }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                     && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake1Mod(event);
                             Level4Controller.ErrorLabelRetake1("The module ECSI405 has to be re-taken.");
                             Level4Controller.LabelRetake1("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake1(event);
                             student.setCreditsL4(creditL4+=100);

                             //TWO MODULES RETAKE-----------------------------------------------------------------------------------------

                             //ECSI404 and ECSI400 Retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI404 and ECSI400 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake2Mod2("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI404 and ECSI412 Retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI404 and ECSI412 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake2Mod2("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI404 and ECSI410 Retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI404 and ECSI410 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake2Mod2("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI404 and ECSI411 Retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI404 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake2Mod2("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI404 and ECSI405 Retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6()< 30)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI404 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake2Mod2("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI400 and ECSI412 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3()< 30)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI400 and ECSI412 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake2Mod2("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI400 and ECSI410 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI400 and ECSI410 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake2Mod2("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI400 and ECSI411 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5()< 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI400 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake2Mod2("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);


                             //ECSI400 and ECSI405 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()< 30) && (student.getLevel4Mod3() >=  40)
                                 && (student.getLevel4Mod4() >=  40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6()  < 30)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI400 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake2Mod2("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);


                             //ECSI412 and ECSI410 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3()  <  30)
                                 && (student.getLevel4Mod4() <  30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI412 and ECSI410 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake2Mod2("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI412 and ECSI411 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() <  30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5()  < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI412 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake2Mod2("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI412 and ECSI405 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() <  30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI412 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake2Mod2("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI410 and ECSI411 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()< 30) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI410 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake2Mod2("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI410 and ECSI405 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4()< 30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI410 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake2Mod2("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //ECSI411 and ECSI405 Retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake2Mod(event);
                             Level4Controller.ErrorLabelRetake2("The modules ECSI411 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake2Mod1("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake2Mod2("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake2(event);
                             student.setCreditsL4(creditL4+=80);

                             //THREE MODULES RETAKE-----------------------------------------------------------------------------------------

                             //ECSI404 and ECSI400 and ECSI412 retake
                         }else if((student.getLevel4Mod1()  < 30) && (student.getLevel4Mod2()  < 30) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){


                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI400 and ECSI412 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod3("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);


                             //ECSI404 and ECSI400 and ECSI410 retake
                         }else if((student.getLevel4Mod1()  < 30) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI400 and ECSI410 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod3("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI400 and ECSI411 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2()  < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() < 30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI400 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod3("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI400 and ECSI405 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI400 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI410 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()  < 30) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI400, ECSI412 and ECSI410 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod2("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod3("ECSI410 - Software Development Principles 1");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI411 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3()< 30)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5()< 30 ) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI400, ECSI412 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod2("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod3("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI405 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()< 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI400, ECSI412 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod2("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI411 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() < 30 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI412, ECSI410 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod2("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod3("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()< 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI412, ECSI410 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod2("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI404 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4()< 30) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI412, ECSI410 and ECSI404 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod2("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod3("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);


                             //ECSI410 and ECSI411 and ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4()  < 30) && (student.getLevel4Mod5()  <30) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI410. ECSI411 and ECSI405 have to be re-taken..");
                             Level4Controller.LabelRetake3Mod1("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod2("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI410 and ECSI411 and ECSI404 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5()  <30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI410, ECSI411 and ECSI404 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod2("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod3("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI410 and ECSI411 and ECSI400 retake
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2()<30) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() < 30) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI410, ECSI411 and ECSI400 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod2("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod3("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI411 and ECSI405 and ECSI404 retake
                         }else if((student.getLevel4Mod1() < 30) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5()  <30) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI411, ECSI405 and ECSI404 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod2("ECSI405 - Software Development Principles 2");
                             Level4Controller.LabelRetake3Mod3("ECSI404 - Computer System Fundamentals");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);


                             //ECSI411 and ECSI405 and ECSI400 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() < 30) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI411, ECSI405 and ECSI400 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod2("ECSI405 - Software Development Principles 2");
                             Level4Controller.LabelRetake3Mod3("ECSI400 - Communication & Career Management");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI411 and ECSI405 and ECSI412 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() < 30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI411, ECSI405 and ECSI412 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI411 - Information Systems");
                             Level4Controller.LabelRetake3Mod2("ECSI405 - Software Development Principles 2");
                             Level4Controller.LabelRetake3Mod3("ECSI412 - Information & Data Modeling");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI412 and ECSI411 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() < 30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >=  40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI412 and ECSI411 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod3("ECSI411 - Information Systems");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI410 and ECSI405 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() <30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI410 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI410 and ECSI405 retake
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() <30) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() <30) && (student.getLevel4Mod5() <30) && (student.getLevel4Mod6() >=  40)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI400, ECSI410 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI400 - Communication & Career Management");
                             Level4Controller.LabelRetake3Mod2("ECSI410 - Software Development Principles 1");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI412 and ECSI405 retake
                         }else if((student.getLevel4Mod1() <30) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() <30)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() <30)){

                             controlL4.Retake3Mod(event);
                             Level4Controller.ErrorLabelRetake3("The modules ECSI404, ECSI412 and ECSI405 have to be re-taken.");
                             Level4Controller.LabelRetake3Mod1("ECSI404 - Computer System Fundamentals");
                             Level4Controller.LabelRetake3Mod2("ECSI412 - Information & Data Modeling");
                             Level4Controller.LabelRetake3Mod3("ECSI405 - Software Development Principles 2");
                             controlL4.handlebtnRetake3(event);
                             student.setCreditsL4(creditL4+=60);

                             //-----------------------------------------------------------------------------------------------------------------
                                     //NEED TO IMPROVE

                             //THREE MODULES AVERAGE BETWEEN 30 TO 40-----------------------------------------------------------------------------------------

                             //ECSI404 and ECSI400 and ECSI412 condoned
                         }else if((student.getLevel4Mod1()>=30 && student.getLevel4Mod1() < 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2() < 40) &&
                                 (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()< 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){
                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             if(student.getLevel4Mod1() < student.getLevel4Mod2() && student.getLevel4Mod1()< student.getLevel4Mod3()) {

                                 Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI400 have been Condoned and the Student has to retake ECSI404.");
                                 Level4Controller.LabelRetake1("ECSI404 - Computer System Fundamentals");
                             }else if(student.getLevel4Mod2() < student.getLevel4Mod1() && student.getLevel4Mod2()< student.getLevel4Mod3()) {

                                 Level4Controller.ErrorLabelRetake1("The modules ECSI412 and ECSI404 have been Condoned and the Student has to retake ECSI400.");
                                 Level4Controller.LabelRetake1("ECSI400 - Communication & Career Management");
                             }else if(student.getLevel4Mod3() < student.getLevel4Mod1() && student.getLevel4Mod3()< student.getLevel4Mod2()) {

                                 Level4Controller.ErrorLabelRetake1("The modules ECSI400 and ECSI404 have been Condoned and the Student has to retake ECSI412.");
                                 Level4Controller.LabelRetake1("ECSI412 - Information & Data Modeling");
                             }else{
                                 Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                                 Level4Controller.LabelRetake1("Enter retake module mark");
                             }

                             student.setCreditsL4(creditL4+=100);

                             //ECSI404 and ECSI400 and ECSI410 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) &&
                                 (student.getLevel4Mod2() >=30 && student.getLevel4Mod2() < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >= 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI400 and ECSI411 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1() > 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) &&
                                 (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5() < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI400 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) &&
                                 (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6() < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI410 condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) &&
                                 (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5()>=40 ) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI411 condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6() >=40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI412 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI411 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4() < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI412 and ECSI410 and ECSI404 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2() >= 40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=40 ) && (student.getLevel4Mod6()>=40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);


                             //ECSI410 and ECSI411 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI410 and ECSI411 and ECSI404 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI410 and ECSI411 and ECSI400 condoned
                         }else if((student.getLevel4Mod1() >= 40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6() >= 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI411 and ECSI405 and ECSI404 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2()>=40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);


                             //ECSI411 and ECSI405 and ECSI400 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) && (student.getLevel4Mod3() >= 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI411 and ECSI405 and ECSI412 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) &&
                                 (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI412 and ECSI411 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2() >=40) &&
                                 (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6() >=  40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI410 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI400 and ECSI410 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=40) && (student.getLevel4Mod2() >=30 && student.getLevel4Mod2()  < 40) && (student.getLevel4Mod3() >=40)
                                 && (student.getLevel4Mod4() >=30 && student.getLevel4Mod4()  < 40) && (student.getLevel4Mod5() >=30 && student.getLevel4Mod5()  < 40) && (student.getLevel4Mod6() >=  40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);

                             //ECSI404 and ECSI412 and ECSI405 condoned
                         }else if((student.getLevel4Mod1() >=30 && student.getLevel4Mod1()  < 40) && (student.getLevel4Mod2() >=40) && (student.getLevel4Mod3() >=30 && student.getLevel4Mod3()  < 40)
                                 && (student.getLevel4Mod4() >= 40) && (student.getLevel4Mod5() >=40) && (student.getLevel4Mod6() >=30 && student.getLevel4Mod6()  < 40)){

                             controlL4.Retake1Mod(event);
                             controlL4.handlebtnRetake1(event);
                             Level4Controller.ErrorLabelRetake1("Two modules have been Condoned and the Student has to retake the module with least marks");
                             Level4Controller.LabelRetake1("Enter retake module mark");
                             student.setCreditsL4(creditL4+=60);



                         } else {

                            Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL4.fxml"));
                            Stage errorStage = new Stage();
                            errorStage.setScene(new Scene(root8, 350, 160));
                            errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                            errorStage.setTitle("Eligibility Issue");
                            errorStage.show();
                            errorStage.setResizable(false);
                            Level4Controller.ErrorLabel("Sorry! You're not eligible to enter Level 05");
                        }
                    }

                } else {


                    if (!(markCSF1 >= 0 && markCSF1 <= 100)) {
                        fieldCSF1.clear();
                    } else if (!(markCSF2 >= 0 && markCSF2 <= 100)) {
                        fieldCSF2.clear();
                    } else if (!(markCSF3 >= 0 && markCSF3 <= 100)) {
                        fieldCSF3.clear();
                    } else if (!(markCom1 >= 0 && markCom1 <= 100)) {
                        fieldCom1.clear();
                    } else if (!(markCom2 >= 0 && markCom2 <= 100)) {
                        fieldCom2.clear();
                    } else if (!(markCom3 >= 0 && markCom3 <= 100)) {
                        fieldCom3.clear();

                    } else if (!(markIDM1 >= 0 && markIDM1 <= 100)) {
                        fieldIDM1.clear();
                    } else if (!(markIDM2 >= 0 && markIDM2 <= 100)) {
                        fieldIDM2.clear();
                    } else if (!(markIDM3 >= 0 && markIDM3 <= 100)) {
                        fieldIDM3.clear();

                    } else if (!(markSDP1_1 >= 0 && markSDP1_1 <= 100)) {
                        fieldSDP1_1.clear();
                    } else if (!(markSDP1_2 >= 0 && markSDP1_2 <= 100)) {
                        fieldSDP1_2.clear();
                    } else if (!(markSDP1_3 >= 0 && markSDP1_3 <= 100)) {
                        fieldSDP1_3.clear();

                    } else if (!(markIS1 >= 0 && markIS1 <= 100)) {
                        fieldIS1.clear();
                    } else if (!(markIS2 >= 0 && markIS2 <= 100)) {
                        fieldIS2.clear();
                    } else if (!(markIS3 >= 0 && markIS3 <= 100)) {
                        fieldIS3.clear();

                    } else if (!(markSDP2_1 >= 0 && markSDP2_1 <= 100)) {
                        fieldSDP2_1.clear();
                    } else if (!(markSDP2_2 >= 0 && markSDP2_2 <= 100)) {
                        fieldSDP2_2.clear();
                    } else if (!(markSDP2_3 >= 0 && markSDP2_3 <= 100)) {
                        fieldSDP2_3.clear();
                    }
                    lblInput.setText("Wrong Input! Please enter the marks for each exam out of 100");

                }


            }

        } catch (Exception e) {
            try {
                Parent root8 = FXMLLoader.load(getClass().getResource("ErrorL4.fxml"));
                Stage errorStage = new Stage();
                errorStage.setScene(new Scene(root8, 350, 160));
                errorStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
                errorStage.setTitle("Oops.....Empty Fields.");
                errorStage.show();
                errorStage.setResizable(false);
                Level4Controller.ErrorLabel("Oops!.....Some fields are empty. Please fill them to continue.");

            } catch (Exception ea) {

            }

        }
    }


}







