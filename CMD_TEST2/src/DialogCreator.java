import javax.swing.JOptionPane;

public class DialogCreator {
	 public static void showMassage(String infoMessage)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "Ошибка", JOptionPane.INFORMATION_MESSAGE);
	    }
}
