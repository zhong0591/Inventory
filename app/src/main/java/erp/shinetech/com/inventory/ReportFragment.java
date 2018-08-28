package erp.shinetech.com.inventory;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportFragment extends Fragment {

    List<Map<String, Object>> map_products ;
    ListView lv ;

    public ReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_report = inflater.inflate(R.layout.fragment_report, container, false);
        bindProduct(view_report);
        return  view_report;
    }

    private void bindProduct(View view_report) {

        List<Product> list_product = new ArrayList<Product>();
        list_product.add(new Product(1,"Computer","Dell"));
        list_product.add(new Product(2,"Cell Phone","Apple"));
        list_product.add(new Product(3,"Mi","Xiao mi"));



        map_products = new ArrayList<Map<String,Object>>();
        for(int i = 0; i < list_product.size();i ++){
            Map<String, Object> p = new HashMap<String, Object>();
            p.put("Id", list_product.get(i).product_id);
            p.put("Name", list_product.get(i).product_name);
            p.put("Desc",  list_product.get(i).product_desc);
            map_products.add(p);
        }

        String[] from = new String[]{ "Id","Name","Desc"} ;
        int [] to =    new int[]{ R.id.product_id,  R.id.product_name, R.id.product_desc};
        lv = view_report.findViewById(R.id.lv_report);
        SimpleAdapter adp = new SimpleAdapter(view_report.getContext(), map_products, R.layout.fragment_report_item ,from,to);
        lv.setAdapter(adp);
    }

}
