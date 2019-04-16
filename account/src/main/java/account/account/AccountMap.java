package account.account;

import java.util.HashMap;
import java.util.Map;


import com.google.gson.Gson;

public class AccountMap {
	
	private int counter = 0; 


	private String check = "John";
	
	
	public AccountMap()
	{
		
	}
	
	public void createMap()
    {
		Map<Integer, Account> map = new HashMap<Integer, Account>();
    	
    	map.put(1, new Account("John", "Smith", 1038347));
    	map.put(2, new Account("Max", "Smith", 3847659));
    	map.put(3, new Account("Jessie", "Coal", 2947593));
    	map.put(4, new Account("John", "Ben", 1038357));
    	map.put(5, new Account("John", "Dickens", 1048347));

    	
//    	Gson gson = new Gson();
//    	String json = gson.toJson(map); 
    	//System.out.println(map.get(1).getFirstName());
    	for(int i = 1; i <= map.size(); i++)
    	{
//    		System.out.println(map.get(i));
    		if(map.get(i).getFirstName().equals(check))
    		{
    			counter++; 
    		}

    	}
    	
    	System.out.println(counter + " " + check + "'s in the map");
    }
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
