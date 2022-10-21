//Manideep Nalluri - 1225915641
public class Seller extends Merchant implements Business{
    public Seller()
    {
        System.out.println("**************Implementing Bridge Pattern***********");

    }

    @Override
    public void notifyBusinessUser() {
        System.out.println("**************Implementing Factory Pattern In Seller***********");
        System.out.println("hello Seller");
    }
}

