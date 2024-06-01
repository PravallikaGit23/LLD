package desginPatterns.Decorator;

public class Blueberry implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    Blueberry(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 45;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "Blueberry Scoop added";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription() + desc;

            return desc;
    }
}
