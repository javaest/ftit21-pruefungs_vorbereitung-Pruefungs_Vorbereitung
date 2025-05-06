# 🚗 Projekt: Fuhrparkverwaltung

## 🧾 Kontext
Ein Unternehmen verwaltet eine Fahrzeugflotte (Autos, Transporter). Fahrzeuge gehören zu bestimmten Abteilungen, können bestimmten Fahrern zugewiesen sein und müssen regelmäßig gewartet werden.

Du arbeitest im Team und nutzt **Git**, **JUnit** und **Maven**.
---

## ✅ Git-Workflow
- Erstelle zu Begin einen dev Branch
- Erstelle anschließend pro **Klasse** einen **eigenen Branch**
- Merge diesen in `dev`, sobald diese implementiert wurde
- Nutze sinnvolle Commit-Messages
- Arbeite so, wie wenn mehrere Entwickler am Projekt arbeiten.

---

## 2. 🧱 Modellierung

Die Beziehung zwischen den Klassen ist wie folgt:

    Eine Abteilung hat mehrere Fahrer.

    Ein Fahrer gehört zu genau einer Abteilung.

    Ein Fahrer kann mehrere Fahrzeuge besitzen.

    Ein Fahrzeug kann genau einen Fahrer haben.

    Ein Fahrzeug kann einem Fahrer zugewiesen oder von ihm entfernt werden.
---

## 🧱 Klassen (ohne Beziehungen)

### 🚙 Fahrzeug

- `String kennzeichen`
- `String typ`
- `int baujahr`
- `Fahrer fahrer` 

---

### 👤 Fahrer

- `String name`
- `String fuehrerscheinklasse`
---

### 🏢 Abteilung

- `String name`

---

## 🛠️ Methoden in `FuhrparkService`

- `void fahrzeugZuweisen(Fahrer f, Fahrzeug v)`
- `void fahrzeugEntfernenVonFahrer(Fahrer f, Fahrzeug v)`
- `List<Fahrzeug> findeFahrzeugeEinerAbteilung()Abteilung abteilung`


## 🧪 Tests mit JUnit 4

- Schreibe zu jeder Methode mindestens **einen Testfall**
- Nutze `@BeforeEach` zum Vorbereiten von Objekten
- Testdatenbeispiele:
  - Fahrer: `"Max"`, `"Lisa"`
  - Fahrzeug: `"ABC-123"`, `"VW Golf"`
  - Abteilung: `"Logistik"`

---
## Release
Merge den dec branach anschließend in main

## DokumentTion
Erstelle anschließend ein UML-Diagramm deiner Lösung
