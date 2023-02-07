Given an array of words and the length L, format the text such that each line has
exactly L number of characters and is fully (left and right) justified.
Write a program to print the list of strings that are allocated to each single line
matching the below conditions:
● Pack as many words as you can in each line.
● If needed, you can pad the extra spaces with ‘ ‘, so that each line has
exactly L characters.
● Extra spaces between words should be distributed as evenly as possible.
● If the number of spaces on a line do not divide evenly between words, the
empty slots on the left will be assigned more spaces than the slots on the
right.
● For the last line of text, it should be left justified and no extra space is
inserted between words.

Input : ["This", "is", "an", "example", "of", "text", "justification."]
L: 16.
Output:
[
"This       is      an",
"example of text",
"justification.      "
]



import java.util.String;
import java.lang.*;

class Textjustification {
    static String res;

    public StringBuilder Justify(String[] words, int maxWidth) {// Getting the words and teh max length of a line
        StringBuilder res = new StringBuilder();// Creating a new String Builder
        int n = words.length;// Number of words inputed to the String
        // System.out.println(n);
        int index = 0;// initialization
        int last = 0;
        while (last < n) {// Chceking for the words until it becomes nothing loop
            int totalChars = words[index].length();// signle word length
            last = index + 1;// go to the next index word

            while (last < n) {// check until that particular line is full
                if (totalChars + 1 + words[last].length() > maxWidth)// if those two words are filled by the line
                    break;// yes stop
                totalChars += 1 + words[last].length();// no sum up to the totalchar
                last++;
            }

            int gaps = last - index - 1;// to find out how many gaps are needed
            StringBuilder sb = new StringBuilder();// using StringBuilder so that the append operation is used
            if (last == n || gaps == 0) {// Determining how many gaps are needed
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);// First two words
                    sb.append(' ');// with the gap that is declared before itself
                }

                sb.deleteCharAt(sb.length() - 1);// for the last line after printing the word the rest should be space
                while (sb.length() < maxWidth) {
                    sb.append(' ');
                }
            } else {
                int spaces = (maxWidth - totalChars) / gaps;// How many extra spaces are needded inbetween words
                int rest = (maxWidth - totalChars) % gaps;// Total number of spaces
                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);// printing the words
                    sb.append(' ');// with the gap that is declared before itself

                    for (int j = 0; j < spaces + (i - index < rest ? 1 : 0); j++) {// is extra spaces needed
                        sb.append(' ');
                    }
                }
                sb.append(words[last - 1]);// printing the last word
                System.out.println("\n");

            }

            res = res.append(sb.toString());// appedning the rest of the words
            index = last;// incrementing the index
        }
        return res;
    }

    public static void main(String args[]) {
        String words[] = { "Melo", "and", "magda", "play", "together", "well" };
        Textjustification Sentence = new Textjustification();
        System.out.println(Sentence.Justify(words, 16));
    }
}
