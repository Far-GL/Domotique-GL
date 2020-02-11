package domotique;

public class Entree {
	Porte porte = new Porte();
	Entree entree;
	boolean Lights;
	public Entree() {
		entree = new Entree();
	}
	public boolean isLights() {
		return Lights;
	}
	public void setLights(boolean lights) {
		Lights = lights;
	}
}
