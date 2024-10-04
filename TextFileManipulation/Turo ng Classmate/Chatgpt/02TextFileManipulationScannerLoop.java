import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileManipulator {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Create a Scanner to read the input file
            File inputFile = new File(inputFilePath);
            Scanner scanner = new Scanner(inputFile);
            
            // Create a FileWriter to write to the output file
            FileWriter writer = new FileWriter(outputFilePath);

            // Loop through each line of the input file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                // Manipulate the line (e.g., convert to uppercase)
                String manipulatedLine = line.toUpperCase(); // Example manipulation

                // Write the manipulated line to the output file
                writer.write(manipulatedLine + System.lineSeparator());
            }

            // Close the scanner and writer
            scanner.close();
            writer.close();
            System.out.println("File manipulation completed successfully.");

        } 
        catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Error writing to the output file: " + e.getMessage());
        }
    }
}
