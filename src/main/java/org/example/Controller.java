package org.example;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.example.sourceClass.Head;


public class Controller {

    private Head head = new Head("Здоровый");


    @FXML
    private URL location;

    @FXML
    private TextArea signalsId;

    @FXML
    private Label mouthSize;

    @FXML
    private Label mouthWeight;

    @FXML
    private Label noseForm;

    @FXML
    private Label noseWeight;

    @FXML
    private Label brainType;

    @FXML
    private Label brainWeight;

    @FXML
    void eat(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organ.get(2).eat(head.organ.get(0).getKpd());

        u.messageBox("Поел", messageFromTheMouth);
        signalsId.setText(head.organ.get(0).receiveSignal("Поел", messageFromTheMouth) + signalsId.getText());
    }

    @FXML
    void menuButtonCrazy(ActionEvent event) {
        setTypeBrain("Неадекват");
    }

    @FXML
    void menuButtonHealthy(ActionEvent event) {
        setTypeBrain("Здоровый");
    }

    @FXML
    void menuButtonSick(ActionEvent event) {
        setTypeBrain("Приболел");
    }

    @FXML
    void itch(ActionEvent event) {
        Util u = new Util();
        String messageFromTheNose = head.organ.get(1).itch(head.organ.get(0).getKpd());

        u.messageBox("Почесался", messageFromTheNose);
        signalsId.setText(head.organ.get(0).receiveSignal("Почесался", messageFromTheNose) + signalsId.getText());
    }

    @FXML
    void sniff(ActionEvent event) {
        Util u = new Util();
        String messageFromTheNose = head.organ.get(1).sniff(head.organ.get(0).getKpd());

        u.messageBox("Понюхал", messageFromTheNose);
        signalsId.setText(head.organ.get(0).receiveSignal("Понюхал", messageFromTheNose) + signalsId.getText());
    }

    @FXML
    void speak(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organ.get(2).speak(head.organ.get(0).getKpd());

        u.messageBox("Пообщался", messageFromTheMouth);
        signalsId.setText(head.organ.get(0).receiveSignal("Пообщался", messageFromTheMouth) + signalsId.getText());
    }

    @FXML
    void initialize() {
        setLabels();
    }

    public void setLabels(){
        brainType.setText(head.organ.get(0).getKpd());
        brainWeight.setText("Весс: " + Integer.toString(head.organ.get(0).getWeight()));
        noseForm.setText("Форма: " + head.organ.get(1).getForm());
        noseWeight.setText("Весс: " + Integer.toString(head.organ.get(1).getWeight()));
        mouthSize.setText("Размер: " + head.organ.get(2).getSize());
        mouthWeight.setText("Весс: " +Integer.toString(head.organ.get(2).getWeight()));
    }

    public void setTypeBrain(String typeBrain){
        signalsId.setText("");
        head.organ.get(0).manegeOrgan(typeBrain);
        head.organ.get(1).setParameter();
        head.organ.get(2).setParameter();
        setLabels();
    }

}
