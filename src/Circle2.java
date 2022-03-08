public class Circle2 {
    private double radius;
    Circle2(double radiusValue){
        this.radius = radiusValue;
    }
    public void setRadius(double r){
		this.radius = r;
	}

    public double getRadius(){
		return this.radius;
	}

    public double computeArea(){
		return 3.14 * (this.radius * this.radius);
	}
	public double computeCircumference(){
		return 2 * 3.14 * this.radius;
    }
}
