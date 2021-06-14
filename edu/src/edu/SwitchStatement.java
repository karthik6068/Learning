package edu;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String name = "Tarun";
    
    switch(name)
    {
    case "Karthik":
        System.out.println("He is from Sircilla");
        break;
    case "Deekshith":
    case "Shravan":
    case "Siddu":
    case "Vikas":
    	System.out.println("He is from warangal");
    	break;
    default:
      System.out.println("They are not from warangal or sircilla");
    }
    
	}

}
