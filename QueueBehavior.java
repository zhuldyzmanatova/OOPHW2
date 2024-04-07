public interface QueueBehavior {
    void takeinQueue(Actor actor);
    void releaseFromQueue();
    void takeOrders();
    void giveOrders();
}
