package Christian.Andrade;

public class Name {
    private String word;

    public Name(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public int numbersOfCharacter(){
        return this.word.length();

    }
}
