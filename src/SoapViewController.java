import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class SoapViewController implements Initializable {
    @FXML
    private ChoiceBox soapChoiceBox;

    @FXML
    private Label brandLabel;

    @FXML
    private Label intendedUseLabel;

    @FXML
    private Label volumeLabel;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //sample soaps
        LiquidSoap soap1 = new LiquidSoap("Palmolive", "Dish", 887, new Image("palmolive.jpg"));
        LiquidSoap soap2 = new LiquidSoap("Dawn", "Dish", 8000, new Image("dawn.jpg"));
        LiquidSoap soap3 = new LiquidSoap("Meyers", "Floor", 370, new Image("meyers.jpg"));
        LiquidSoap soap4 = new LiquidSoap("Soft Soap", "Hand", 236, new Image("lemon.jpg"));
        LiquidSoap soap5 = new LiquidSoap("Murphys", "Floor", 473, new Image("murphys.jpg"));

        //add soaps to choice box
        soapChoiceBox.getItems().add(soap1.toString());
        soapChoiceBox.getItems().add(soap2.toString());
        soapChoiceBox.getItems().add(soap3.toString());
        soapChoiceBox.getItems().add(soap4.toString());
        soapChoiceBox.getItems().add(soap5.toString());

        //default values
        soapChoiceBox.setValue(soap1.toString());
        imageView.setImage(soap1.getImage());
        brandLabel.setText(soap1.getBrandName());
        intendedUseLabel.setText(soap1.getIntendedUse());
//        volumeLabel.setText(soap1.getVolume());
    }
}
