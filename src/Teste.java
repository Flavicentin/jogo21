import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Teste {
	
	public static void main(String[] args) {
		UIManager.put("OptionPane.messageFont", 
			new FontUIResource(new Font("Consola 0", Font.PLAIN, 80)));
		
		String a = "\uD83C\uDCA1";
		String b = "\uD83C\uDCA2";
		String c = "\uD83C\uDCAA";
		String d = "\uD83C\uDCBB";
		String e = "\uD83C\uDCBD";
		String f = "\uD83C\uDCBE";
		
		System.out.println(a);
		JOptionPane.showMessageDialog(null, e);
		
	}

}
