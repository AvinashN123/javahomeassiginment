package com.technoelevate.logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		return record.getThreadID()+":::"+record.getLoggerName()+":::"+record.getSourceMethodName()+":::"+record.getMessage()+"\n";
	}

}
