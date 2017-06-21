package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Muenzen{
	Timer muenzen;

	public Muenzen() {
		muenzen = new Timer();
		muenzen.scheduleAtFixedRate(new TimerTask(){
		
		public void run() {
			if(Variablen.muenzY < 390){
				Variablen.muenzY = Variablen.muenzY + 15;
				Variablen.zeichneMuenze = true;
				}

			else{
				Variablen.score --;
				Variablen.muenzY = 0;
			}
	}}, 0, 80);
}
}
