package User.Client;

import Booking.Booking;
import Feedback.Feedback;
import User.Host.Host;
import User.User;
import User.userType;
import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import java.beans.FeatureDescriptor;
import java.util.HashSet;

public class Client extends User {
    private HashSet<Booking> bookingsList;

    public Client(userType type, String name, String surname, String email, String address) {
        super(type, name, surname, email, address);
        bookingsList = new HashSet<>();
    }

    public void createNewClient(userType type, String name, String surname, String email, String address) {
        Client client = new Client(type, name, surname, email, address);
    }



}
