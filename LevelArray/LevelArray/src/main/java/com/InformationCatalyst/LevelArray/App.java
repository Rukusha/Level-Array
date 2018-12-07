package com.InformationCatalyst.LevelArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	private static final int[] Numbers = {1,2,3,4,5,6,7,8,9,10};
	  
	public static void main(String[] args) {
		
		even();
		odd();
	}
	private static String even() {
			int i = 0;
			
			logger.info(" Even Array");
			
			while( i < Numbers.length -1) {
				i++;
				if(Numbers[i] % 2 == 0) {
					String numberAsString = String.valueOf(Numbers[i]);
			         logger.info(numberAsString);
			    }
			}
			return null;
	}
	
	private static String odd() {
		int i = 0;
		
		logger.info(" odd Array");
		
		while( i < Numbers.length-1) {
			if(Numbers[i] % 2 > 0) {
				String numberAsString = String.valueOf(Numbers[i]);
		         logger.info(numberAsString);
			}
			i++;
		}
		return null;
	}
}
