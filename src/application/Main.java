package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage Stage) throws IOException {
		
			Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
			Scene scene = new Scene(root);
			Stage.setTitle("Ndaliz MP3-player");
			Stage.resizableProperty().set(false);
			Stage.setScene(scene);
			Stage.show();
			
			Stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

				@Override
				public void handle(WindowEvent arg0) {

					Platform.exit();
					System.exit(0);
				}
				
			});
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
