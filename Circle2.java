public class Circle2 extends Shape2{
	
	public int radius;

	public void setRadius(int radius){
		this.radius=radius;
	}
	
	public int getRadius(){
		return radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public double getPerimiter(){
		return 2*3.14*radius;
	}
	
	}
