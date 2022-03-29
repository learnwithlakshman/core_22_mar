package com.careerit.cj.day12;

public class AccNumberUtil {

			private AccNumberUtil() {
			
			}
	
			public static String getNewAccountNumber() {
				StringBuffer sb = new StringBuffer();
				String prefix="SB";
				sb.append(prefix).append("-").append(System.currentTimeMillis());
				return sb.toString();
			}
			
			public static String maskAccNumber(String accNumber) {
				return "";
			}
			
			
}
