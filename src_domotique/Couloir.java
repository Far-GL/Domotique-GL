package domotique;

public class Couloir {
	Couloir couloir;
	private boolean Lights = false;
	private boolean DetecteurFumee = false;
	public Couloir() {
		couloir = new Couloir();
	}
	public boolean isLights() {
		return Lights;
	}
	public void setLights(boolean lights) {
		Lights = lights;
	}
	public boolean isDetecteurFumee() {
		return DetecteurFumee;
	}
	public void setDetecteurFumee(boolean detecteurFumee) {
		DetecteurFumee = detecteurFumee;
	}
	
}
