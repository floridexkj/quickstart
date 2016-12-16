package com.shijie99.appender;

import org.apache.log4j.Level;
import org.apache.log4j.Priority;
import org.apache.log4j.RollingFileAppender;

/**
 * 根据Threshold保存不同的log文件
 * @author zhoucl
 */
public class ShijieRollingAppender extends RollingFileAppender {
	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		String level = priority.toString().toUpperCase();
		if(level.equals(Level.ERROR.toString())
			|| level.equals(Level.WARN.toString())
			|| level.equals(Level.INFO.toString())) {
			return this.getThreshold().equals(priority);
		}
		
		return super.isAsSevereAsThreshold(priority);
	}
}
