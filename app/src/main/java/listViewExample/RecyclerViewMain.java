package listViewExample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 22/04/16.
 */
public class RecyclerViewMain extends AppCompatActivity {
    RecyclerView recyclerView;
    private StaggeredGridLayoutManager mStaggeredLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_main);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        mStaggeredLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerViewAdapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.Planets), getApplicationContext());
        recyclerView.setLayoutManager(mStaggeredLayoutManager);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setOnClickListener(new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Got clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
