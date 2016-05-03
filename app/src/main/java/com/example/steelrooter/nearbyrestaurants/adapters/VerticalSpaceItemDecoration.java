package com.example.steelrooter.nearbyrestaurants.adapters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * For adding vertical gap to RecyclerView
 * <p>
 * Created by Sachin on 27/01/16 at 4:40 PM.
 */
public class VerticalSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private final int mVerticalSpaceHeight;
    private final int mTopSpaceHeight;
    private final boolean mIsTopSpaceEnabled;

    public VerticalSpaceItemDecoration(int verticalSpaceHeight) {
        mVerticalSpaceHeight = verticalSpaceHeight;
        mTopSpaceHeight = 0;
        mIsTopSpaceEnabled = false;
    }

    public VerticalSpaceItemDecoration(int verticalSpaceHeight, int topSpaceHeight) {
        mVerticalSpaceHeight = verticalSpaceHeight;
        mTopSpaceHeight = topSpaceHeight;
        mIsTopSpaceEnabled = true;
    }

    @Override
    public void getItemOffsets(
            Rect outRect,
            View view,
            RecyclerView parent,
            RecyclerView.State state) {
        /*
        //For omitting space for the last element
        if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = mVerticalSpaceHeight;
        }
        */

        outRect.bottom = mVerticalSpaceHeight;

        if (mIsTopSpaceEnabled && parent.getChildAdapterPosition(view) == 0) {
            outRect.top = mTopSpaceHeight;
        }
    }
}