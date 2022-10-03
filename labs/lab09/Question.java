import java.lang.Override;
import java.lang.String;

public class Question {
    private String text;

    public Question(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
