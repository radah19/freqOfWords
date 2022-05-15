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

            for(int right = 0; right < n; right++)
                if(st.charAt(right) == ' '){ //Space detected
                    String newWord = st.substring(left, right);
                    if(!freqWords.containsKey(newWord))
                        freqWords.put(newWord, 1);
                    else
                        freqWords.replace(newWord, freqWords.get(newWord) + 1);
                }

        }

    }
}
