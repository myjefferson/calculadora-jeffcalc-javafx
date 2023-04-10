//AUTHOR: JEFFERSON CARVALHO DOS SANTOS
//GITHUB: https://github.com/myjefferson
package com.example.av1_fx_jeffersoncarvalhodossantos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javax.script.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Objects;

public class CalculadoraController {
    @FXML private TextField textFieldResult;
    public void setTextField(String valueText) {
        System.out.println(textFieldResult.getText());
        System.out.println(textFieldResult.getText().length());
        if (textFieldResult.getText().length() == 1 && Objects.equals(textFieldResult.getText(), "0")){
            textFieldResult.setText("");
        }
        textFieldResult.setText(textFieldResult.getText() + valueText);
    }
    @FXML private void handleButtonClearField(ActionEvent e){ textFieldResult.setText("0"); }
    @FXML private void handleButtonSum(ActionEvent e){ setTextField("+"); }
    @FXML private void handleButtonSubtraction(ActionEvent e){ setTextField("-"); }
    @FXML private void handleButtonDivision(ActionEvent e){
        setTextField("/");
    }
    @FXML private void handleButtonMultiplication(ActionEvent e){ setTextField("*"); }
    @FXML private void handleButtonZero(ActionEvent e){
        setTextField("0");
    }
    @FXML private void handleButtonOne(ActionEvent e){
        setTextField("1");
    }
    @FXML private void handleButtonTwo(ActionEvent e){
        setTextField("2");
    }
    @FXML private void handleButtonThree(ActionEvent e){
        setTextField("3");
    }
    @FXML private void handleButtonFour(ActionEvent e){
        setTextField("4");
    }
    @FXML private void handleButtonFive(ActionEvent e){
        setTextField("5");
    }
    @FXML private void handleButtonSix(ActionEvent e){
        setTextField("6");
    }
    @FXML private void handleButtonSeven(ActionEvent e){
        setTextField("7");
    }
    @FXML private void handleButtonEight(ActionEvent e){ setTextField("8"); }
    @FXML private void handleButtonNine(ActionEvent e){ setTextField("9"); }
    @FXML private void handleButtonEquals(ActionEvent e) {
        textFieldResult.setText(Calculator(textFieldResult.getText()));
    }
    @FXML private void handleBackspace(ActionEvent e)
    {
        if(textFieldResult.getText().length() > 0){
            textFieldResult.setText(textFieldResult.getText().substring(0, textFieldResult.getText().length() - 1));
        }

        if(textFieldResult.getText().length() == 0){
            textFieldResult.setText("0");
        }
    }

    public static String Calculator(String str) {
        String numberStr[] = str.replaceAll("[+*/()-]+"," ").split(" ");
        String operatorStr[] = str.replaceAll("[0-9()]+","").split("");

        int total = Integer.parseInt(numberStr[0]);

        for (int i = 0; i < operatorStr.length; i++) {
            switch (operatorStr[i]) {
                case "+" :
                    total += Integer.parseInt(numberStr[i+1]);
                    break;
                case "-" :
                    total -= Integer.parseInt(numberStr[i+1]);
                    break;
                case "*" :
                    total *= Integer.parseInt(numberStr[i+1]);
                    break;
                case "/" :
                    total /= Integer.parseInt(numberStr[i+1]);
                    break;
            }

            if(i+2 >= operatorStr.length) continue;
            numberStr[i+1] = String.valueOf(total);
        }
        return String.valueOf(total);
    }
}