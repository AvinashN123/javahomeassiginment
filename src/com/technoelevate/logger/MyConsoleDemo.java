package com.technoelevate.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConsoleDemo {

    final static	Logger logger=Logger.getLogger(MyConsoleDemo.class.getName());
	public static void main(String[] args) {
		
		logger.setLevel(Level.ALL);
		
		
     ConsoleHandler handler=new ConsoleHandler();
     logger.addHandler(handler);
     handler.setLevel(Level.ALL);
     
     
     MyFormatter formatter=new MyFormatter();
     handler.setFormatter(formatter);
     
		logger.finest("Finest level  msg");
		logger.finer("Finer level msg");
		logger.fine("fine level msg");
		logger.config("congig level msg");
		logger.info("Info level msg");
		logger.warning("Warn level msg");
		logger.severe("severe level masg");

		
		
		
	}
	
	
	
}
