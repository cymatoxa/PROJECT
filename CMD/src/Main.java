import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec(new String[] { "cmd.exe", "/c", "start diskmgmt.msc" });

		} catch (IOException e) {

			e.printStackTrace();

		}
		System.out.println("test");
	}

}