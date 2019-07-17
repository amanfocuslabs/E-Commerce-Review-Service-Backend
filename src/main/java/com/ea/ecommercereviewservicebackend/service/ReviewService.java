package com.ea.ecommercereviewservicebackend.service;

import com.ea.ecommercereviewservicebackend.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAllByAccountId(Long id);
    List<Review> findAllByProductId(Long id);
    Review addreview(Review review);
}
