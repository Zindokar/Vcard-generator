package Controller;

import Model.Vcard;
import Persistence.ContactsLoader;
import Persistence.ContactsLoaderTxt;
import Persistence.VcardSaver;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class VcardGeneratorController {

    public void generateVcards(String inputLocation, String outputLocation) {
        ContactsLoader loader = new ContactsLoaderTxt();
        List<Vcard> vcardList = loader.loadContacts(inputLocation);
        String vcardFileName = "vcard_";
        int vcardNumber = 1;
        VcardSaver saver = new VcardSaver();
        for (Vcard currentVcard : vcardList) {
            saver.saveContact(currentVcard, outputLocation + "\\" + vcardFileName + (vcardNumber++) + ".cvf");
        }
    }

}
