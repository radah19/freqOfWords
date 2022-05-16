import java.io.*;
import java.util.*;

public class freqOfWords {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\radha\\Documents\\GitHub\\freqOfWords\\.idea\\ReadFiles\\text.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // String variable that holds buffer stream
        String st;
        //Holds word frequencies
        HashMap<String, Integer> freqWords = new HashMap<>();

        //Read file and add words
        while ((st = br.readLine()) != null){
            int n = st.length(), left = 0;

            for(int right = 0; right < n; right++) {

                char s = st.charAt(right);
                if (!(s >= 'a' && s <= 'z') && !(s >= 'A' && s <= 'Z')) { //Nonletter detected detected
                    String newWord = st.substring(left, right);
                    if (!freqWords.containsKey(newWord))
                        freqWords.put(newWord, 1);
                    else
                        freqWords.replace(newWord, freqWords.get(newWord) + 1);

                    //Update left
                    boolean spaceFound = true;
                    while(right < n && spaceFound){
                        char l = st.charAt(right);
                        if ((l >= 'a' && l <= 'z') || (l >= 'A' && l <= 'Z')) spaceFound = false;
                        else right++;
                    }
                    left = right;
                }

            }
        }

        ArrayList<String> sortedWords = new ArrayList<>();
        for(String i: freqWords.keySet()) sortedWords.add(i);
        Collections.sort(sortedWords, (a, b) -> {
            return freqWords.get(b) - freqWords.get(a);
        });

        System.out.println("\nNum\tWords\tFrequency");
        for(String i: sortedWords)
            System.out.println(singletonIDsetter.setID() + ". " + i + ":\t" + freqWords.get(i));

        System.out.println("Amount of entries: " + singletonIDsetter.getNumOfEntries());

    }
}
