import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileProcessingExample {
    public static void main(String[] args) {
        String filePath = "D:\\Temp\\tmp\\data.txt"; // Path to the input file

        Map<String, String> lineMap = new HashMap<>(); // Map to store line numbers and corresponding lines
        Map<String, String> timerMap = new HashMap<>(); // Map to store line numbers and corresponding lines

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String[] lines = line.split(" ");
                if (!line.contains("NseCurrMasterDetails") && line.contains("17486")) {
                    lineMap.put(lines[9], lines[11]);
                }

                if(line.contains("Timer-0") && !lines[7].equalsIgnoreCase("Pushing"))
                    timerMap.put(lines[7], lines[9]);

                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Print the map
        for (Map.Entry<String, String> entry : lineMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("------------------------------------------------------");
        timerMap.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);
    }
}

