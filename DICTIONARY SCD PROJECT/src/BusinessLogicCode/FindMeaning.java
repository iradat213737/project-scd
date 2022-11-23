package BusinessLogicCode;

import java.sql.SQLException;

import java.util.ArrayList;
import DataAcessCode.AddMeaning;
import ViewLogicCode.ViewAddMeaning;
import WordToMeaning.Meanings;
import WordToMeaning.Words;


public class FindMeaning {
private static AddMeaning AddMeaning;
	
	public FindMeaning()  
	{
		AddMeaning = new AddMeaning();
	    
		
	}
	
	public ArrayList<Words> getarray() throws SQLException {
		ArrayList<Words> word = AddMeaning.getallmeaning();
		
		return word;
		
	}
	public static void Main(String args) throws SQLException {
	   ViewAddMeaning view= new ViewAddMeaning();
	  
	   getlocationplace();
	   try {
		AddMeaning.AddMeaningdatabase();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static ArrayList<Meanings> getlocationplace() throws SQLException {
		ViewAddMeaning view = new ViewAddMeaning();
	ArrayList<Meanings> location = view.getlocation();
	System.out.println("FIND MEANING");
      System.out.println(location.get(0).getWord());
      System.out.println(location.get(0).getMeanings());
		return location;
	}
	
	
	
}
