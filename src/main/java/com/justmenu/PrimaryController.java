package com.justmenu;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.layout.AnchorPane;

public class PrimaryController {

	@FXML
	private MenuBar menuBar;

	@FXML
	CheckMenuItem checkMenuItem1min;

	@FXML
	CheckMenuItem checkMenuItem5min;

	@FXML
	CheckMenuItem checkMenuItem10min;

	@FXML
	CheckMenuItem checkMenuItem15min;

	@FXML
	RadioMenuItem radioMenuItemSoundVoice;

	@FXML
	RadioMenuItem radioMenuItemSoundDing;

	@FXML
	RadioMenuItem radioMenuItemSoundNone;

	@FXML
	RadioMenuItem radioMenuItemClockStrikeNone;

	@FXML
	RadioMenuItem radioMenuItemClockStrike15min;

	@FXML
	RadioMenuItem radioMenuItemClockStrike30min;

	@FXML
	RadioMenuItem radioMenuItemClockStrike60min;
	
	@FXML
	AnchorPane anchorPane;

	@FXML
	protected void initialize() {
		if (OSValidator.isMac()) {
			menuBar.useSystemMenuBarProperty().set(true);
			// Used to remove menubar space
			AnchorPane.setTopAnchor(anchorPane, 0.0);
			menuBar.setVisible(false);
		}
	}

	@FXML
	private void openAbout() throws IOException {
		App.setRoot("about");
	}

	@FXML
	private void checkMenuItemClick() {
		System.out.println("Clicked check");
	}

	@FXML
	private void radioMenuItemClick() {
		System.out.println("Clicked radio");
	}

}
