package edu.uab.dgreen.mavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

  @FXML ImageView imageView;

  @FXML
  private void switchToSecondary() throws IOException {
    App.setRoot("secondary");
  }

  @FXML
  private void loadTheImage() throws FileNotFoundException {
    imageView.setImage(new Image(new FileInputStream("thumbsup.jpg")));
  }
}
