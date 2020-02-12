package domotique;

public class Salon {
	Salon salon;//ici aussi je crois pas qu'on puisse declarer un un objet salon dans son propre classe salon, ou je trompe?
	private boolean TV = false;// je crois que tu as oublié de mettre "les private" je les ai mis
	private boolean Vollet = false; // je crois pas qu'on puisse initialiser ici directement, ou je trompe?
	private boolean Lights = false;
	public Salon() {
		salon = new Salon();
	}
	public boolean isTV() {
		return TV;
	}
	public void setTV(boolean tV) {
		TV = tV;
	}
	public boolean isVollet() {
		return Vollet;
	}
	public void setVollet(boolean vollet) {
		Vollet = vollet;
	}
	public boolean isLights() {
		return Lights;
	}
	public void setLights(boolean lights) {
		Lights = lights;
	}
	
}
