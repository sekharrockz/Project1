package listViewExample;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by Sekharrockz on 22/04/16.
 */
public class SpinnerDropDownAdapter extends BaseAdapter implements
        SpinnerAdapter {
    Context context;

    SpinnerDropDownAdapter(Context ctx) {
        context = ctx;
    }

    String[] name = {" One", " Two", " Three", " Four", " Five", " Six",
            " Seven", " Eight"};
    String[] value = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8"};

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public String getItem(int pos) {
        // TODO Auto-generated method stub
        return name[pos];
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView text = new TextView(context);
        text.setTextColor(Color.BLACK);
        text.setText(name[position]);
        return text;
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        TextView text = new TextView(context);
        text.setTextColor(Color.BLACK);
        text.setText(value[position]);
        return text;
    }
}
