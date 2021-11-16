package com.technoelevate.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileHandlerDemo {
	
	final static Logger LOGGER=Logger.getLogger(MyConsoleDemo.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		
		LOGGER.setLevel(Level.FINE);
		
		FileHandler fileHandler=new FileHandler("C:\\Users\\Avinash N\\Desktop\\loggerfile\\file.log4");
		fileHandler.setLevel(Level.ALL);
		LOGGER.addHandler(fileHandler);
		
		
		
		MyFormatter formatter=new MyFormatter();
		fileHandler.setFormatter(formatter);
		
		
		LOGGER.finest("Finest level  msg");
		LOGGER.finer("Finer level msg");
		LOGGER.fine("fine level msg");
		LOGGER.config("congig level msg");
		LOGGER.info("Info level msg");
		LOGGER.warning("Warn level msg");
		LOGGER.severe("severe level masg");

		
		
		
		
	}
	

}
