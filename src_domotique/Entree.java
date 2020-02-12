package domotique;

public class Entree {
	Porte porte = new Porte();// je crois que ça soit ici qu'on doit creer un objet porte ou je trompe?
	Entree entree;
	private boolean Lights;
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
