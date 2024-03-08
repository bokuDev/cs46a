public class TextAnalyzer {
    private String sentence;

    TextAnalyzer(String sentence) {
        this.sentence = sentence;
    }

    public void textLength() { System.out.println("Length: " + this.sentence.length()); }
    
    public void showTextInUppercase() { System.out.println("To uppercase: " + this.sentence.toUpperCase()); }
    
    public void showTextInLowercase() { System.out.println("To lowercase: " + this.sentence.toLowerCase()); }
    
    public void showSubstring(int beginIndex, int endIndex) {
        System.out.println("Substring \"Always\": " + this.sentence.substring(beginIndex,endIndex));
    }

    public void showTextCategory() {
        // Part 2
        if (this.sentence.length() < 10) System.out.println("Sentence is short");
        else if (this.sentence.length() > 10 && this.sentence.length() <= 20) System.out.println("Sentence is medium");
        else if (this.sentence.length() > 20) System.out.println("Sentence is long");
    }

    public String getSentence() { return this.sentence; }
    public void setSentence(String sentence) { this.sentence = sentence; }
}
