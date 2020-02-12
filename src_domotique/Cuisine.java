package domotique;

public class Cuisine {
	Cuisine cuisine;
	private boolean Hote=false;
	private boolean Oven = false;
	private boolean Fridge = false;
	private boolean Lights = false;
	public Cuisine() {
		cuisine = new Cuisine();
	}
	public boolean isHote() {
		return Hote;
	}
	public void setHote(boolean hote) {
		Hote = hote;
	}
	public boolean isOven() {
		return Oven;
	}
	public void setOven(boolean oven) {
		Oven = oven;
	}
	public boolean isFridge() {
		return Fridge;
	}
	public void setFridge(boolean fridge) {
		Fridge = fridge;
	}
	public boolean isLights() {
		return Lights;
	}
	public void setLights(boolean lights) {
		Lights = lights;
	}
	
}	
