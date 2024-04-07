public abstract class Actor implements ActorBehavior{
    protected String name;
    protected String status;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    Actor(String name, String status){
        this.name = name;
        this.status = status;
    }

    public abstract String getName();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}