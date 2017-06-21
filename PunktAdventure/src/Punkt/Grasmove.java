package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Grasmove {

	Timer grasMove;
	
	public Grasmove() {
		grasMove = new Timer();
		grasMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {		
				if(Variablen.wieseX < - 50){
					Variablen.wieseX = 0;
				}
					Variablen.wieseX -= 8;
					
		}}, 0, 90);
	}
}