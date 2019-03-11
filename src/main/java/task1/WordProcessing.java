package task1;

import java.util.*;
import java.util.stream.Collectors;


public class WordProcessing {

    /**
     * Task: Find all distinct words from a text file. Ignore chars like".,/-;:" and Ignore case sensitivity.
     *
     * @param filePath input file with text.
     * @param regex    your regex
     * @return filtered words by your pattern
     * @throws NullPointerException when an input path or regex is null
     */
    private static Set cleanText(String filePath, String regex) {
        if (filePath == null || regex == null) {
            throw new NullPointerException();
        }
        List<String> textLinesList = new ArrayList<>();
        Scanner scanner = new Scanner(filePath);
        while (scanner.hasNextLine()) {
            textLinesList.add(scanner.nextLine());
        }
        return textLinesList.stream()
                .flatMap(t -> Arrays.stream(t.split(" ")))
                .filter(t -> !t.matches(regex))
                .collect(Collectors.toCollection(HashSet::new));
    }

}
