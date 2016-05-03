package com.example.steelrooter.nearbyrestaurants.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.steelrooter.nearbyrestaurants.R;
import com.example.steelrooter.nearbyrestaurants.models.Restaurant;

import java.util.List;

/**
 * For restaurants results
 * <p/>
 * Created by Sachin on 03/05/16 at 1:19 PM.
 */
public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder> {

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        TextView mRating;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            mRating = (TextView) itemView.findViewById(R.id.tv_rating);
        }
    }

    private Context mContext;
    private List<Restaurant> mRestaurants;

    public RestaurantsAdapter(Context context) {
        mContext = context;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        mRestaurants = restaurants;
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant, parent, false);

        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {

        Restaurant restaurant = null;
        try {
            restaurant = mRestaurants.get(position);
        } catch (Exception ignore) {}
        if (restaurant != null) {
            holder.mTitle.setText(restaurant.getName());
            if (restaurant.getRating() == null) {
                holder.mRating.setVisibility(View.INVISIBLE);
            } else {
                holder.mRating.setVisibility(View.VISIBLE);
                holder.mRating.setText(mContext.getString(R.string.rating_template, restaurant.getRating()));
            }
        } else {
            holder.mTitle.setText("");
            holder.mRating.setText("");
        }
    }

    @Override
    public int getItemCount() {
        return mRestaurants == null ? 0 : mRestaurants.size();
    }
}
