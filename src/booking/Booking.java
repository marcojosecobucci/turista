package booking;

import feedback.Feedback;
import house.House;
import user.client.Client;

import java.util.Date;
import java.util.Scanner;

public class Booking {
    private String id;
    private static int idCounter;
    private Date startBooking;
    private Date endBooking;
    private House house;
    private Client client;
    private int totPrice;
    private static Feedback feedback;

    public Booking(Date startBooking, Date endBooking, House house, Client client, int totPrice) {
        id = house.getName() + client.getSurname() + idCounter++;
        this.startBooking = startBooking;
        this.endBooking = endBooking;
        this.house = house;
        this.client = client;
        this.totPrice = totPrice;
    }

    public void createFeedback() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Titolo recensione: ");
        String title = sc.nextLine();
        System.out.println("Inserisci la recensione: ");
        String text = sc.nextLine();
        System.out.println("inserisci un punteggio da 1 a 5");
        int score = sc.nextInt();

        feedback.createNewFeedback(title, text, score, house, client);

    }


}
