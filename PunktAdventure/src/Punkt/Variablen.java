package Punkt;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

import javax.imageio.ImageIO;

public class Variablen {
	
	static Timer t1 = new Timer();
	static int width = 800, height = 600;
	static Color braun = new Color(139,69,19);  //braun
	static Color gruen = new Color(50,205,50);  //grün
	static Color gold = new Color(255,215,0);   //gold
	static Zeichenklasse jlab1;
	static boolean coinDa = true;
	static int wieseX= 0, wieseY = 410;
	static int schneeX= 0, schneeY = 410;
	static boolean sommer = true;
	static int muenzY = 0;
	static int himmelX = 0, himmelY = 0;
	static int muenzX = 250;
	static int muenzenRutschen = 50;
	static BufferedImage [] char1 = new BufferedImage[5];
	static BufferedImage i1;
	static BufferedImage i2;
	static BufferedImage matsch;
	static BufferedImage schnee;
	static BufferedImage gras;
	static BufferedImage fla1;
	static BufferedImage fla2;
	static boolean zeichneMuenze = true;
	static BufferedImage coin;
	static int flammeX = 200, flammeY = 322; 
	static int flammeAni = 0;
	static int punktX = 10, punktY = 342;
	static int BalkenX = 400, BalkenY = 300;
	static int score = 0;
	static boolean isRunning = true;
	static boolean balkenDa = true;
	static boolean notGameOver = true;
	static boolean imSpiel;
	static int coinX = 900, coinY= 300;
	static boolean ran = true;
	
	public static void setPunktX(int i){
		punktX = i;
	}
	
	public static int getPunktX(){
		return punktX;
	}
	
	public Variablen(){
		
		try {
			Variablen.matsch = ImageIO.read(new File("res/matsch.png"));
			Variablen.i1 = ImageIO.read(new File("res/pantheon.png"));
			Variablen.fla1 = ImageIO.read(new File("res/fla1.gif"));
			Variablen.fla2 = ImageIO.read(new File("res/fla2.gif"));
			Variablen.schnee = ImageIO.read(new File("res/bg_snow.jpg"));
			Variablen.coin = ImageIO.read(new File("res/coin.gif"));
			Variablen.gras = ImageIO.read(new File("res/grasHell.jpg"));
		} catch (IOException e) {}
	}
}
