package Punkt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

public class KeyHandler implements KeyListener {

	
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			Variablen.punktX += 5;
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Variablen.punktX -= 5;
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_UP){
			Variablen.punktY -= 5;	
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Variablen.punktY += 5;	
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Variablen.punktY -= 50;	
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {}
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Variablen.punktY += 50;
		}	
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){}
	}
	
	public void keyTyped(KeyEvent e) {}
}
