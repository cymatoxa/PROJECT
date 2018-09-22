import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public static void writeFile(String name, String text) {
		try (FileWriter writer = new FileWriter(name, false)) {
			writer.write(text);
			writer.flush();
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}