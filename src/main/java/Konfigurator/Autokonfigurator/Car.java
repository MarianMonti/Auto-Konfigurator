package com.company;

/**
 * Diese Klasse erstellt ein Objekt mit dem Typ Car.
 */
public class Car {
    private String marke;
    private String farbe;
    private String ausfuehrung;
    private String ausstattung;
    private int price;
    private int priceAusstattung;
    private int priceAusfuehrung;

    public Car(String marke, String farbe, String ausfuehrung, String ausstattung) {
        setMarke(marke);
        setFarbe(farbe);
        setAusfuehrung(ausfuehrung);
        setAusstattung(ausstattung);
        this.price = 0;
        this.priceAusstattung = 0;
        this.priceAusfuehrung = 0;
    }

    public String getMarke() {
        return marke;
    }

    /**
     * In dieser Methode wird die Marke uebergeben und der dazugehoerige Preis gesetzt
     * @param marke
     */
    public void setMarke(String marke) {
        if(marke == "Vw") {
            setPrice(10000);
        }
        else if(marke == "Bmw") {
            setPrice(20000);
        }
        else if(marke == "Mercedes") {
            setPrice(30000);
        }
        else if(marke == "Kia") {
            setPrice(5000);
        }
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getAusfuehrung() {
        return ausfuehrung;
    }

    /**
     * In dieser Methode wird die Ausfuehrung gesetzt. Weiteres wird der Preis der Ausfuehrung gesetzt
     * @param ausfuehrung
     */
    public void setAusfuehrung(String ausfuehrung) {
        if(ausfuehrung == "Kombi") {
            setPriceAusfuehrung(1500);
        }
        else if(ausfuehrung == "Cabrio") {
            setPriceAusfuehrung(2500);
        }
        else if(ausfuehrung == "SUV") {
            setPriceAusfuehrung(3500);
        }
        else if(ausfuehrung == "Sport") {
            setPriceAusfuehrung(4500);
        }
        this.ausfuehrung = ausfuehrung;
    }

    public String getAusstattung() {
        return ausstattung;
    }

    /**
     * In dieser Methode wird die die Ausstattung und der dazugehoerige Preis gesetzt
     * @param ausstattung
     */
    public void setAusstattung(String ausstattung) {
        if(ausstattung == "Standartausstattung") {
            setPriceAusstattung(1000);
        }
        else if(ausstattung == "Kleine Extras") {
            setPriceAusstattung(2000);
        }
        else if(ausstattung == "Mittelausstattung") {
            setPriceAusstattung(3000);
        }
        else if(ausstattung == "Vollausstattung") {
            setPriceAusstattung(4000);
        }
        this.ausstattung = ausstattung;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceAusstattung() {
        return priceAusstattung;
    }

    public void setPriceAusstattung(int priceAusstattung) {
        this.priceAusstattung = priceAusstattung;
    }

    public int getPriceAusfuehrung() {
        return priceAusfuehrung;
    }

    public void setPriceAusfuehrung(int priceAusfuehrung) {
        this.priceAusfuehrung = priceAusfuehrung;
    }
}
