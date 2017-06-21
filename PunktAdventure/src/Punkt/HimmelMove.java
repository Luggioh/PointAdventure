package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class HimmelMove {

	Timer himmelMove;
	int temp = 0;
	
	public HimmelMove() {
		himmelMove = new Timer();
		himmelMove.scheduleAtFixedRate(new TimerTask(){
			
			public void run() {
					if(temp == 0){
						Variablen.himmelX = -10;
						temp = 1;
					}
					else{
						Variablen.himmelX = -20;
						temp = 0;
					}									
		}}, 0, 60);
}

}