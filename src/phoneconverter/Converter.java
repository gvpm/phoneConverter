package phoneconverter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gvpm
 */
public class Converter {

    Map<String, String> table;

    public Converter() {
        table = new HashMap<String, String>();
        table.put("A", "2");
        table.put("B", "2");
        table.put("C", "2");
        table.put("D", "3");
        table.put("E", "3");
        table.put("F", "3");
        table.put("G", "4");
        table.put("H", "4");
        table.put("I", "4");
        table.put("J", "5");
        table.put("K", "5");
        table.put("L", "5");
        table.put("M", "6");
        table.put("N", "6");
        table.put("O", "6");
        table.put("P", "7");
        table.put("Q", "7");
        table.put("R", "7");
        table.put("S", "7");
        table.put("T", "8");
        table.put("U", "8");
        table.put("V", "8");
        table.put("W", "9");
        table.put("X", "9");
        table.put("Y", "9");
        table.put("Z", "9");
        table.put("1", "1");
        table.put("0", "0");
        table.put("-", "-");
    }

    //Thins function receives one string and returns the conversion of it, using the set rules.
    public String convert(String input) {
        String result = "";
        //Loops in all the chars in the string
        //For each char it will out its converted value in the resut string
        for (int i = 0; i < input.length(); i++) {
            String character = "" + input.charAt(i);
            if (table.get(character) == null) {
                System.out.println("Invalid Character on Input");
                System.out.println("Invalid Character: "+input.charAt(i));
                System.exit(1);
                
            }
            result += table.get(character);

        }

        return result;
    }

}
