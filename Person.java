import java.util.List;

public class Person {

	private Logo logo;
	private List<String> color;
	private Rotation rotation;

	public Logo getLogo() {
		return logo;
	}

	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public Rotation getRotation() {
		return rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public String toString() {
		return logo + " " + color + " " + rotation;
	}
}