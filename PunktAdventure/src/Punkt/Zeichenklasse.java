package Punkt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public class Zeichenklasse extends JLabel {
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			if(Variablen.isRunning == true && Variablen.notGameOver == true){

			g.setColor(Color.CYAN);  //Himmel
			g.fillRect(Variablen.himmelX, Variablen.himmelY, 850, Variablen.height);
			
			g.setColor(Color.black);
			g.drawString("Ihre Punktzahl: "+ Variablen.score, 50, 70);
			
			g.drawImage(Variablen.gras, Variablen.wieseX, Variablen.wieseY, 850, Variablen.height, null);  //Wiese
			g.drawImage(Variablen.coin, Variablen.coinX, Variablen.coinY, 50, 50, null);  //Wiese
			
			g.setColor(Variablen.braun);  //Erde
			g.fillRect(0, 440, Variablen.width, Variablen.height);
			
//			if(Variablen.zeichneMuenze == true){
//				g.setColor(Color.BLACK);	
//				g.fillOval(Variablen.muenzX, Variablen.muenzY, 30, 30);		
//			}		
//				
//			
			if(Variablen.flammeAni==0){
				g.drawImage(Variablen.fla1, Variablen.flammeX, Variablen.flammeY+58, 50, 50, null);
			}
			else if(Variablen.flammeAni ==1){
				g.drawImage(Variablen.fla2, Variablen.flammeX, Variablen.flammeY+55, 50, 50, null);
			}
			
			if(Variablen.coinDa == true){
					g.drawImage(Variablen.coin, Variablen.coinX +  100, Variablen.coinY, 50, 50, null);		
			}
			else{
					g.drawImage(Variablen.coin, Variablen.coinX +  200, Variablen.coinY, 50, 50, null);		
			}
//			
//			if(Variablen.balkenDa == true){
//				g.setColor(Variablen.gold);   //Balken
//				g.fillRect(Variablen.BalkenX, Variablen.BalkenY, 20, 120);
//			}
//			else{
//				g.setColor(Variablen.gold);
//				g.fillRect(Variablen.BalkenX+50, Variablen.BalkenY, 20, 120);
//			}
			//g.drawImage(Variablen.char1[0], Variablen.punktX, Variablen.punktY, 100, 83, null);   //Ritter
			//g.drawImage(Variablen.char1[1], Variablen.punktX, Variablen.punktY, 100, 83, null);
			
			g.drawImage(Variablen.i1, Variablen.punktX, Variablen.punktY, 100, 100, null);
			
			repaint();
			}	
			
			else{
				g.setColor(Color.CYAN);  //Himmel
				g.fillRect(0, 0, Variablen.width, Variablen.height);
				
				g.setColor(Color.black);
				g.drawString("Ihre Punktzahl: "+ Variablen.score, 50, 70);
				
				g.setColor(Variablen.gruen);  //Wiese über Erde
				g.fillRect(0, 420, Variablen.width, Variablen.height);
				
				g.setColor(Variablen.braun);  //Erde
				g.fillRect(0, 450, Variablen.width, Variablen.height);
				
				g.drawString("Sie haben das Feuer berührt und sind tot!", Variablen.width / 4, Variablen.height/2);
			}
	}
}
