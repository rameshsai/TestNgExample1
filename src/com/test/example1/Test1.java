package com.test.example1;

import org.testng.annotations.Test;

public class Test1 {  
	
	public void firstMethod(){
		System.out.println("This is from first Method");
	}
  @Test
  public void firstfunction() {
	  System.out.println("This is my normal Test Method");
	  
  }
  
  public void lastMethod(){
	  System.out.println("This is from last Method");
  }
  
}
