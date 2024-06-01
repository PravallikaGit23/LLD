package desginPatterns.Decorator;

public class Syrup implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    // this canot be a base.
//    ChocoCone(){
//
//    }
    Syrup(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 5;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "Choco Syrup";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription() + desc;

            return desc;
    }
}
