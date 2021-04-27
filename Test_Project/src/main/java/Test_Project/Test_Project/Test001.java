package Test_Project.Test_Project;

public class Test001 {
	
	
	
	public static void main(String args[]) {
		
		
		String browserName = "chrome";
		String userName = "gangeyab-b4bn@force.com";
	    String password = "Test12345!";
	    String mainMenu = "Contacts";
	    String subMenu = "New Contact";
	
		
		BaseClass.launchApp(browserName);
		BaseClass.login(userName, password);
		BaseClass.selectNavigationLink(mainMenu, subMenu);
		BaseClass.tearDown();
		
	}
	
	
  

}
