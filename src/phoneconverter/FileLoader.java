package phoneconverter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.System.in;

/**
 *
 * @author gvpm
 */
public class FileLoader {

    String fileName;
    Core core;
    
    public FileLoader(String fileName) {
        this.fileName = fileName;
        //Created the core
        core = new Core();
    }
    //Loads the input file and adds to the core the input strings
    public void load() {

        try {
            java.io.FileReader in;
            in = new java.io.FileReader(fileName);
            BufferedReader b;
            b = new BufferedReader(in);
            boolean eof = false;

            while (!eof) {
                String line = b.readLine();
                if (line == null) {//Case where line is empty, end of file
                    eof = true;
                } else {
                    //Will add eah line of the file as a string into the core
                    core.addInput(line);
                }
            }
        } catch (IOException e) {

        }

    }

    public Core getCore() {

        return this.core;
    }

}
