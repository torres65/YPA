package com.example.ypa.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ypa.R;
import com.example.ypa.activity.Review;

import java.util.List;

public class ReviewListAdapter extends BaseAdapter {                        // 리뷰 리스트 구현하는 클래스입니다.
    private Context context;
    private List<Review> reviewList;

    public ReviewListAdapter(Context context, List<Review> reviewList) {
        this.context = context;
        this.reviewList = reviewList;
    }

    @Override
    public int getCount() {
        return reviewList.size();
    }

    @Override
    public Object getItem(int position) {
        return reviewList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.review, null);
        TextView reviewText = (TextView) v.findViewById(R.id.reviewText);
        TextView nameText = (TextView) v.findViewById(R.id.nameText);
        TextView dateText = (TextView) v.findViewById(R.id.dateText);

        reviewText.setText(reviewList.get(position).getReview());
        nameText.setText(reviewList.get(position).getName());
        dateText.setText(reviewList.get(position).getDate());

        v.setTag(reviewList.get(position).getReview());
        return v;



    }

}
