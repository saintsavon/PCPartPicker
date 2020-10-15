import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.text.ParseException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class PartPickerMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Object obj = new Object(); // Instanciating JSON object file
        JSONObject jo = (JSONObject) obj; // Converting simple JSON object to usable object

        System.out.println("Please select your CPU Brand (intel or amd)?");
        String cpu = scan.nextLine();

        try {
            if (cpu == "intel") {
                System.out.println("Please choose from the following list of compatible CPU's:");
                System.out.println("");
            } else if (cpu == "amd") {
                System.out.println("Please choose from the following list of compatible CPU's:");
                System.out.println("");
            } else {
                System.out.println("Please select from the available brand choices.");
            }
        } catch(ParseException pe) {
            System.out.println("position: " + pe.getPosition()); // Implement pe.getPosition() method to figure out where error is occurring
            System.out.println(pe);
        }


    }
}