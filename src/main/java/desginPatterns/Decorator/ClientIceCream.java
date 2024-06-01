package desginPatterns.Decorator;

public class ClientIceCream {
    public static void main(String[] args) {


            System.out.println("Prepare Your IceCream");
            IceCreamMaking iceCream = new Strawberry();
            iceCream = new PistaScoop(iceCream);
            iceCream = new ChocoChipScoop(iceCream);
            iceCream = new Blueberry(iceCream);

           System.out.println(iceCream.getCost());
           System.out.println(iceCream.getDescription());
    }
}
