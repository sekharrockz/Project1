package preferenceFragmentExample;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class MyPreferenceFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragment_settings);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {

        return false;
    }
}
