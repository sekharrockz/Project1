package listViewExample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class BaseAdapterListView extends AppCompatActivity {
    ListView listView;
    BaseAdapter mBaseAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_adapter_main);
        listView = (ListView) findViewById(R.id.listView);
        mBaseAdapter = new BaseAdapter(getApplicationContext(), getResources().getStringArray(R.array.Planets));
        listView.setAdapter(mBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Got clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
