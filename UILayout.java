package com.dkukor.uilayout;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;


public class UILayout extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Button btn = new Button();
			btn.setText("Say 'Hello World'");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hello World!");
				}							
			});
			
			BorderPane root = new BorderPane();

			Circle cir = new Circle(150, 125, 70);
			
			root.setCenter(cir);
			root.setTop(btn);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Hello World!");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
