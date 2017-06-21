package Punkt;

import java.util.Timer;
import java.util.TimerTask;

public class FlammeAnimation {
	Timer flamme;
	private int temp = 0;
	
	public FlammeAnimation() {
		flamme = new Timer();
		flamme.scheduleAtFixedRate(new TimerTask(){

			public void run() {
				if(Variablen.punktX <= Variablen.flammeX && Variablen.punktX >= Variablen.flammeX -50 && Variablen.punktY <= Variablen.flammeY +85 && Variablen.punktY >= Variablen.flammeY -10){
					Variablen.notGameOver = false;
				}
				
				if(temp == 0){
					Variablen.flammeAni = 0;
					temp++;
				}
				else if(temp == 1){
					Variablen.flammeAni = 1;
					temp--;
				}
			}}, 0, 300);
	}

}