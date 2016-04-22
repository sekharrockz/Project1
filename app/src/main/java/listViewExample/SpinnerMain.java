package listViewExample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 22/04/16.
 */
public class SpinnerMain extends AppCompatActivity {
    Spinner spinner;
    Button customAdapter;
    Button arrayAdapter;
    BaseAdapter baseAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        customAdapter = (Button) findViewById(R.id.customAdapter);
        arrayAdapter = (Button) findViewById(R.id.arrayAdapter);


        ArrayAdapter mArrayAdapter = ArrayAdapter.createFromResource(this, R.array.Planets, android.R.layout.simple_spinner_dropdown_item);
        mArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(mArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "got selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
        });

        customAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseAdapter = new BaseAdapter(getApplicationContext(), getResources().getStringArray(R.array.my_books));
                spinner.setAdapter(baseAdapter);
            }
        });
        arrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayAdapter mArrayAdapter = ArrayAdapter.createFromResource(v.getContext(), R.array.Planets, android.R.layout.simple_spinner_dropdown_item);
                mArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(mArrayAdapter);
            }
        });
    }
}
