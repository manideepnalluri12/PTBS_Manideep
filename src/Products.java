//Manideep Nalluri - 1225915641
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Products {
    ArrayList<String> productName = new ArrayList<>();
    ArrayList<String> productCategory = new ArrayList<>();
    HashMap<String,String> map = new HashMap<>();

    public void createProducts() {
        File products=new File("D:\\My SE Course Work\\SER-515\\Design Patterns Individual\\Bablu\\untitled\\src/ProductInfo.txt");
        try {
            FileReader pName = new FileReader(products);
            BufferedReader buffername = new BufferedReader(pName);
            String string;
            while ((string = buffername.readLine()) != null) {

                String[] x = string.split(":");


                this.productName.add(x[1]);
                map.put(x[0],x[1]);

            }
        }
        catch(Exception e){e.printStackTrace();}
        ListIterator l= new ListIterator();

        l.helper(productName,map);

    }
}
