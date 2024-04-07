import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actor);
    void update(Actor actor);
}
