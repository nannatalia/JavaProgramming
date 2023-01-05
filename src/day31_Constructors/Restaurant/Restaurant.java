package day31_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<Chef> chefs = new ArrayList<>();
    public ArrayList<Server> servers = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServers(Server[] servers1){
        servers.addAll(Arrays.asList(servers1));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChefs(Chef chefs1){
        chefs.addAll(Arrays.asList(chefs1));
    }
    public void terminateSever(int employeeID){
        servers.removeIf( p-> p.employeeID == employeeID);
    }
    public void terminateChef(int employeeID){
        chefs.removeIf( p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", chefs=" + chefs +
                ", servers=" + servers +
                '}';
    }
}
