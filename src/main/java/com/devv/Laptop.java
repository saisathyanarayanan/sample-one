package com.devv;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	
	@Autowired
	Mobile mobi;
	

	public String getlall() {
		 return mobi.getmobname()+ mobi.getmobprice();
	}
	
	
	
	public String getlapname() {
			 return "vivooo";
		}
		
		public String getlapprice() {
			 return "23087345898";
		}

	}



