import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Actor> clients = new ArrayList<>();
        clients.add(new Human("Good", null));
        clients.add(new Human("Bad", null));
        clients.add(new Human("Ugly", null));
        clients.add(new Human("Funny", null));
        clients.add(new Human("Crazy", null));

        Market market = new Market();

        for (Actor client : clients) {
            market.acceptToMarket(client);
        }
        System.out.println("-----------");
        for (Actor client : clients) {
            market.takeinQueue(client);
        }
        System.out.println("-----------");

        for (Actor client : clients) {
            market.update(client);
        }   

        market.releaseFromMarket(clients);

    }
}
