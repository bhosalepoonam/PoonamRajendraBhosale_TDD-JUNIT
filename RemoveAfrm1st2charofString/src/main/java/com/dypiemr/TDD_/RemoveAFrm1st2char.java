package com.dypiemr.TDD_;

public class RemoveAFrm1st2char {

	public String remove(String string) {
		int strlen=string.length();
		if(string.charAt(0)=='A' && string.charAt(1)!='A')
		{
			return string.substring(1, strlen);
		}
		else if(string.charAt(0)!='A' && string.charAt(1)=='A')
		{
			return string.substring(0,0)+string.substring(2, strlen);
		}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A')	
		{
			return string.substring(2,  strlen);
		}
		return string;
	}
	

}
