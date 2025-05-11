package vorlage;

public class Fahrzeug {
	private String kennzteichen;
	private String typ;
	private int baujahr;
	private Fahrer fahrer;
	public void setFahrer(Fahrer fahrer) {
		this.fahrer=fahrer;
	}
	public Fahrzeug(String kennzteichen, String typ, int baujahr) {
		super();
		this.kennzteichen = kennzteichen;
		this.typ = typ;
		this.baujahr = baujahr;
	}
	public Fahrer getFahrer() {
		return fahrer;
	}

}
