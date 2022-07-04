package feedback;

import house.House;
import user.client.Client;

public class Feedback {
    private String id;
    private static int idCounter;
    private String title;
    private String text;
    private int score;

    private House house;
    private Client client;


    public Feedback(String title, String text, int score, House house, Client client) {
        id = title + idCounter++;
        this.title = title;
        this.text = text;
        this.score = score;
        this.house = house;
        this.client = client;
    }

    public void createNewFeedback(String title, String text, int score, House house, Client client) {
        Feedback feedback = new Feedback(title, text, score, house, client);
        house.addFeedback(feedback);
        house.getHost().addFeedback(feedback);
    }


}
