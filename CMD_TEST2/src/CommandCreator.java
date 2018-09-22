import javafx.scene.control.Button;

public class CommandCreator {

	public void startCommand(Button button) {
		try {
			Runtime rt = Runtime.getRuntime();

			rt.exec(new String[] { "cmd.exe", "/c", button.getText() });

		} catch (Exception ex) {
			DialogCreator.showMassage(ex.getMessage());
		}
	}
}
