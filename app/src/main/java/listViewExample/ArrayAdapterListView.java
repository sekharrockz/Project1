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
public class ArrayAdapterListView extends AppCompatActivity {
    ListView listView;
    MyArrayAdapter myArrayAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);
        listView = (ListView) findViewById(R.id.listView);
        myArrayAdapter = new MyArrayAdapter(getApplicationContext());
        listView.setAdapter(myArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Item Got Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
