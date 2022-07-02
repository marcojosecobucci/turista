package User.Host;

import Feedback.Feedback;
import House.House;
import User.User;
import User.userType;

import java.util.HashSet;

public class Host extends User {

    private final String hostCode;
    private static int codeCounter = 0;
    private boolean superHost;
    private HashSet<House> housesList;
    private HashSet<Feedback> feedbacksList;

    public Host(userType type, String name, String surname, String email, String address) {
        super(type, name, surname, email, address);
        hostCode = name + codeCounter++;
        superHost = false;
        housesList = new HashSet<>();
        feedbacksList = new HashSet<>();
    }
    public void addHouse(House house){
        housesList.add(house);
    }
    public void createNewHost(userType type, String name, String surname, String email, String address) {
        Host host=new Host(type,name,surname,email,address);

    }
    public void addFeedback(Feedback feedback){
        feedbacksList.add(feedback);
    }

}
