package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class punkteVerdienen {

	Timer t1;
	
	public punkteVerdienen(){
		
				t1 = new Timer();
				t1.scheduleAtFixedRate(new TimerTask(){
					
					public void run() {
						if(Variablen.punktY <= Variablen.coinY && Variablen.punktY >= Variablen.coinY -10 && Variablen.punktX <= Variablen.coinX + 83 && Variablen.punktX >= Variablen.coinX +73){
							Variablen.score++; ;
							Variablen.coinDa = false;
							}
				}}, 10, 100);
		}

	}
