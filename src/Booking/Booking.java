package Booking;

import House.House;
import User.Client.Client;

import java.util.Date;

public class Booking {
    private String id;
    private static int idCounter;
    private Date startBooking;
    private Date endBooking;
    private House house;
    private Client client;
    private int totPrice;

    public Booking(Date startBooking, Date endBooking, House house, Client client, int totPrice) {
        id = house.getName() + client.getSurname() + idCounter++;
        this.startBooking = startBooking;
        this.endBooking = endBooking;
        this.house = house;
        this.client = client;
        this.totPrice = totPrice;
    }


}
