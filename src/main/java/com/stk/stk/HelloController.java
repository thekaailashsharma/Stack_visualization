package com.stk.stk;

import javafx.animation.PathTransition;
import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

import java.util.Arrays;

public class HelloController {
    int[] stk = new int[6];
    public int n = 1;
    private int top;
    boolean num = false;
    Stack S = new Stack(stk);
    @FXML
    private RadioButton pop;

    @FXML
    private RadioButton push;

    @FXML
    private Button b1;

    @FXML
    private TextField enter_Push;

    @FXML
    private Button e10;

    @FXML
    private Button e11;

    @FXML
    private Button e12;

    @FXML
    private Button e13;

    @FXML
    private Button e14;

    @FXML
    private Button e15;

    @FXML
    private Button pushB;

    @FXML
    private Label l1;

    @FXML
    private Label topL;

    @FXML
    private Button popB;

    @FXML
    private ImageView sf;

    @FXML
    private Pane pane;

    @FXML
    private TextArea textArea;


    @FXML
    public void initialize(){
        textArea.setStyle("-fx-control-inner-background:#000000; -fx-font-family: Consolas; -fx-highlight-fill: #00ff00;" +
                " -fx-highlight-text-fill: #000000; -fx-text-fill: #00ff00; ");
        ToggleGroup t = new ToggleGroup();
        push.setToggleGroup(t);
        pop.setToggleGroup(t);
        t.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                if (pop.isSelected()){
                    enter_Push.setVisible(false);
                    pushB.setVisible(false);
                    popB.setVisible(true);
                }
                else if (push.isSelected()){
                    enter_Push.setVisible(true);
                    pushB.setVisible(true);
                    popB.setVisible(false);
                }
            }
        });
    }

    @FXML
    public void pop() {
        top = S.peek();
        if (top == -1) {
            l1.setText("Stack Empty!!!");
            l1.setVisible(true);
            l1.setTextFill(Color.WHITE);
            enter_Push.clear();
            PauseTransition p1 = new PauseTransition();
            p1.setDuration(Duration.seconds(2));
            p1.setOnFinished(E -> {
                l1.setVisible(false);
            });
            p1.play();
            if (textArea.getText().equals("\n" +
                    "\n" +
                    "     No\n" +
                    "   Activity \n" +
                    "  Currently \n" +
                    "     :)")) {
                textArea.clear();
            }
            textArea.appendText(n+". Stack Empty \n");
            n++;
        } else {
            b1.setVisible(true);
            int k = S.pop();
            stk[top] = 0;
            System.out.println(Arrays.toString(stk));
            b1.setText(String.valueOf(k));
            if (textArea.getText().equals("\n" +
                    "\n" +
                    "     No\n" +
                    "   Activity \n" +
                    "  Currently \n" +
                    "     :)")) {
                textArea.clear();
            }
            textArea.appendText(n+". Pop -> "+ k + "\n");
            n++;
            PathTransition p = new PathTransition();
            Polyline poly = new Polyline();
            Path path = new Path();
            path.getElements().add(new MoveTo());
            p.setDuration(Duration.seconds(5));
            p.setNode(b1);
            p.setPath(poly);
            p.setAutoReverse(false);
            p.setCycleCount(1);
            if (top == 0) {
                poly.getPoints().addAll(255.0, 130.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e10.setVisible(false);
                topL.setVisible(false);
                p.setOnFinished(e -> {
                    b1.setVisible(false);

                });
            } else if (top == 1) {
                poly.getPoints().addAll(255.0, 105.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e11.setVisible(false);
                topL.setVisible(true);
                topL.setLayoutY(310.0);
                p.setOnFinished(e -> {

                    b1.setVisible(false);

                });
            } else if (top == 2) {
                poly.getPoints().addAll(255.0, 80.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e12.setVisible(false);
                topL.setVisible(true);
                topL.setLayoutY(279.0);
                p.setOnFinished(e -> {
                    b1.setVisible(false);

                });
            } else if (top == 3) {
                poly.getPoints().addAll(255.0, 30.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e13.setVisible(false);
                topL.setVisible(true);
                topL.setLayoutY(248.0);
                p.setOnFinished(e -> {
                    b1.setVisible(false);

                });
            } else if (top == 4) {
                poly.getPoints().addAll(255.0, 20.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e14.setVisible(false);
                topL.setVisible(true);
                topL.setLayoutY(219.0);
                p.setOnFinished(e -> {
                    b1.setVisible(false);

                });
            } else if (top == 5) {
                poly.getPoints().addAll(255.0, -12.0, 250.0, -110.0, 90.0, -110.0, 100.0, 90.0);
                e15.setVisible(false);
                p.setOnFinished(e -> {
                    topL.setVisible(true);
                    topL.setLayoutY(189.0);
                    b1.setVisible(false);

                });
            }
            p.play();
        }
    }


    @FXML
    public void enter(){
        try {
            stk =  S.push(Integer.parseInt(enter_Push.getText()));
            if (Arrays.equals(stk, new int[0])){
                System.out.println("Array is: " + Arrays.toString(stk));
                l1.setText("Stack Full!!!");
                l1.setVisible(true);
                l1.setTextFill(Color.WHITE);
                enter_Push.clear();
                PauseTransition p1 = new PauseTransition();
                p1.setDuration(Duration.seconds(2));
                p1.setOnFinished(E -> {l1.setVisible(false);});
                p1.play();
                textArea.appendText(n+". Stack Full \n");
                n++;
            }
            else {
            b1.setVisible(true);
            if (textArea.getText().equals("\n" +
                    "\n" +
                    "     No\n" +
                    "   Activity \n" +
                    "  Currently \n" +
                    "     :)")) {
                textArea.clear();
            }
            textArea.appendText(n + ". Push -> "+ enter_Push.getText() + "\n");
            n++;
            enter_Push.clear();
            enter_Push.setDisable(true);
            pushB.setText("Wait!!");
            pushB.setDisable(true);
            System.out.println(Arrays.toString(stk));
            top = S.peek();
            System.out.println(top);
            PathTransition p = new PathTransition();
            Polyline poly = new Polyline();
            Path path = new Path();
            path.getElements().add(new MoveTo());
            p.setDuration(Duration.seconds(5));
            p.setNode(b1);
            b1.setText(String.valueOf(stk[top]));
            p.setPath(poly);
            p.setAutoReverse(false);
            p.setCycleCount(1);
            if (top == 0){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,130.0);
                p.setOnFinished(e -> {
                    enter_Push.setDisable(false);
                    enter_Push.requestFocus();
                    pushB.setDisable(false);
                    pushB.setText("Push");
                    topL.setVisible(true);
                    topL.setLayoutY(310.0);
                    e10.setVisible(true);
                    e10.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
            }
            else if (top == 1){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,105.0);
                p.setOnFinished(e -> {
                    pushB.setDisable(false);
                    enter_Push.requestFocus();
                    pushB.setText("Push");
                    enter_Push.setDisable(false);
                    topL.setVisible(true);
                    topL.setLayoutY(279.0);
                    e11.setVisible(true);
                    e11.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
            }
            else if (top == 2){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,80.0);
                p.setOnFinished(e -> {
                    pushB.setDisable(false);
                    pushB.setText("Push");
                    enter_Push.requestFocus();
                    enter_Push.setDisable(false);
                    topL.setVisible(true);
                    topL.setLayoutY(248.0);
                    e12.setVisible(true);
                    e12.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
            }
            else if (top == 3){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,30.0);
                p.setOnFinished(e -> {
                    pushB.setDisable(false);
                    pushB.setText("Push");
                    enter_Push.setDisable(false);
                    enter_Push.requestFocus();
                    topL.setVisible(true);
                    topL.setLayoutY(219.0);
                    e13.setVisible(true);
                    e13.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
            }
            else if (top == 4){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,20.0);
                p.setOnFinished(e -> {
                    pushB.setDisable(false);
                    pushB.setText("Push");
                    enter_Push.requestFocus();
                    enter_Push.setDisable(false);
                    topL.setVisible(true);
                    topL.setLayoutY(189.0);
                    e14.setVisible(true);
                    e14.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
            }
            else if (top == 5){
                poly.getPoints().addAll(90.0,100.0,90.0,-110.0, 250.0,-110.0, 255.0,-12.0);
                p.setOnFinished(e -> {
                    pushB.setDisable(false);
                    pushB.setText("Push");
                    enter_Push.requestFocus();
                    enter_Push.setDisable(false);
                    topL.setVisible(true);
                    topL.setLayoutY(157.0);
                    e15.setVisible(true);
                    e15.setText(String.valueOf(stk[top]));
                    b1.setVisible(false);});
//                    sf.setVisible(true);
            }

            p.play();
        }}

        catch (NumberFormatException e){
            l1.setText("Please Enter Numeric \n Values only");
            l1.setVisible(true);
            l1.setTextFill(Color.RED);
            enter_Push.clear();
            PauseTransition p = new PauseTransition();
            p.setDuration(Duration.seconds(2));
            p.setOnFinished(E -> {l1.setVisible(false);});
            p.play();
            if (textArea.getText().equals("\n" +
                    "\n" +
                    "     No\n" +
                    "   Activity \n" +
                    "  Currently \n" +
                    "     :)")) {
                textArea.clear();
            }
            textArea.appendText(n+". Numeric values only \n");
            n++;
        }

    }



}
class Stack{
    private int[] array;
    private int top;
    private final int max;
    Stack(int[] a){
        array = a;
        top = -1;
        max = 6;
    }
    public int[] push(int x){
        if (!full()){
            array[++top] = x;
            return array;
        }
        return new int[0];
    }

    public int pop(){
        if (!empty()){
            return array[top--];
        }
        return 0;
    }
    public int peek()
    {
        if (!empty()) {
            return top;
        }

        return -1;
    }

    public boolean empty(){
        return top == -1;
    }
    public boolean full(){
        return top == max-1;
    }
}