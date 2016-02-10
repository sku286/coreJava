package com.training.maps;
import java.util.*;
public class TransalateService {
	
	private Hashtable<String, String> hindiTOEnglish;
	
	public TransalateService(){
		
		hindiTOEnglish = new Hashtable<String,String>();
		init();
	}
	public void init(){
		
		hindiTOEnglish.put("EK", "one");
		hindiTOEnglish.put("haldi","turmeric");
		hindiTOEnglish.put("aam", "mango");
	}
	
	public String findHindiWord(String hindiWord){
		
		return hindiTOEnglish.get(hindiWord);
	}
	public void printWords(){
		
		Set<Map.Entry<String, String>> list = hindiTOEnglish.entrySet();
		System.out.println("HINDI to ENGLISH");
		
		for(Map.Entry<String, String> words : list)
		{
			System.out.println(words.getKey()+":"+words.getValue());
		}
		
	}
	

}
