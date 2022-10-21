public class BusinessFactory {

    public Business businessNotification(String businessType) {
        switch (businessType) {
            case "Buyer":
                return new Buyer();
            case "Seller":
                return new Seller();

            default:
                throw new IllegalArgumentException("Unknown businessType " + businessType);
        }
    }
}
