//Manideep Nalluri - 1225915641
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Products {
    ArrayList<String> productName = new ArrayList<>();
    public void createProducts() {
        File products=new File("D:\\My SE Course Work\\SER-515\\Design Patterns Individual\\Bablu/ProductInfo.txt");
        try {
            FileReader pName = new FileReader(products);
            BufferedReader buffername = new BufferedReader(pName);
            String string;
            while ((string = buffername.readLine()) != null) {

                String[] x = string.split(":");
                this.productName.add(x[1]);
            }
        }
        catch(Exception e){e.printStackTrace();}
        IteratorPatteren l= new IteratorPatteren();
        l.helper(productName);
    }
}
