package org.system;

public class Desktop extends Computer {
	
	public void desktopsize()
	{
		System.out.println("Desktop size is 11");
	}
	
	public static void main(String[] args) {
			
		Desktop Ds= new Desktop();
		Ds.desktopsize();
		Ds.computerModel();
	}
	

}
