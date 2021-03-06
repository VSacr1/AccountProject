package account.account;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testing {

	Map<Integer, Account> map = new HashMap<Integer, Account>();
	AccountMap creatingMap = new AccountMap();
	
	@Before
	public void beforeTesting()
	{
		
		map.put(1, new Account("John", "Smith", 1038347));
    	map.put(2, new Account("Max", "Smith", 3847659));
    	map.put(3, new Account("Jessie", "Coal", 2947593));
	}
	
	@Test
	public void test1()
	{
		assertEquals("Name does not exist!!", "John", map.get(1).getFirstName());
	}
	
	@Test
	public void test2()
	{
		creatingMap.createMap("John");
		assertEquals("This doesn't equal 3", 3, creatingMap.getCounter());
	}
	
	@Test
	public void test3()
	{
		creatingMap.createMap("Max");
		assertEquals("This doesn't equal 1", 1, creatingMap.getCounter());
	}
	
	@After 
	public void tearDown()
	{
		map.clear();
	}


}
