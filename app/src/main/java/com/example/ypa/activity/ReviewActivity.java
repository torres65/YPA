package com.example.ypa.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.ypa.R;
import com.example.ypa.adapter.ReviewListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ReviewActivity extends BaseDrawerActivity{
    private ListView reviewListView;                    // 리뷰 리스트
    private ReviewListAdapter adapter;
    private List<Review> reviewList;


    RatingBar ratingBar;                                // 사용자 평점 작성바
    Button button;                                      // 사용자 리뷰 작성 버튼
    EditText editText;                                  // 사용자가 리뷰쓰는 창
    Button button2;                                     // 가격비교 링크

    ImageView imageView;                                // 상품 이미지

    //받아와야하는 것들
    String userId;                              // 사용자 아이디
    String rating;                              // 상품의 총 평점
    TextView textView;                          // 상품의 설명

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        reviewListView = (ListView) findViewById(R.id.reviewListView);                              // 리뷰들 가져오기
        reviewList = new ArrayList<Review>();
        reviewList.add(new Review("이렇게 사료 잘 먹는 모습 처음봐요.", "김용석", "2019-02-12"));
        reviewList.add(new Review("사료를 바꾸고 식분증이 사라졌어요", "정우영", "2019-02-13"));
        reviewList.add(new Review("눈물 자국이 완전 없어졌어요", "김소희", "2019-02-18"));
        reviewList.add(new Review("기호성 좋은 사료네요", "박상진", "2019-02-20"));
        reviewList.add(new Review("변냄새도 줄고 눈물도 줄었어요.", "DOG", "2019-03-19"));
        reviewList.add(new Review("맨들맨들 윤기납니다..", "CAT", "2019-03-20"));
        reviewList.add(new Review("견생사료 만났습니다.", "YPA", "2019-03-23"));
        adapter = new ReviewListAdapter(getApplicationContext(), reviewList);
        reviewListView.setAdapter(adapter);


        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imageView);


        button.setOnClickListener(new View.OnClickListener() {      // 리뷰 작성 버튼 클릭
            @Override
            public void onClick(View v) {                           // 작성 버튼을 클릭
                String userReview = editText.getText().toString();  // 사용자가 쓴 리뷰
                float userRating = ratingBar.getRating();           // 사용자가 입력한 평점
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {     // 가격 비교 버튼 클릭
            @Override
            public void onClick(View v) {

            }
        });
    }
}
