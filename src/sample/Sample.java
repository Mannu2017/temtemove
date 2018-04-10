package sample;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

import org.apache.commons.io.FileUtils;

public class Sample {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Sample sp=new Sample();
				
			}
		});
		
	}

	public Sample() {
		Timer timer=new Timer();
		timer.schedule(new TempRemove(), 0,1000*60*5);
	}

}
