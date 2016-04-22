package dialogFragmentExample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class DialogFragmentMain extends AppCompatActivity {
    Button dialogFragmentBtn;
    Button androiddialogFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_fragment_main);
        dialogFragmentBtn = (Button) findViewById(R.id.dialogFragment);
        androiddialogFragment = (Button) findViewById(R.id.androiddialogFragment);

        dialogFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                MyDialogFragment myDialogFragment = MyDialogFragment.newInstance("test");
                myDialogFragment.show(fragmentManager, "fragment_edit_name");
            }
        });
        androiddialogFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                AndroidDialogFragment myDialogFragment = AndroidDialogFragment.newInstance("android test");
                myDialogFragment.show(fragmentManager, "android_fragment_edit_name");
            }
        });
    }
}
