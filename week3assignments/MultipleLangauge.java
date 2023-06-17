package week3assignments;

public abstract class MultipleLangauge implements TestTool,Language {

	public void python()
	{
		System.out.println("This is python language");
	}
	
	public abstract void ruby();
}
