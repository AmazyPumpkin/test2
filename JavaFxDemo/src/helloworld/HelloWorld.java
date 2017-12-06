package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Click me!");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("hello world");
			}
		});

		StackPane root = new StackPane(button);
		Scene scene = new Scene(root, 200, 500);
		primaryStage.setTitle("哈哈");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}