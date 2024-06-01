package desginPatterns.Decorator;

public class VanillaCone implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    VanillaCone(){

    }
    VanillaCone(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 10;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "Vanilla Cone";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription()+ desc;

            return desc;
    }
}
