package com.sparkle.demo.model;

import java.lang.management.ManagementFactory;

public final class UniqueIdUtil {
	
	private static String hostName = ManagementFactory.getRuntimeMXBean().getName();  //returns the pid @ machine name
	private static Long startupTime = ManagementFactory.getRuntimeMXBean().getStartTime(); //seed with startup time
	private static String uniqueNodeId = hostName + "@" + startupTime;
	
	/**
	 * Prevent accidental instantiation.
	 */
	private UniqueIdUtil() {
		
	}
	
	public static String getUniqueNodeId() {
		return uniqueNodeId;
	}
	
}
