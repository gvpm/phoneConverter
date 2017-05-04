
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

    public Core() {
        inputs = new ArrayList<>();
        outputs = new ArrayList<>();
        converter = new Converter();
        
    }
    
    public void run(){
        for (int i = 0; i < inputs.size(); i++) {
            String converted;
            converted = converter.convert(inputs.get(i));
            outputs.add(converted);            
        }
        
    }
    
    public void addInput(String input){
        inputs.add(input);
        
    }
    
    public ArrayList<String> getOutputs(){        
        return outputs;
    }
    
    
    
}
