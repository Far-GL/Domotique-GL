package domotique;

public class Porte {
	boolean verrou = true;
	Porte porte;
	public Porte () {
		porte = new Porte();
	}
	public boolean isVerrou() {
		return verrou;
	}
	public void setVerrou(boolean verrou) {
		this.verrou = verrou;
	}
}
