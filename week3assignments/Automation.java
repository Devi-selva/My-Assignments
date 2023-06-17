package week3assignments;

public class Automation extends MultipleLangauge {
	
	public void ruby() {
		
		System.out.println("Ruby language class");
		
	}
	

public void selenium() {
	System.out.println("Selenium class");

}

public void java() {
	System.out.println("This is java class");

}

public static void main(String[] args) {
	
	Automation Au= new Automation();
	Au.java();
	Au.python();
	Au.ruby();
	Au.selenium();
		
	}

}
