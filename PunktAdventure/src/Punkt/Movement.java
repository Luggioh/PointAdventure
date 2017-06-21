package Punkt;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	
	Timer move;
	
		public Movement() {
			move = new Timer();
			move.scheduleAtFixedRate(new TimerTask(){
				
				public void run() {
					if(Variablen.BalkenX <= 400){
						Variablen.BalkenX = Variablen.BalkenX + 120;
						}
					else{
						Variablen.BalkenX = Variablen.BalkenX - 50;
					}
			}}, 0, 1000);
	}

}