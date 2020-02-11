package domotique;

public class Salon {
	Salon salon;
	boolean TV = false;
	boolean Vollet = false;
	boolean Lights = false;
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
