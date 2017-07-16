package player;

public class Areaof {
void area(float x){
	System.out.println("The Area of Square is:"+Math.pow(x,2)+"sq.units");
}
void area(float x,float y){
	System.out.println("The Area of Rectangle is:"+x*y+"sq.units");
}
void area(double x){
	double z=3.14*x*x;
	System.out.println("The Area of Circle is:"+z+"sq.units");
}
void area(double x,double y,double z){
	System.out.println("The Area of triangle is:"+x*y*z+"sq.units");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Areaof a=new Areaof();
a.area(3);
a.area(11,12);
a.area(12,31);
a.area(2,2,2);
	}
	
		// TODO Auto-generated method stub
		
	}


