package phoneconverter;

/**
 *
 * @author gvpm
 */
public class Main {

    public static void main(String[] args) {

        FileLoader fileLoader;
        FileWriter fileWriter;

        switch (args.length) {
            case 1:
                fileLoader = new FileLoader(args[0]);
                fileWriter = new FileWriter("output");
                break;
            case 2:
                fileLoader = new FileLoader(args[0]);
                fileWriter = new FileWriter(args[1]);
                break;
            default:
                fileLoader = new FileLoader("input.txt");
                fileWriter = new FileWriter("output");
                break;
        }

        fileLoader.load();

        Core core = fileLoader.getCore();
        core.run();
        
       fileWriter.export(core.getOutputs());
        
        
        

    }

}
