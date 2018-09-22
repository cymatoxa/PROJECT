import javafx.scene.Scene;

public class SceneCreator {
	private static Scene mainScene = new Scene(RootCreator.getMainRoot(), 400, 600);
	private static Scene utilsScene = new Scene(RootCreator.getUtilsRoot(), 400, 600);
	private static Scene cmdScene = new Scene(RootCreator.getCmdRoot(), 400, 600);

	public static Scene getMainScene() {
		return mainScene;

	}

	public static Scene getCmdScene() {
		return cmdScene;

	}

	public static Scene getUtilsScene() {
		return utilsScene;

	}
}
