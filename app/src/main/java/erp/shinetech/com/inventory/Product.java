package erp.shinetech.com.inventory;

import com.google.android.gms.common.util.JsonUtils;

/**
 * Created by Zhong on 2018/8/27.
 */

public class Product {

    public  String  product_name;
    public  int  product_id;
    public  String product_desc;

    public  String getName (){
        return product_name;
    }
    public  void setName (String name){
        product_name = name ;
    }


    public  int getId (){
        return product_id;
    }
    public  void setName (int id){
        product_id = id ;
    }

    public  String getDesc (){
        return product_desc;
    }
    public  void setDesc (String desc){
        product_desc = desc ;
    }

    public  Product(int id, String name, String desc){
        this.product_id = id;
        this.product_name = name;
        this.product_desc = desc;
    }

}
