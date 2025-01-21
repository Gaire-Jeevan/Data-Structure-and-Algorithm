public class KarpRabinStringMatchingAlgorithm {

    private static final int PRIME = 101;

    private double calculateHash(String str) {
        double hash = 0;

        for (int i = 0; i < str.length(); i++) {
            hash = (hash + str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }

    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;

        newHash = newHash + newChar * (Math.pow(PRIME, patternLength - 1));

        return newHash;
    }

    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));

        // if i goes to till the length of the string which contain the first string then when i is text.length() - 1 then how it can check from i to i + patternLength it goes out of bound
        for (int i = 0; i < text.length() - patternLength; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }
}