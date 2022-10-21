//Manideep Nalluri - 1225915641
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//login using User_name and Password
public class FacadePatteren {
    int merchant_type;
    String user_name;
    String password;
    Merchant thePerson;
    Products products = new Products();;
    
    public void login()
    {
        System.out.println("Implementing Facade Design pattern");
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter UserName:");
            this.user_name=scanner.next();
            System.out.println("Enter Password:");
            this.password=scanner.next();
            File seller_info = new File("D:\\My SE Course Work\\SER-515\\Design Patterns Individual\\Bablu/SellerInfo.txt");
            File buyerinfo = new File("D:\\My SE Course Work\\SER-515\\Design Patterns Individual\\Bablu/BuyerInfo.txt");

            FileReader fbuyer = new FileReader(buyerinfo);
            FileReader fseller = new FileReader(seller_info);
            BufferedReader bufferb = new BufferedReader(fbuyer);
            BufferedReader buffers = new BufferedReader(fseller);
            String data;
            while((data=bufferb.readLine())!=null)
            {
                String[] buyer_data = data.split(":");
                if((buyer_data[0].equals(user_name)) && (buyer_data[1].equals(password)))
                {
                    System.out.println("matched Buyer");
                    merchant_type=0;
                }

            }
            while((data=buffers.readLine())!=null)
            {

                String[] seller_data = data.split(":");
                if((seller_data[0].equals(user_name)) && (seller_data[1].equals(password)))
                {
                    System.out.println("matched Seller");
                    merchant_type=1;
                }
            }
            UserCreator();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(merchant_type);

    }
    public void UserCreator()
    {
        if(merchant_type==0) {
            thePerson = new Buyer();
            products.createProducts();
        } else  {
            thePerson = new Seller();
            products.createProducts();
        }

    }
}
