package feb9;

public class TestInterface {
	public static void main(String args[])
	{  
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();
		
		Drawable d1=new Rectangle();
		d1.draw();
	}
}
