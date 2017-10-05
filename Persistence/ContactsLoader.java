package Persistence;

import Model.Vcard;
import java.util.List;

public interface ContactsLoader {

    public List<Vcard> loadContacts(String location);

}
