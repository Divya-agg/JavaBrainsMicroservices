package com.javabrains.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public void initData(String userId) {
        this.setUserRating(Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4)
        ));
    }
}
