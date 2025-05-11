package vorlage2;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vorlage.*;


public class FuhrparkServiceTest {

    private Fahrzeug fahrzeug1;
    private Fahrzeug fahrzeug2;
    private Fahrzeug fahrzeug3;
    private Fahrer fahrer1;
    private Fahrer fahrer2;
    private Abteilung abteilung1;
    private FuhrparkService fService;

    @BeforeEach
    public void setUp() {
        fahrzeug1 = new Fahrzeug("ABC-123", "PKW", 1990);
        fahrzeug2 = new Fahrzeug("FN-IP", "Car", 1990);
        fahrzeug3 = new Fahrzeug("UL-X", "Car", 1999);
        fahrer1 = new Fahrer("Heinz", "B");
        fahrer2 = new Fahrer("Max", "B");
        abteilung1 = new Abteilung("Einkauf");
        fService = new FuhrparkService();
    }

    @Test
    public void fahrzeugZuweisenTest() {
        fService.fahrzeugZuweisen(fahrer1, fahrzeug1);
        assertEquals(fahrer1, fahrzeug1.getFahrer());
        assertTrue(fahrer1.getFahrzeuge().contains(fahrzeug1));
    }

    @Test
    public void fahrzeugEntfernenTest() {
        fService.fahrzeugZuweisen(fahrer1, fahrzeug1);
        fService.fahrzeugEntfernenVonFahrer(fahrer1, fahrzeug1);
        assertNull(fahrzeug1.getFahrer());
        assertFalse(fahrer1.getFahrzeuge().contains(fahrzeug1));
    }

    @Test
    public void findeFahrzeugeEinerAbteilungTest() {
        abteilung1.addFahrer(fahrer1);
        fService.fahrzeugZuweisen(fahrer1, fahrzeug1);
        fService.fahrzeugZuweisen(fahrer1, fahrzeug2);

        ArrayList<Fahrzeug> fahrzeuge = fService.findeFahrzeugeEinerAbteilung(abteilung1);
        assertTrue(fahrzeuge.contains(fahrzeug1));
        assertTrue(fahrzeuge.contains(fahrzeug2));
        assertFalse(fahrzeuge.contains(fahrzeug3));
    }

    @Test
    public void keineFahrzeugeOhneAbteilungszuordnung() {
        // Fahrer ist keinem Team zugewiesen
        fService.fahrzeugZuweisen(fahrer1, fahrzeug1);
        ArrayList<Fahrzeug> fahrzeuge = fService.findeFahrzeugeEinerAbteilung(abteilung1);
        assertFalse(fahrzeuge.contains(fahrzeug1));
    }
}

