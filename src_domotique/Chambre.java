package domotique;

public class Chambre {
	private boolean Lighs = false;
	private boolean TV = false;
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
