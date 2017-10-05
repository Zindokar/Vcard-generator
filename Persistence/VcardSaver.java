package Persistence;

import Model.Vcard;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;

public class VcardSaver {
    public void saveContact(Vcard vcard, String location) {
        try {
            String prefix = "Orla 2017";
            PrintStream printStream = new PrintStream(location);
            printStream.println("BEGIN:VCARD");
            printStream.println("VERSION:4.0");
            printStream.println("PRODID:-//Rokimoki//Alsnet.es//EN");
            printStream.println("N:" +prefix + ";" + vcard.getName() + ";;;");
            printStream.println("FN:" + vcard.getName() + " " + prefix);
            printStream.println("EMAIL:" + vcard.getEmail());
            printStream.println("TEL:" + vcard.getPhoneNumber());
            printStream.println("END:VCARD");
            printStream.close();
        } catch (IOException e) { }
    }
}
