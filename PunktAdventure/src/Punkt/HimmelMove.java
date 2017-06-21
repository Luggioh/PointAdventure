package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class HimmelMove {

	Timer himmelMove;

	public HimmelMove() {
		himmelMove = new Timer();
		himmelMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {		
				if(Variablen.himmelX < - 50){
					Variablen.himmelX = 0;
				}
					Variablen.himmelX -= 8;
					
		}}, 0, 100);
	}
}