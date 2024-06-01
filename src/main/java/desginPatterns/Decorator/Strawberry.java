package desginPatterns.Decorator;

public class Strawberry implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    Strawberry(){

    }
    Strawberry(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 15;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "Strawberry Cone";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription()+ desc;

            return desc;
    }
}
