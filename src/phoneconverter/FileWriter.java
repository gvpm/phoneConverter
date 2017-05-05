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
    //Creates and opens the output file
    public FileWriter(String fileName) {

        this.fileName = fileName;

        try {
            arq = new java.io.FileWriter(fileName + ".txt");

        } catch (IOException ex) {

        }
        writeArq = new PrintWriter(arq);
    }
    //It will export the outputs into an output file
    //It receives an arraylist containing all the string to export
    public void export(ArrayList<String> outputs) {
        //Writes each output in the output file
        for (int i = 0; i < outputs.size(); i++) {
            writeArq.println(outputs.get(i));
            writeArq.flush();
        }
        writeArq.close();

    }

}
