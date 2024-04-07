public class Human extends Actor{
    
    public Human (String name, String status){
        super(name, status);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;       
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return getName() + " " + getStatus();
    }
}