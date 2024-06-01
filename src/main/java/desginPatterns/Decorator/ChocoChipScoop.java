package desginPatterns.Decorator;

public class ChocoChipScoop implements IceCreamMaking{
    IceCreamMaking iceCreamMaking;
    // this canot be a base.
//    ChocoCone(){
//
//    }
    ChocoChipScoop(IceCreamMaking ic){
        if(ic != null){
            iceCreamMaking = ic;
        }
    }


    @Override
    public int getCost() {
        int cost = 40;
        if(iceCreamMaking != null)
            cost = iceCreamMaking.getCost()+cost;
        return cost;
    }

    @Override
    public String getDescription() {
        String desc= "ChocoChipScoop added";
        if(iceCreamMaking != null)
            desc =  iceCreamMaking.getDescription()+ desc;

            return desc;
    }
}
