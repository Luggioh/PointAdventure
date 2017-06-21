package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class WinterMove {

	Timer schneeMove;
	
	public WinterMove() {
		schneeMove = new Timer();
		schneeMove.scheduleAtFixedRate(new TimerTask(){
		int count1 = 0;
		
		public void run() {	
			if(count1 < 50){
			if(Variablen.schneeX < - 50){
				Variablen.schneeX = 0;
				count1++;
			}
			else{
				Variablen.schneeX -= 8;
				count1++;
			}}
			else{
				Variablen.sommer = true;
			}
	}}, 0, 90);
}
}