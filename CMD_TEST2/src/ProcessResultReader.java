import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessResultReader extends Thread {
	private final InputStream is;
	private String type = "CP866";
	private final StringBuilder sb;

	ProcessResultReader(final InputStream is, String type) {
		this.is = is;
		this.type = type;
		this.sb = new StringBuilder();
	}

	public void run() {
		try {
			final InputStreamReader isr = new InputStreamReader(is,type);
			final BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				this.sb.append(line).append("\n");
			}
		} catch (final IOException ioe) {
			System.err.println(ioe.getMessage());
			throw new RuntimeException(ioe);
		}
	}

	@Override
	public String toString() {
		return this.sb.toString();
	}
}