
public class Areaofgeometricalshape {
	void calculateArea(float x)
	{
		System.out.println("area of square: "+x*x+" sq units");
	}
	void calculateArea(float x,float y)
	{
		System.out.println("area of rectangle: "+x*x+" sq units");
	}
	void calculateArea(double r)
	{
		double area = 3.14*r*r;
		System.out.println("area of circle: "+area+" sq units");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Areaofgeometricalshape obj = new Areaofgeometricalshape(); 
//this statement will call the 2nd area() method , passing 1 arguement
obj.calculateArea(6.1f);
//this statement will call the 1st area() method , passing 2 arguements
obj.calculateArea(10,22);
//this statement will call the 2nd area() method 
obj.calculateArea(6.1);

	}

}
