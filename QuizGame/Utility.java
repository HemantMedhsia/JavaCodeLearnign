import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility {

    public static void loadQuestionsFromFile(String fileName, Question[] question) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null && index < 10) {
                String[] data = line.split("\\|"); // Split using '|'
                if (data.length == 7) {
                    question[index] = new Question(
                            data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                    index++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}