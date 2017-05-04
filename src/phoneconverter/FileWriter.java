
package phoneconverter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author gvpm
 */
public class FileWriter {
    String fileName;
    java.io.FileWriter arq = null;
    PrintWriter writeArq;
    
    
    

    public FileWriter(String fileName) {
       
        this.fileName = fileName;

        try {
            arq = new java.io.FileWriter(fileName + ".txt");

        } catch (IOException ex) {

        }
        writeArq = new PrintWriter(arq);
    }
    
    public void export(ArrayList<String> outputs){
        
        for (int i = 0; i < outputs.size(); i++) {
            writeArq.println(outputs.get(i));
            writeArq.flush();
        }
        writeArq.close();
        
        
    }
    
    
    
    
}
