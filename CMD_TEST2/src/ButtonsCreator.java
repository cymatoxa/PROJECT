import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonsCreator {

	private static CommandCreator commandCreator = new CommandCreator();

	public static Button getUtilsButton(String text) {
		Button utilsButton = new Button(text);
		utilsButton.setMinSize(200, 600);
		utilsButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				SceneChanger.changeStage(utilsButton.getText());
			}
		});
		return utilsButton;
	}

	public static Button getCmdButton(String text) {
		Button cmdButton = new Button(text);
		cmdButton.setMinSize(200, 600);
		cmdButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				SceneChanger.changeStage(cmdButton.getText());
			}
		});
		return cmdButton;
	}

	public static Button getBackButton(String text) {
		Button backButton = new Button(text);
		backButton.setMinSize(400, 212);

		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				SceneChanger.changeStage(backButton.getText());

			}

		});
		return backButton;
	}

	public static ArrayList<Button> getUtilsButtons(String[] utilButtonsNames) {
		ArrayList<Button> utilsButtons = new ArrayList<Button>();

		for (int i = 0; i < utilButtonsNames.length; i++) {
			utilsButtons.add(new Button(utilButtonsNames[i]));
		}
		for (Button button : utilsButtons) {
			button.setMinSize(400, 30);
			button.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					commandCreator.startCommand(button);
				}
			});
		}

		return utilsButtons;

	}

	public static ArrayList<Button> getCmdButtons(String[] cmdButtonsNames) {
		ArrayList<Button> cmdButtons = new ArrayList<Button>();

		for (int i = 0; i < cmdButtonsNames.length; i++) {
			cmdButtons.add(new Button(cmdButtonsNames[i]));
		}
		for (Button button : cmdButtons) {
			button.setMinSize(150, 30);
			button.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					ProcessCreator.startProcessor(button);
				}
			});
		}

		return cmdButtons;

	}
}