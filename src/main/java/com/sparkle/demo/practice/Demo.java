package com.sparkle.demo.practice;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] arr) {
		
		Map<String, String> reqMap = new HashMap<>();
		reqMap.put("DEMOGRAPHICS.SSN", "abc");
		reqMap.put("DEMOGRAPHICS.ALIEN_NUMBER", "abghgfhc");
		reqMap.put("DEMOGRAPHICS.SSN", "jjgjy");
		reqMap.put("SSN", "yyyy");
		reqMap.put("ABC", "dddd");
		
		for (Map.Entry<String, String> entry : reqMap.entrySet()) {
			//System.out.println("key : "+entry.getKey() +" | value : "+entry.getValue());
		}
		
//		String value = "2019-07-21";
//			boolean a = value.contains("-") && value.split("-")[0].length() != 3;
//			//System.out.println(a);
//			
//			String[] serverPort = "CJAMS|SOURCE_INFO.MDM_ID".split("\\|");
//			 //System.out.println(serverPort[0]);
//		
//			String af = "an|cd";	
//			System.out.println(af.contains("an|cg"));
//			
//			int i =3;
//			int j =7;
//			System.out.println(++i);
//			System.out.println(j++);
//			System.out.println(j); 262144l
		
		
		 Long fileSize = 262144l;
         Double fileInMb = fileSize / (1024.0 * 1024.0);
         Double fileInKB = fileSize / (1024.0 );
//         String strvalue = Double.toString(fileInMb);
//         if(strvalue.contains("E-")) {
//             System.out.println("0.001 MB");
//         }
         System.out.println(fileInMb);
         System.out.println(fileInKB);
         
         System.out.println(String.format("%.2f",fileInMb) + " MB");
		
	}

}