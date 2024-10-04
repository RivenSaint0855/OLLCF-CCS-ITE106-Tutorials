import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileManipulator {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Using try-with-resources to ensure proper resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            // Read each line and manipulate it
            while ((line = reader.readLine()) != null) {
                // Manipulate the line (e.g., convert to uppercase)
                String manipulatedLine = line.toUpperCase(); // Example manipulation
                
                // Write the manipulated line to the output file
                writer.write(manipulatedLine);
                writer.newLine(); // Write a newline character
            }

            System.out.println("File manipulation completed successfully.");

        }
	catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
