//Manideep Nalluri - 1225915641
public class Buyer extends Merchant implements Business{
    public Buyer()
    {
        System.out.println("**************Implementing Bridge Pattern***********");

    }

    @Override
    public void notifyBusinessUser() {
        System.out.println("**************Implementing Factory Pattern In Buyer***********");
        System.out.println("Hello Buyer");
    }
}
