
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RootCreator {
	protected final static String[] BUTTON_UTILS_NAME = { "regedit.exe", "msconfig.exe", "diskmgmt.msc", "Netplwiz.exe",
			"comexp.msc", "devmgmt.msc", "printmanagement.msc", "services.msc", "taskschd.msc", "hdwwiz.exe",
			"msinfo32.exe", "osk.exe" };
	protected final static String BUTTON_UTIL_NAME = "Утилиты";
	protected final static String BUTTON_CMD_NAME = "CMD";
	protected final static String BUTTON_BACK_NAME = "Назад";
	protected final static String[] BUTTON_CMDS_NAME = { "getMac", "ipconfig", "ping", "tracert", "route" };
	protected final static String[] BATTON_NAME = { "Утилиты", "CMD" };

	public static Parent getMainRoot() {

		HBox mainRoot = new HBox();
		try {
			mainRoot.getChildren().add(ButtonsCreator.getUtilsButton(BUTTON_UTIL_NAME));
			mainRoot.getChildren().add(ButtonsCreator.getCmdButton(BUTTON_CMD_NAME));
		} catch (NullPointerException ex) {
			DialogCreator.showMassage(ex.getMessage());
		}
		return mainRoot;
	}

	public static Parent getCmdRoot() {
		VBox cmdRoot = new VBox();
		TextField textField1 = new TextField();
		try {
			cmdRoot.getChildren().addAll(ButtonsCreator.getCmdButtons(BUTTON_CMDS_NAME));
			cmdRoot.getChildren().add(ButtonsCreator.getBackButton(BUTTON_BACK_NAME));
			cmdRoot.getChildren().add(textField1);
		} catch (NullPointerException ex) {
			DialogCreator.showMassage(ex.getMessage());
		}
		return cmdRoot;
	}

	public static Parent getUtilsRoot() {
		VBox utilsRoot = new VBox();
		try {
			utilsRoot.getChildren().addAll(ButtonsCreator.getUtilsButtons(BUTTON_UTILS_NAME));
			utilsRoot.getChildren().add(ButtonsCreator.getBackButton(BUTTON_BACK_NAME));
		} catch (NullPointerException ex) {
			DialogCreator.showMassage(ex.getMessage());
		}
		return utilsRoot;
	}

}
