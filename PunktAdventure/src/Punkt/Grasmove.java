package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Grasmove {

	Timer grasMove;
	
	public Grasmove() {
		grasMove = new Timer();
		grasMove.scheduleAtFixedRate(new TimerTask(){
		int count = 0;
		
			public void run() {	
//				if(count < 60)
				if(Variablen.wieseX < - 50){
					Variablen.wieseX = 0;
					count++;
				}
				else{
					Variablen.wieseX -= 8;
					count++;
				}
//				else{
//					Variablen.sommer = false;
//				}
		}}, 0, 90);
	}
}