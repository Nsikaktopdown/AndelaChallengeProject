package ng.codeimpact.andelachallengeproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import ng.codeimpact.andelachallengeproject.R;

/**
 * Created by Nsikak  Thompson on 3/11/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<Home_item> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView txtItem,  description;
        RelativeLayout layer;

        public MyViewHolder(View view) {
            super(view);
            imgItem = (ImageView) view.findViewById(R.id.thumbnail);
            txtItem = (TextView) view.findViewById(R.id.title);
            layer = (RelativeLayout) view.findViewById(R.id.layer);

        }
    }


    public UserAdapter(List<Home_item> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.homelist_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Home_item item = moviesList.get(position);

        /// holder.layer.setBackgroundColor(item.getColor());
        // Toast.makeText(holder.layer.getContext(), item.getColor(), Toast.LENGTH_SHORT).show();


        Context context = holder.txtItem.getContext();
        ChronicaProRegularHelper.applyFont(context, holder.txtItem);
        holder.imgItem.setImageResource(item.getImage());
        holder.txtItem.setText(item.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = holder.itemView.getContext();

                if(position ==0 ){
                    context.startActivity(new Intent(context, CategoryActivity.class));
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
