package phoneconverter;

import java.util.ArrayList;

/**
 *
 * @author gvpm
 */
public class Core {

    private ArrayList<String> inputs;
    private ArrayList<String> outputs;
    Converter converter;
    //Creates the arraylists to store inputs and outputs
    //Creates the converter thaat will be used to convert inputs into outputs
    public Core() {
        inputs = new ArrayList<>();
        outputs = new ArrayList<>();
        converter = new Converter();

    }
    //This function will loop through the inputs and send each one to the converter
    public void run() {
        for (int i = 0; i < inputs.size(); i++) {
            String converted;
            //Converts the input string using the converter
            converted = converter.convert(inputs.get(i));
            //It adds to the output the converted string
            outputs.add(converted);
        }

    }
    //Function to receive the inputs from the fileLoader
    public void addInput(String input) {
        if(input.length()>30||1>=input.length()){
            System.out.println("Invalid Input Size");
                    System.exit(1);
        }
        inputs.add(input);

    }
    //Returns the arraylist of outputs
    public ArrayList<String> getOutputs() {
        return outputs;
    }

}
