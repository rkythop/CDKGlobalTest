package CharacterFrequency;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    Map<Character, Integer> frequency = new HashMap<Character, Integer>();

    String str = new String("Rakesh");

    for(char ch: str.toCharArray()){
        if(frequency.containsKey(ch)){
            frequency.put(ch, frequency.get(ch)+1);
        }else{
            frequency.put(ch, 1);
        }
    }
}
