package application;

import java.io.File;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane{
	Media me;
	MediaPlayer mp;
	MediaView mv;
	Pane mpane;
	MediaBar bar;
	public Player(String file)
	{
		me = new Media(new File(file).toURI().toString());
		mp = new MediaPlayer(me);
		mv = new MediaView(mp);
		mpane = new Pane();
		mpane.getChildren().add(mv);
		setCenter(mpane);
		bar = new MediaBar(mp);
		setBottom(bar);
		mp.play();
	}
}
