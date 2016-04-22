package listViewExample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class MyArrayAdapter extends ArrayAdapter {
    Context mContext;
    String[] planets;

    @Override
    public int getCount() {
        return planets.length;
    }

    public MyArrayAdapter(Context context) {
        super(context, 0);
        this.mContext = context;
        this.planets = mContext.getResources().getStringArray(R.array.Planets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TestHolder viewHolder;
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_fragment_each_item, parent, false);
            viewHolder = new TestHolder();
            viewHolder.planet_name = (TextView) convertView.findViewById(R.id.planet_name);
        } else {
            viewHolder = (TestHolder) convertView.getTag();
        }
        if (getItem(position) != null) {
            viewHolder.planet_name.setText(getItem(position));
        }
        return convertView;
    }

    @Override
    public String getItem(int position) {
        return planets[position];
    }

    static class TestHolder {
        TextView planet_name;
    }
}
