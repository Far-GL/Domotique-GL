package domotique;

public class Chambre {
	boolean Lighs = false;
	boolean TV = false;
	Chambre chambre;
	public Chambre() {
		chambre = new Chambre();
	}
	public boolean isLighs() {
		return Lighs;
	}
	public void setLighs(boolean lighs) {
		Lighs = lighs;
	}
	public boolean isTV() {
		return TV;
	}
	public void setTV(boolean tV) {
		TV = tV;
	}
	
	
}
