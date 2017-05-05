package phoneconverter;

/**
 * 
 * @author gvpm
 */
public class Converter {
    //Thins function receives one string and returns the conversion of it, using the set rules.
    public String convert(String input) {
        String result = "";
        //Loops in all the chars in the string
        //For each char it will out its converted value in the resut string
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    result += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    result += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    result += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    result += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    result += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    result += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    result += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result += "9";
                    break;
                //Case where there is no need to convert    
                default:
                    result += input.charAt(i);
                    break;
            }

        }

        return result;
    }

}
