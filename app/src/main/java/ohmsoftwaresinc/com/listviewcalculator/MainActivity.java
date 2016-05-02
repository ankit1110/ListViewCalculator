package ohmsoftwaresinc.com.listviewcalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{

    private ProuctListAdapter adapter;
    private ListView listView;
    private List<Product> mProductlist;
    GlobalClass gc = new GlobalClass();
    EditText ed_name, ed_price;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lv);
        ed_name = (EditText) findViewById(R.id.ed_name);
        ed_price = (EditText) findViewById(R.id.ed_price);
        total = (TextView) findViewById(R.id.tv_total);


        mProductlist = new ArrayList<>();
        adapter = new ProuctListAdapter(getApplicationContext(), mProductlist);
        listView.setAdapter(adapter);


    }

    public void btn_click(View v) {


   //     mProductlist.add(new Product(ed_name.getText().toString(), Integer.parseInt(ed_price.getText().toString())));
    //    adapter = new ProuctListAdapter(getApplicationContext(), mProductlist);
     //   listView.setAdapter(adapter);

        mProductlist.add(new Product(ed_name.getText().toString(), Integer.parseInt(ed_price.getText().toString())));
        adapter.notifyDataSetChanged();

        //    gc.sum = sumMyIntValues(listView);
        //gc.sum = gc.sum + Integer.parseInt(ed_price.getText().toString());


         Toast.makeText(getApplicationContext(),""+listView.getCount(),Toast.LENGTH_LONG).show();
         for (int i = 0; i <= listView.getCount(); i++) {
            v = listView.getChildAt(i);
            TextView myView = (TextView) v.findViewById(R.id.tv_price);
            gc.sum = gc.sum + Integer.parseInt(myView.getText().toString());

            total.setText("" + gc.sum);


        }


    }
}


