
import java.io.IOException;

import javafx.scene.control.Button;

public class ProcessCreator {
	public static void startProcessor(Button button) {
		try {
			String s = get_commandline_results(button.getText());
			System.out.println(s);
			Writer.writeFile("asdf.txt", s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

	public static String get_commandline_results(String cmd)
			throws IOException, InterruptedException, IllegalException {
		if (!authorizedCommand(cmd))
			throw new IllegalException();

		String result = "";
		final Process p = Runtime.getRuntime().exec(String.format("cmd /c %s", cmd));
		final ProcessResultReader stderr = new ProcessResultReader(p.getErrorStream(), "CP866");
		final ProcessResultReader stdout = new ProcessResultReader(p.getInputStream(), "CP866");
		stderr.start();
		stdout.start();
		final int exitValue = p.waitFor();
		if (exitValue == 0) {
			result = stdout.toString();
		} else {
			result = stderr.toString();
		}
		return result;
	}

	public static boolean authorizedCommand(String cmd) {
		if (cmd.equals("getMac") || cmd.equals("ipconfig") || cmd.equals("ping") || cmd.equals("tracert")
				|| cmd.equals("route"))
			return true;
		return false;
	}
}
