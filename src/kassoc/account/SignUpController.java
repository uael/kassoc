package kassoc.account;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
import kassoc.core.BaseController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * The type Sign up controller.
 */
public class SignUpController extends BaseController implements javafx.fxml.Initializable {
    /**
     * The Back to login action btn.
     */
    public Button backToLoginActionBtn;
    /**
     * The Mail input.
     */
    public TextField mailInput;
    /**
     * The Pwd input.
     */
    public PasswordField pwdInput;
    /**
     * The Confirm pwd input.
     */
    public PasswordField confirmPwdInput;
    /**
     * The Sdt n input.
     */
    public TextField sdtNInput;
    /**
     * The Sign up btn.
     */
    public Button signUpBtn;
    /**
     * The Sign up pane.
     */
    public TitledPane signUpPane;

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        signUpPane.setCollapsible(false);
    }

    /**
     * Back to login action.
     * @param e the e
     * @throws IOException the io exception
     */
    public void backToLoginAction(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setTitle("Pimp My Assoc - Login");
        gotoScene(stage, "login.fxml");
    }

    /**
     * Sign up action.
     * @param e the e
     * @throws IOException the io exception
     */
    public void signUpAction(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setTitle("Pimp My Assoc - Dashboard");
        gotoScene(stage, "../dashboard.fxml");
    }
}
