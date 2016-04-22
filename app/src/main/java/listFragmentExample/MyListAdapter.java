package listFragmentExample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.project.project1.R;

/**
 * Created by user on 19/04/16.
 */
public class MyListAdapter extends BaseAdapter {
    Context mContext;
    String[] arr;

    MyListAdapter(Context mContext, String[] arr) {
        this.mContext = mContext;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_fragment_each_item, null);
        }
        TextView country_name = (TextView) convertView.findViewById(R.id.planet_name);
        country_name.setText(getItem(position));
        return convertView;
    }
}
