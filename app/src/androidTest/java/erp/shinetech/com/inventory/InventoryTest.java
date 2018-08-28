package erp.shinetech.com.inventory;


import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zhong on 2018/8/28.
 */

public class InventoryTest {
    @Test
    public void ConvertProductJson() throws Exception {
       String strJson =  "{\"product\":{\"id\":\"1\",\"name\":\"computer\",\"desc\":Dell}}";
        JSONObject obj = new JSONObject(strJson);
        JSONObject user =  obj.getJSONObject("product");
        String username =  user.getString("name");
        assertEquals(username,"computer");
    }
    @Test
    public void ConvertArrayProductJson() throws Exception {

        String jsonMessage = " { 'products':[ {'id':'1', 'name':'computer', 'desc':'Dell'}," +
                "{'id':'兴趣', 'name':'28', 'desc':'45'}," +
                "{'id':'爱好', 'name':'48', 'desc':'62'}]}";

        JSONObject obj = new JSONObject(jsonMessage);
        JSONArray array = obj.getJSONArray("products");

        List<Product> products = new ArrayList<Product>();

        for(int i = 0;i< array.length();i++){
            JSONObject obj_product = array.getJSONObject(i);
            Product product = new Product(obj_product.optInt("id"), obj_product.optString("name"), obj_product.optString("desc") );
            products.add(product);
        }

        String pn = products.get(0).product_name;
        assertEquals(pn,"computer");

    }

}
