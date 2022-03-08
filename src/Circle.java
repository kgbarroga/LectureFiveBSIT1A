

/**
 * radius
 * diameter
 */
/**
 * Methods/behaviors
 * area = pi (r * r)
 * circumference = 2 * pi * r
 * 
 */
/**
 * Tasks
 * 1. initiate properties/instance variables - allen
 * 2. setters and getters - bryan
 * 3. methods to compute area and circumference - abijah
 */
public class Circle {
    private double radius;
    private double area;
	private double circumference;
    /**
     * Setters/Getters
     */
    public void setRadius(double r){
		this.radius = r;
	}
	public void setArea(double a){
		this.area = a;
	}
	public void setCircum(double c){
		this.circumference = c;
	}
	public double getRadius(){
		return this.radius;
	}
	public double getArea(){
		return this.area;
	}
	public double getCircum(){
		return this.circumference;
	}

    public void computeArea(){
		this.area = 3.14 * (this.radius * this.radius);
	}
	public void computeCircumference(){
		this.circumference = 2 * 3.14 * this.radius;
    }
    
    
}
/**
	// Setters.
	public void setRadius(double r){
		this.radius = r;
	}
	public void setArea(float a){
		this.area = a;
	}
	public void setCircum(float c){
		this.circumference = c;
	}
	// Getters.
	public double getRadius()){
		return this.radius;
	}
	public float getArea(){
		return this.area;
	}
	public float getCircum(){
		return this.circumference;
	}
	// Computation of Area and Circumference. xd
	area = 3.14 * (radius * radius);
	System.out.println("Area is: " + area);
	circumference = 2 * (3.14 * radius);
	System.out.println("Circumference is: " + circumference);
 */
 
 /**
	//Only get the radius
	
	public void setArea(double r){
		this.area = 3.14 * (r * r);
	}
	public void setCircum(double r){
		this.circumference = 2 * 3.14 * r;
  */


/**
public double newArea(){
	return this.area = 3.14 (r*r);	
}
public double newCicumference(){
	return this.circumference = 2 * 3.14 * r;
}
 */
