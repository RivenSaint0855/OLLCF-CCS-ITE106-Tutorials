import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileManipulator {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Using FileReader and FileWriter to read and write files
        try (FileReader reader = new FileReader(inputFilePath);
             FileWriter writer = new FileWriter(outputFilePath)) {

            StringBuilder content = new StringBuilder();
            int ch;

            // Read the file character by character
            while ((ch = reader.read()) != -1) {
                content.append((char) ch); // Append the character to the StringBuilder
            }

            // Manipulate the content (e.g., convert to uppercase)
            String manipulatedContent = content.toString().toUpperCase();

            // Write the manipulated content to the output file
            writer.write(manipulatedContent);

            System.out.println("File manipulation completed successfully.");

        } 
         catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
