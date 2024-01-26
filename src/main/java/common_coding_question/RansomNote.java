package common_coding_question;


/*
* Write a ransom note by cutting letters out of available magazine and pasting them together
* to form a letter. Given an arbitrary ransom note string containing all the content of the magazines
* write a function that will return True if the ransom note can be made from the magazines
*/

import java.util.HashMap;

public class RansomNote {
    // Count number of time a letter appears in ransom note,
    // and then compare it with the numbers of times it appears in the letters

    public boolean canWrite(String ransomNote, String letters) {
        // remove space in string
        // '\\'s matches a single whitespace character, while '\\s+' matches one or more whitespace characters.
        String noSpaceNote = ransomNote.replaceAll("\\s+", "");

        HashMap<String, Integer> noteMap = map(ransomNote);
        HashMap<String, Integer> noteLetter = map(letters);

        return canWriteRansomNote(noteMap, noteLetter);
    }

    private HashMap<String, Integer> map (String text) {
        HashMap<String, Integer> map = new HashMap<>();
        // convert string to sequence of characters
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            String character = String.valueOf(characters[i]);

            if (map.containsKey(character)) {
                int count = map.get(character);
                map.put(character, count++);
            }
            else {
                map.put(character, 1);
            }
        }
        return map;
    }

    private boolean canWriteRansomNote(HashMap<String, Integer> noteMap, HashMap<String, Integer> letterMap) {
        // Check if key ie character appears in letters enough to form the Note
        for (String key: noteMap.keySet()) {
            if (!letterMap.containsKey(key)) {
                return false;
            }
            int noteCount = noteMap.get(key);
            int letterCount = letterMap.get(key);

            if (letterCount < noteCount) {
                return false;
            }
        }
        return true;
    }
}
