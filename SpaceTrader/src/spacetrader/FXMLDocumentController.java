/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import static org.controlsfx.dialog.Dialog.Actions.NO;
import static org.controlsfx.dialog.Dialog.Actions.YES;
import impl.org.controlsfx.i18n.Localization;
import impl.org.controlsfx.i18n.Translations;
import org.controlsfx.control.action.Action;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.controlsfx.dialog.Dialogs;

/**
 * FXML Controller class
 *
 * @author Olivia
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private AnchorPane loadingPane;
    @FXML
    private ImageView imageView;
    @FXML
    private Label label;
    @FXML
    private Button loadGameButton;
    @FXML
    private Button newGameButton;
    @FXML
    private Button optionsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void handleNewGameButtonAction(ActionEvent event) {
        //launches a simple dialouge box and collects user input. Just testing out
        //the controlsFX API
        
        //as far as I can tell we should be able to make the dialog box contents
        //in a seperate file, create it as a new content object, and launch it that way
        //api here: http://controlsfx.bitbucket.org/org/controlsfx/dialog/Dialog.html
        Action response = Dialogs.create()
                .title("You do want dialogs right?")
                .masthead("Just Checkin'")
                .message( "I was a bit worried that you might not want them, so I wanted to double check.")
                .showConfirm();
    }
    
        @FXML
    private void handleLoadButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleOptionButtonAction(ActionEvent event) {
    }
    
}
