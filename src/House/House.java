package House;

import Booking.Booking;
import User.Host.Host;

import java.util.Date;
import java.util.HashSet;

public class House {
    private String id;
    private static int idCounter;
    private Host host;
    private int nBooking;
    private String name;
    private Date startBooking;
    private Date endBooking;
    private String address;
    private int localHouse;
    private int bedNumber;
    private int floar;
    private int nightPrice;
    private HashSet<Booking> bookingsList;

    public House(Host host, int nBooking, String name, Date startBooking,
                 Date endBooking, String address, int localHouse, int bedNumber, int floar, int nightPrice) {
        id = host.getSurname() + idCounter++;
        this.host = host;
        this.nBooking = nBooking;
        this.name = name;
        this.startBooking = startBooking;
        this.endBooking = endBooking;
        this.address = address;
        this.localHouse = localHouse;
        this.bedNumber = bedNumber;
        this.floar = floar;
        this.nightPrice = nightPrice;
        bookingsList = new HashSet<>();
    }

    public String getName() {
        return name;
    }
    public void createNewHouse(Host host, String name, Date startBooking,
                               Date endBooking, String address, int localHouse, int bedNumber, int floar, int nightPrice){
        House house=new House(host,0,name,startBooking,endBooking,address,localHouse,bedNumber,floar,nightPrice);
        host.addHouse(house);
    }


}
