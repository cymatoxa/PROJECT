
public class SceneChanger {
	public static void changeStage(String text) {
		try {
			switch (text) {
			case "Утилиты":
				CMD.ps.setScene(SceneCreator.getUtilsScene());
				CMD.ps.setTitle("Утилиты");
				break;
			case "CMD":
				CMD.ps.setScene(SceneCreator.getCmdScene());
				CMD.ps.setTitle("CMD");
				break;
			case "Назад":
				CMD.ps.setScene(SceneCreator.getMainScene());
				CMD.ps.setTitle("Панель управления");
				break;
			}
		} catch (NullPointerException ex) {
			DialogCreator.showMassage(ex.getMessage());
		}
	}
}