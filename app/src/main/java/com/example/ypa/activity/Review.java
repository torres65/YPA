package com.example.ypa.activity;

public class Review {                                           // 물품 상세창에서 다른 사용자의 리뷰를 리스트로 보여줄 때 사용하는 클래스입니다
    String review;
    String name;
    String date;

    public Review(String review, String name, String date) {
        this.review = review;
        this.name = name;
        this.date = date;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
