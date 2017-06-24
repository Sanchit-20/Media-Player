package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	Player player;
	@Override
	public void start(Stage primaryStage) {
		
		MenuBar menu = new MenuBar();
		Menu file = new Menu("file");
		MenuItem open = new MenuItem("Open");
		
		menu.getMenus().add(file);
		file.getItems().add(open);

		final FileChooser filechooser = new FileChooser();
		filechooser.setTitle("Open resource file");
				
		String path = new File("C:\\a.mp4").getAbsolutePath();
		player = new Player(path);
		player.setTop(menu);
		Scene scene = new Scene(player,720,535,Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Media Player");
		primaryStage.show();
	}
}