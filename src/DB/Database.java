package DB;

import Booking.Booking;
import Feedback.Feedback;
import House.House;
import User.Client.Client;
import User.Host.Host;

import java.util.HashSet;

public class Database {
    private HashSet<Client> clientsList;
    private HashSet<Host> hostsList;
    private HashSet<House> housesList;
    private HashSet<Booking> bookingsList;
    private HashSet<Feedback> feedbacksList;

    public Database() {
        clientsList = new HashSet<>();
        hostsList = new HashSet<>();
        housesList = new HashSet<>();
        bookingsList = new HashSet<>();
        feedbacksList = new HashSet<>();
    }


}
