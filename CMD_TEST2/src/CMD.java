import javafx.application.Application;
import javafx.stage.Stage;

public class CMD extends Application {
	static Stage ps;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ps = primaryStage;
		ps.setResizable(false);
		ps.setScene(SceneCreator.getMainScene());

		ps.setTitle("Панель управления");
		ps.show();
	}
}
