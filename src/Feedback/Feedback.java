package Feedback;

public class Feedback {
    private String id;
    private static int idCounter;
    private String title;
    private String text;
    private int score;

    public Feedback(String title, String text, int score) {
        id = title + idCounter++;
        this.title = title;
        this.text = text;
        this.score = score;
    }
}
