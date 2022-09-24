
public class CerclePlace {
	private double rayon;
	private Point centre;

	public CerclePlace(double rayon, Point centre) {
		this.rayon = rayon;
		this.centre = centre;
	}

	public CerclePlace(Point centre) {
		this(1.0, centre);
	}

	public CerclePlace() {
		this(1.0, new Point(0,0));
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	public String toString() {
		return "Cercle de rayon : " + rayon + " de centre " + centre;
	}
	

}
