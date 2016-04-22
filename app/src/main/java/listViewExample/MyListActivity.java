package listViewExample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class MyListActivity extends ListActivity {
    BaseAdapter baseAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity_main);
        baseAdapter = new BaseAdapter(getApplicationContext(), getResources().getStringArray(R.array.Planets));
        setListAdapter(baseAdapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "git clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
