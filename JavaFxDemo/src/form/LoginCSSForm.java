package form;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginCSSForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(10);
		grid.setVgap(15);
		grid.setPadding(new Insets(50, 25, 25, 25));

		Text scenetitile = new Text("welcome");
		scenetitile.setId("welcome_text");
		//scenetitile.setFont(Font.font("微软雅黑", FontWeight.NORMAL, 20));
		grid.add(scenetitile, 0, 0, 2, 1);

		Label userName = new Label("Username:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);

		// grid.setGridLinesVisible(true);

		final Text actiontarget = new Text();
		actiontarget.setId("actiontarget");
		grid.add(actiontarget, 1, 6);

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("signed button clicked");

			}
		});

		Scene scene = new Scene(grid, 300, 275);
		System.out.println(LoginCSSForm.class.getResource("login.css").toExternalForm());
		scene.getStylesheets().add(LoginCSSForm.class.getResource("login.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
