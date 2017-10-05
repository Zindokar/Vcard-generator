package View;

import Controller.VcardGeneratorController;

import java.net.URI;
import java.net.URISyntaxException;

public class MainView {

    public void start() {
        String inputLocation = "absolute file route here";
        String outputLocation = "absolute output folder route here";
        VcardGeneratorController controller = new VcardGeneratorController();
        controller.generateVcards(inputLocation, outputLocation);
        System.out.println("All went good");
    }

}
