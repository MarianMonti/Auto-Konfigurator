package com.company;
import java.util.*;

/**
 * In dieser Klasse wird der Konfigurator gesteuert.
 */
public class App {
    User user;
    Car car;
    private String marke;
    private String farbe;
    private String ausfuehrung;
    private String ausstattung;
    private boolean loop;
    private int price;
    Scanner scan = new Scanner(System.in);


    public App() {
       // user = login();
        farbe = "weiß";
        loop = true;
        car = new Car(marke, farbe, ausfuehrung, ausstattung);
    }

    /**
     * Diese Methode startet des Konfigurator
     */
    public void start() {
        do  {
            menue();
        } while(loop);
        writeAll();
    }

    /**
     * Diese Methode wird verwendet um sich anzumelden.
     * @return User
     */
    public User login() {
        System.out.println("Herzlich Willkommen! Dieses Menue soll Ihnen helfen ein Auto zusammenzustellen! Viel Spaß dabei");
        System.out.println("Geben Sie Ihren Namen ein!");
        String name = scan.nextLine();
        System.out.println("Geben Sie Ihre Adresse ein!");
        String address = scan.nextLine();
        System.out.println("Geben Sie Ihre E-Mail-Adresse ein!");
        String email = scan.nextLine();
        System.out.println("Vielen Dank!");

        User user = new User(name, address, email);

        return user;
    }

    public void menue() {
        System.out.println("Hier ist eine Vorlage, von Ausstattung bis Farbe. Bitte waehlen Sie aus.");
        System.out.println("1: Marke:       " + marke);
        //if(marke !=null) {
            System.out.println("2: Farbe:       " + farbe);
            System.out.println("3: Ausfuehrung: " + ausfuehrung);
            System.out.println("4: Ausstattung  " + ausstattung);
            if (marke != null && ausfuehrung != null && ausstattung != null) {
                System.out.println("5: Auto kaufen und Rechnung erstellen!");
            }
        //}
        setAll();
        System.out.println("Der derzeitige Preis liegt bei " + (car.getPrice()+car.getPriceAusfuehrung()+car.getPriceAusstattung()));

        int choice = scan.nextInt();
        switch (choice) {
            case 1: markenAuswahl();
                break;
            case 2: farbenAuswahl();
                break;
            case 3: ausfuehrungsAuswahl();
                break;
            case 4: ausstattungAuswahl();
                break;
            case 5:  loop = false;
                break;
            }
    }

    private void markenAuswahl() {
        System.out.println("Entscheiden Sie unter unten aufgelisteten Fahrzeugmarken!");
        System.out.println("1: Vw");
        System.out.println("2: Bmw");
        System.out.println("3: Mercedes");
        System.out.println("4: Kia");
        System.out.println("5: Zurueck zu Menue");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: marke = "Vw";
                break;
            case 2: marke = "Bmw";
                break;
            case 3: marke = "Mercedes";
                break;
            case 4: marke = "Kia";
                break;
            case 5: menue();
                break;
            //default: exception
        }

    }

    private void farbenAuswahl() {
        System.out.println("Entscheiden Sie unter unten aufgelisteten Fahrzeugfarbe!");
        System.out.println("1: Rot");
        System.out.println("2: Blau");
        System.out.println("3: Gelb");
        System.out.println("4: Schwarz");
        System.out.println("5: Zurueck zu Menue");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: farbe = "Rot";
                break;
            case 2: farbe = "Blau";
                break;
            case 3: farbe = "Gelb";
                break;
            case 4: farbe = "Schwarz";
                break;
            case 5: menue();
                break;
            //default: exception
        }
    }

    private void ausfuehrungsAuswahl() {
        System.out.println("Entscheiden Sie unter unten aufgelisteten Fahrzeugtypen!");
        System.out.println("1: Kombi");
        System.out.println("2: Cabrio");
        System.out.println("3: SUV");
        System.out.println("4: Sport");
        System.out.println("5: Zurueck zu Menue");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: ausfuehrung = "Kombi";
                break;
            case 2: ausfuehrung = "Cabrio";
                break;
            case 3: ausfuehrung = "SUV";
                break;
            case 4: ausfuehrung = "Sport";
                break;
            case 5: menue();
                break;
            //default: exception
        }

    }

    private void ausstattungAuswahl() {
        System.out.println("Entscheiden Sie unter unten aufgelisteten Ausstattungen!");
        System.out.println("1: Standartausstattung");
        System.out.println("2: Kleine Extras");
        System.out.println("3: Mittelausstattung");
        System.out.println("4: Vollausstattung");
        System.out.println("5: Zurueck zu Menue");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: ausstattung = "Standartausstattung";
                break;
            case 2: ausstattung = "Kleine Extras";
                break;
            case 3: ausstattung = "Mittelausstattung";
                break;
            case 4: ausstattung = "Vollausstattung";
                break;
            case 5: menue();
                break;
            //default: exception
        }
        //return ausstattung;
    }


    private void writeAll() {
        System.out.println("Marke:           "+car.getMarke());
        System.out.println("Ausfuehrung:     "+car.getAusfuehrung());
        System.out.println("Ausstattung:     "+car.getAusstattung());
        System.out.println("Farbe:           "+car.getFarbe());
        System.out.println("Preis:           "+(car.getPrice()+car.getPriceAusstattung()+car.getPriceAusfuehrung()));

        Calendar cal = new GregorianCalendar();
        int date = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+2;
        int year = cal.get(Calendar.YEAR);
        System.out.println("Lieferdatum:     " + date +"." + month + "." + year);

    }

    private void setAll() {
        car.setMarke(marke);
        car.setFarbe(farbe);
        car.setAusstattung(ausstattung);
        car.setAusfuehrung(ausfuehrung);
    }


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
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

    public void setAusfuehrung(String ausfuehrung) {
        this.ausfuehrung = ausfuehrung;
    }

    public String getAusstattung() {
        return ausstattung;
    }

    public void setAusstattung(String ausstattung) {
        this.ausstattung = ausstattung;
    }
}
