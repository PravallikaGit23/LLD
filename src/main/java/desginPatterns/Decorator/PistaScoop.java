package desginPatterns.Decorator;

public class PistaScoop implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    PistaScoop(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 50;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "PistaScoop added";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription() + desc;

            return desc;
    }
}
