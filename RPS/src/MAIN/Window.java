package MAIN;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Window {
//INSTANCE VARIABLES
	private static JFrame j;
	
	/*Method that sets up the jframe and initializes the declared jframe
	*/
	public Window() {
		j = new JFrame();
	}
	
	/* Method that displays a message dialog box with a message
	*/
	public static void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	
	/* Method that displays a message dialog box with a message and takes user input in a jframe
	*/
	
	
	public static String in(JFrame fram, String msg) {
		return JOptionPane.showInputDialog(fram, msg);
	}
	 
	
	/* Method that displays a message dialog box with a message and different options
	*/
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
	
	/* Another Method that displays a message dialog box with a different message and an image icon
	*/
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
	
	/* Method that prints a message in the system and goes to the next line
	*/
	public static void println(String msg) {
		System.out.println(msg);
	}
	
	/* Method that prints a message in the system
	*/
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	
	/* Method that displays a message dialog box with an object message
	*/
	public static void msg(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	/* Method that displays a message dialog box with an object message that takes input from the user
	*/
	public static String in(Object msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	
	/* Method that displays a message dialog box with an image icon
	*/
	public static void msg2(String msg, Icon i){
        JOptionPane.showMessageDialog(
                j, 
                msg, 
                null, 
                JOptionPane.DEFAULT_OPTION, 
                i); 
    }
	/* Method that displays a message dialog box with an image icon that takes in user input
	*/
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
	
	/* Method that displays a message dialog box with options and an object message
	*/
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
	
/* Method that displays a message dialog box with an a title and an object message
	*/
	public static String in(Object msg, String title) {
		return JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE);
	}
	/* Method that displays an option dialog box with a title and an object message
	*/
	public static int opt(Object[] o, Object msg, String ttl) {
		return JOptionPane.showOptionDialog(
				null, msg, ttl, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				o, 
				0);
	}
	/* Method that displays an input message dialog box with a message and an image icon
	*/
	public static int
		option1(JComboBox questions, String msg, ImageIcon temp) {
		// TODO Auto-generated method stub
		return JOptionPane.showOptionDialog(questions, msg, null, 0, 0, temp, null, null);
	}

}
