import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class KalkulatorUI {
	JFrame frame = new JFrame("Kalkulator");
	JPanel panel = new JPanel(new FlowLayout());
	JTextArea text = new JTextArea(1,20);
	
	JButton tombol1 = new JButton("1");
	JButton tombol2 = new JButton("2");
	JButton tombol3 = new JButton("3");
	JButton tombol4 = new JButton("4");
	JButton tombol5 = new JButton("5");
	JButton tombol6 = new JButton("6");
	JButton tombol7 = new JButton("7");
	JButton tombol8 = new JButton("8");
	JButton tombol9 = new JButton("9");
	JButton tombol0 = new JButton("0");
	
	JButton tombolTambah = new JButton("+");
	JButton tombolKurang = new JButton("-");
	JButton tombolKali = new JButton("*");
	JButton tombolBagi = new JButton("/");
	JButton tombolSamaDengan = new JButton("=");
	JButton tombolClear = new JButton("C");
	
	
	public void UI() {
		frame.setVisible(true);
		frame.setSize(300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		frame.add(text);
		
		panel.add(tombol1);
		panel.add(tombol2);
		panel.add(tombol3);
		panel.add(tombol4);
		panel.add(tombol5);
		panel.add(tombol6);
		panel.add(tombol7);
		panel.add(tombol8);
		panel.add(tombol9);
		panel.add(tombol0);
		
		panel.add(tombolTambah);
		panel.add(tombolKurang);
		panel.add(tombolKali);
		panel.add(tombolBagi);
		panel.add(tombolSamaDengan);
		panel.add(tombolClear);
	}
}
