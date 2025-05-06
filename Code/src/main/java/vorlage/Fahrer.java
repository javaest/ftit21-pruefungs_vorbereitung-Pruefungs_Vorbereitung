package vorlage;

import java.util.ArrayList;

public class Fahrer {
	private String name;
	private String fuehrerscheinkasse;
	private ArrayList<Fahrzeug> fahrzeuge;
	public Fahrer(String name, String fuehrerscheinkasse) {
		this.name = name;
		this.fuehrerscheinkasse = fuehrerscheinkasse;
		this.fahrzeuge=new ArrayList<>();
	}
	public void addFahrzeug(Fahrzeug fahrzeug) {
		fahrzeuge.add(fahrzeug);
	}
	public void removeFahrzeug(Fahrzeug fahrzeug) {
		fahrzeuge.remove(fahrzeug);
	}
	public ArrayList<Fahrzeug> getFahrzeuge(){
		return fahrzeuge;
	}
	


}
