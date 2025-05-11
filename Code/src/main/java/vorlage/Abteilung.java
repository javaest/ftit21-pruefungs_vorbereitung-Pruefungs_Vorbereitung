package vorlage;

import java.util.ArrayList;

public class Abteilung {
	private String name;
	private ArrayList<Fahrer> fahrer;
	public Abteilung(String name) {
		super();
		this.name = name;
		fahrer=new ArrayList<>();
	}
	public void addFahrer(Fahrer fahrer) {
		this.fahrer.add(fahrer);
	}
	public ArrayList<Fahrer> getFahrer(){
		return fahrer;
	}

}
