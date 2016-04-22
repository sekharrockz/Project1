package listViewExample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.project.project1.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class SimpleAdapterListView extends AppCompatActivity {
    ListView listview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter_main);
        String[] from = new String[]{"txt1", "txt2", "txt3"};
        int[] to = new int[]{R.id.txt1, R.id.txt2, R.id.txt3};
        List<HashMap<String, String>> fillMaps = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("txt1", "col_1_item_" + i);
            map.put("txt2", "col_2_item_" + i);
            map.put("txt3", "col_3_item_" + i);
            fillMaps.add(map);
        }
        listview = (ListView) findViewById(R.id.listView);
        SimpleAdapter mAdapter = new SimpleAdapter(getApplicationContext(), fillMaps, R.layout.simple_adapter_each_item, from, to);
        listview.setAdapter(mAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Got clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
