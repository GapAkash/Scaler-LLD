import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessingExample2 {
    public static void main(String[] args) {
        String inputFilePath = "D:\\Temp\\tmp\\nse-currency_feedhandler.log.9"; // Path to the input file
        String outputFilePath = "D:\\Temp\\tmp\\output.9.txt"; // Path to the output file

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains("NseCurrMasterDetails")) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Lines containing 'abcd' removed. Results written to output.txt.");
        } catch (IOException e) {
            System.err.println("Error reading/writing the file: " + e.getMessage());
        }
    }
}


