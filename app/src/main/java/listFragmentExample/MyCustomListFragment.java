package listFragmentExample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.project.project1.R;

/**
 * Created by user on 19/04/16.
 */
public class MyCustomListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    public String TAG = MyCustomListFragment.this.getClass().getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] arr = getActivity().getResources().getStringArray(R.array.Planets);
        MyListAdapter myListAdapter = new MyListAdapter(getActivity(), arr);
        setListAdapter(myListAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG, "onItemClick() got called");
    }
}
