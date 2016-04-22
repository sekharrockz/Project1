package listViewExample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.project1.R;

/**
 * Created by Sekharrockz on 22/04/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    String[] planetNames;
    Context mContext;
    OnClickListener onClickListener;

    RecyclerViewAdapter(String[] planetNames, Context mContext) {
        this.planetNames = planetNames;
        this.mContext = mContext;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_each_item, parent, false);
        return new RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.planetName.setText(planetNames[position]);
    }

    @Override
    public int getItemCount() {
        return planetNames.length;
    }

    public interface OnClickListener {
        public void onClick(View view, int position);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView planetName;

        public MyViewHolder(View itemView) {
            super(itemView);
            planetName = (TextView) itemView.findViewById(R.id.recycler_planet_name);
        }

        @Override
        public void onClick(View v) {
            if (onClickListener != null) {
                onClickListener.onClick(itemView, getAdapterPosition());
            }
        }
    }

    public void setOnClickListener(final RecyclerViewAdapter.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
