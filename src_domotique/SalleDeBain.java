package domotique;

public class SalleDeBain {
	SalleDeBain salledebain;
	private boolean Lights = false;
	private boolean ModeBain =false;
	int Temp = 20;
	public SalleDeBain() {
		salledebain = new SalleDeBain();
	}
	public boolean isLights() {
		return Lights;
	}
	public void setLights(boolean lights) {
		Lights = lights;
	}
	public boolean isModeBain() {
		return ModeBain;
	}
	public void setModeBain(boolean modeBain) {
		ModeBain = modeBain;
	}
	public int getTemp() {
		return Temp;
	}
	public void setTemp(int temp) {
		Temp = temp;
	}
	
}
