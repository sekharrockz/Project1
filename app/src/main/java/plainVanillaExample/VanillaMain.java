package plainVanillaExample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.project.project1.R;

/**
 * Created by user on 19/04/16.
 */
public class VanillaMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vanilla_main);
    }

    public void selectFrag(View view) {
        Fragment fr;
        if (view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();

        } else {
            fr = new FragmentOne();
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }
}
