package ohmsoftwaresinc.com.listviewcalculator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Ankitkumar on 5/1/2016.
 */
public class ProuctListAdapter extends BaseAdapter {
    private Context mcontext;
    private List<Product> mproductlist;

    public ProuctListAdapter(Context mcontext, List<Product> mproductlist)
    {
        this.mcontext = mcontext;
        this.mproductlist = mproductlist;
    }

    @Override
    public int getCount() {
        return mproductlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mproductlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = View.inflate(mcontext,R.layout.row,null);
        TextView tv_name = (TextView)v.findViewById(R.id.tv_name);
        final TextView tv_price = (TextView)v.findViewById(R.id.tv_price);
       // Button delete = (Button)v.findViewById(R.id.delete);
       // Button delete = (Button)v.findViewById(R.id.delete);
       // Button delete = (Button)v.findViewById(R.id.delete);

        tv_name.setText(mproductlist.get(position).getItem_name());
        tv_price.setText(String.valueOf(mproductlist.get(position).getItem_price()));


        return v;
    }


}
