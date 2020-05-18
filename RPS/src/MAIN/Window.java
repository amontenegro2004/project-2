package MAIN;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Window {

	private static JFrame j;
	public Window() {
		j = new JFrame();
	}
	public static void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	
	public static String in(JFrame fram, String msg) {
		return JOptionPane.showInputDialog(fram, msg);
	}
	 
	public static int option(String[] options, String msg) {
		return JOptionPane.showOptionDialog(
				j, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	public static int option1(Object[] options, String msg, Icon i) {
        return JOptionPane.showOptionDialog(
                j, 
                msg, // my message
                null, // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                i, 
                options, // possible options
                options[0]); // default option
    }
	
	
	public static void println(String msg) {
		System.out.println(msg);
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void msg(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String in(Object msg) {
		return JOptionPane.showInputDialog(msg);
	}
	public static void msg2(String msg, Icon i){
        JOptionPane.showMessageDialog(
                j, 
                msg, 
                null, 
                JOptionPane.DEFAULT_OPTION, 
                i); 
    }
	public static String image(String msg, Icon i)
	{
		return JOptionPane.showInputDialog(msg, i);
	}
	
	/*public static Object image() { 
	JOptionPane.showInputDialog(
			null,//Component parentComponent,
            null,//Object message,
            null,//String title,
            null,//int messageType,
            ImageIcon icon,
            null,//Object[] selectionValues,
            null);//Object initialSelectionValue);
	}*/
	public static int option(Object[] options, Object msg) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	

	public static String in(Object msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static int opt(Object[] o, Object msg, String ttl) {
		return JOptionPane.showOptionDialog(
				null, msg, ttl, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				o, 
				0);
	}
	public static int option1(JComboBox questions, String msg, ImageIcon temp) {
		// TODO Auto-generated method stub
		return JOptionPane.showOptionDialog(questions, msg, null, 0, 0, temp, null, null);
	}

}
