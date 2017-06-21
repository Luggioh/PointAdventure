package Punkt;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Gui {
	public JFrame jf1;
	public int width = 800, height = 600;
	
	public Gui(){

		jf1 = new JFrame();
		jf1.setTitle("Punkt-Adventure");
		jf1.setSize(width, height);
		jf1.setResizable(false);
		jf1.setLayout(null);
		jf1.requestFocus();
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.addKeyListener(new KeyHandler());
		jf1.setVisible(true);

		Variablen.jlab1 = new Zeichenklasse();
		Variablen.jlab1.setBounds(0, 0, width, height);
		jf1.add(Variablen.jlab1);
		Variablen.jlab1.setVisible(true);	
	}
}
