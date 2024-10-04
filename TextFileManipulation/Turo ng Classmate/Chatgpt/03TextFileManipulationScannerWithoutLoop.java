import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileManipulator {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Read all lines from the input file into a single String
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            // Manipulate the content (e.g., convert to uppercase)
            String manipulatedContent = content.toUpperCase(); // Example manipulation

            // Write the manipulated content to the output file
            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(manipulatedContent);
            }

            System.out.println("File manipulation completed successfully.");

        } 
        catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
