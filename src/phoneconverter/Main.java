package phoneconverter;

/**
 *
 * @author gvpm
 */
public class Main {

    public static void main(String[] args) {
        //Declarations
        FileLoader fileLoader;
        FileWriter fileWriter;
        //Swith to decide the fileNames depending on the parameters received
        switch (args.length) {
            //Case where one argument was passed, it will be the input fileName
            case 1:
                fileLoader = new FileLoader(args[0]);
                fileWriter = new FileWriter("output");
                break;
            //Case where two arguments were passed, it will give input and output names
            case 2:
                fileLoader = new FileLoader(args[0]);
                fileWriter = new FileWriter(args[1]);
                break;
            //Case where no arguments were passed, it will use the defaults   
            default:
                fileLoader = new FileLoader("input.txt");
                fileWriter = new FileWriter("output");
                break;
        }
        //Loads the fileLoader, the fileLoader  will created the core.
        fileLoader.load();
        //Gets the created core  from the fileLoader
        Core core = fileLoader.getCore();
        //Runs the core
        core.run();
        //Writes  in the output file what was done in the core.
        
        fileWriter.export(core.getOutputs());
        

    }

}
