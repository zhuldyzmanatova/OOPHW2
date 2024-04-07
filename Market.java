import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior {
    
    List <Actor> actorsInMarket = new ArrayList<>();
    Queue <Actor> actorsInQueue = new ArrayDeque<>();
    // Queue <Actor> orderMakers = new ArrayDeque<>();
    // Queue <Actor> orderTakers = new ArrayDeque<>();

    @Override    
    public void acceptToMarket(Actor actor){
        actor.setStatus("is in the market");
        actorsInMarket.add(actor);
        System.out.println(actor);
    }

    @Override
    public void takeinQueue(Actor actor){
        actor.setStatus("is in the queue");
        actorsInMarket.removeAll(actorsInMarket);
        // System.out.println(actorsInMarket);
        actorsInQueue.add(actor);
        System.out.println(actor);
        // orderMakers.add(actor);
    }

    @Override
    public void takeOrders(){
        actorsInQueue.peek().setStatus("made order");
        actorsInQueue.peek().setMakeOrder();
        for (Actor actor : actorsInQueue) {
            System.out.println(actor);            
        }
    }

    @Override
    public void giveOrders(){
        if (actorsInQueue.peek().isMakeOrder()){
            actorsInQueue.peek().setStatus("took order");
            actorsInQueue.peek().setTakeOrder();
        }
        for (Actor actor : actorsInQueue) {
            System.out.println(actor);            
        }
    }

    @Override
    public void releaseFromQueue(){
        if (actorsInQueue.peek().isTakeOrder()){
            actorsInQueue.peek().setStatus("is out of the queue");
            System.out.println(actorsInQueue.peek());
            actorsInQueue.poll();
        }
        for (Actor actor : actorsInQueue) {
            System.out.println(actor);            
        }
    }

    @Override   
    public void releaseFromMarket(List<Actor> actors){
        for (Actor actor : actors) {
            if (actor.isTakeOrder){
                actor.setStatus("is out of the market");
                System.out.println(actor);       
            }
        }
    }    

    @Override
    public void update(Actor actor){
        takeOrders();
        System.out.println("-----------");
        giveOrders();
        System.out.println("-----------");
        releaseFromQueue();
        System.out.println("-----------");
    }
}
