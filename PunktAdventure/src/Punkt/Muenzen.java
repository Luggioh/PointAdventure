package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Muenzen{
	Timer muenzen;
	
	public Muenzen() {
		muenzen = new Timer();
		muenzen.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {		
				if(Variablen.coinX < - 350){
					Variablen.coinX = 800;
				}
					Variablen.coinX -= 20;
					
		}}, 0, 70);
	}
}