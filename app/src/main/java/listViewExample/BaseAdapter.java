package listViewExample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class BaseAdapter extends android.widget.BaseAdapter implements SpinnerAdapter {
    Context mContext;
    String[] arr;

    BaseAdapter(Context mContext, String[] arr) {
        this.mContext = mContext;
        this.arr = arr;
    }

    public BaseAdapter() {
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
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        /*
            code crashes when we use view holder to set an base adapter to an spinner view.
         */
        TextView title;
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.base_adapter_each_item, parent, false);
        }
        title = (TextView) convertView.findViewById(R.id.title);
        title.setText(getItem(position));
        return convertView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.base_adapter_each_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.title);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.mTextView.setText(getItem(position));
        return convertView;
    }

    private static class ViewHolder {
        TextView mTextView;
    }
}
