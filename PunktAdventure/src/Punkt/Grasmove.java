package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class Grasmove {

	Timer grasMove;
	int temp = 0;
	
	public Grasmove() {
		grasMove = new Timer();
		grasMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {
					if(temp == 0){
						Variablen.wieseX = -10;
						temp = 1;
						Variablen.graas = false;
					}
					else{
						Variablen.wieseX = -20;
						temp = 0;
						Variablen.graas = true;
					}									
		}}, 0, 800);
}

}