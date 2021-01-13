package com.justmenu;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjavafx.schedulers.JavaFxScheduler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private static final String TITLE = "Just Menu";
	private static Scene scene;

	public static Scene getPrimaryScene() {
		return scene;
	}

	@Override
	public void start(Stage stage) throws IOException {
		setStageIcon(stage);
		scene = new Scene(loadFXML("primary"));
		stage.setScene(scene);
		stage.show();
	}

	public static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}

	public static void main(String[] args) {
		launch();
	}

	private static void setStageIcon(Stage stage) {
		stage.setIconified(false);
		stage.setTitle(TITLE);
		Observable.interval(1, TimeUnit.SECONDS, JavaFxScheduler.platform()).map(next -> TITLE + " " + (next + 1)).map(String::valueOf).subscribe(stage::setTitle);
		stage.setMaximized(true);
	}

}