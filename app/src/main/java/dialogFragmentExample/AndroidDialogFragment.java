package dialogFragmentExample;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Sekharrockz on 19/04/16.
 */
public class AndroidDialogFragment extends DialogFragment implements AdapterView.OnItemClickListener {

    public static AndroidDialogFragment newInstance(String title) {
        AndroidDialogFragment frag = new AndroidDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        android.app.AlertDialog.Builder myDialogBuilder = new android.app.AlertDialog.Builder(getActivity());
        myDialogBuilder.setMessage("dasdasda");
        myDialogBuilder.setTitle(title);
        myDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        myDialogBuilder.setNegativeButton("NOT OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        return myDialogBuilder.create();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
