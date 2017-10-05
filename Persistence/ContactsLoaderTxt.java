package Persistence;

import Model.Vcard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TXT Format:
 * 1st column,2nd column,3rd column
 * name,mail,phone number
 */

public class ContactsLoaderTxt implements ContactsLoader {
    @Override
    public List<Vcard> loadContacts(String location) {
        List<Vcard> vcardList = new ArrayList<>();
        try {
            FileInputStream fileStream = new FileInputStream(location);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileStream));
            String currentLine = "";
            while ((currentLine = bufferedReader.readLine()) != null) {
                String [] currentContact = currentLine.split(",");
                vcardList.add(new Vcard(currentContact[0], Integer.parseInt(currentContact[2]), currentContact[1]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) { } catch (IOException e) { }
        return vcardList;
    }
}
