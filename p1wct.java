import java.util.Scanner;

public class p1wct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int wordCount = countWords(sentence);
        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);

        System.out.println("Word frequency:");
        printWordFrequency(sentence);
    }

    static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    static int countConsonants(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    static void printWordFrequency(String str) {
        String[] words = str.trim().toLowerCase().split("\\s+");
        boolean[] counted = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (!counted[i]) {
                int freq = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        freq++;
                        counted[j] = true;
                    }
                }
                System.out.println(words[i] + ": " + freq);
            }
        }
    }
}