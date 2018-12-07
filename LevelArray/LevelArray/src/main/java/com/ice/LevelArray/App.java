package com.ice.LevelArray;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);
	private static final int[] Numbers = {1,2,3,4,5,6,7,8,9,10};
	  
	public static void main(String[] args) {
		
		even();
		odd();
	}
	private static String even() {
		 BasicConfigurator.configure();
			int i = 0;
			
			logger.info(" Even Array");
			
			while( i < Numbers.length -1) {
				i++;
				if(Numbers[i] % 2 == 0) {
				   logger.info(Numbers[i]);
			    }
			}
			return null;
	}
	
	private static String odd() {
		int i = 0;
		
		logger.info(" odd Array");
		
		while( i < Numbers.length-1) {
			if(Numbers[i] % 2 > 0) {
				logger.info(Numbers[i]);
			}
			i++;
		}
		return null;
	}
}
