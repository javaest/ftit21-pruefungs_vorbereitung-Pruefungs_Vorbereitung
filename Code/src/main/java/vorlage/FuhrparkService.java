package vorlage;

import java.util.ArrayList;

public class FuhrparkService {


    /**
     * Weißt einem Fahrer ein Fahrzeug zu und setzt den Fahrzeugfahrer
     * @param f Fahrer der einem Fahrzug zugewiesen werden soll
     * @param v Fahrzeug wo ein Fahrer bekommen soll
     */
    public void fahrzeugZuweisen(Fahrer f, Fahrzeug v) {
    	v.setFahrer(f);
    	f.addFahrzeug(v);
    }
    public void fahrzeugEntfernenVonFahrer(Fahrer f, Fahrzeug v ){
    	f.removeFahrzeug(v);
    	v.setFahrer(null);
    }
    public ArrayList<Fahrzeug> findeFahrzeugeEinerAbteilung(Abteilung abteilung){
		ArrayList<Fahrzeug> fahrzeuge=new ArrayList<>();
		for(Fahrer i : abteilung.getFahrer()) {
			for(Fahrzeug f : i.getFahrzeuge()) {
				fahrzeuge.add(f);
			}
		}
		return fahrzeuge;
		
    	
    }


}
