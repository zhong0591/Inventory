package erp.shinetech.com.inventory;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Zhong on 2018/8/27.
 */

public class JsonHelper {

    public  void ConvertJson(String json){

        try {
            JSONObject obj = new JSONObject(json);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
