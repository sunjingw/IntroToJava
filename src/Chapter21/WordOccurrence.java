package Chapter21;

public class WordOccurrence implements Comparable<WordOccurrence> {

    String word;
    int count;

    public WordOccurrence(String word) {
        this.word = word;
        count++;
    }
    @Override
    public int compareTo(WordOccurrence o) {
        if (this.count > ((WordOccurrence)o).count) {
            return 1;
        } else if (this.count < ((WordOccurrence)o).count) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getCount() {
        return count;
    }
    public String getWord() {
        return word;
    }
    @Override
    public String toString() {
        return word + " " + count;
    }
}
