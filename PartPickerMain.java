import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        JSONParser parser = new JSONParser(); // Parser to move through JSON file

        System.out.println("Please select your CPU Brand (intel or amd)?");
        String cpu = scan.nextLine();

        try {
            if (cpu.equals("intel")) {
                System.out.println("Please choose from the following list of compatible CPU's:");

                Object obj = parser.parse(new FileReader("PCPartPicker/parts.json"));

                JSONObject jsonObject = (JSONObject) obj;   //Failure due to one of these 3 lines
                String intel = (String) jsonObject.toString();
                System.out.println("CPU options: " + intel);

                //System.out.println("");

            } else if (cpu.equals("amd")) {
                System.out.println("Please choose from the following list of compatible CPU's:");
                System.out.println("");
            } else {
                System.out.println("Please select from the available brand choices.");
            }
        } 
        catch(IOException e) { e.printStackTrace(); }
        catch (Exception e) { e.printStackTrace(); }
    }
}