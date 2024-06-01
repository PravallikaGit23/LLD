package desginPatterns.Decorator;

public class ChocoCone implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    // this canot be a base.
//    ChocoCone(){
//
//    }
    ChocoCone(IceCreamMaking ic){
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
        String desc= "VChocoCone Cone";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription()+ desc;

            return desc;
    }
}
