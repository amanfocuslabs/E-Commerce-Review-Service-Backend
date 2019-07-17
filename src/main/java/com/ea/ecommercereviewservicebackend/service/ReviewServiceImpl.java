package com.ea.ecommercereviewservicebackend.service;

import com.ea.ecommercereviewservicebackend.model.Review;
import com.ea.ecommercereviewservicebackend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public List<Review> findAllByAccountId(Long id) {
        return reviewRepository.findAllByAccountId(id);
    }

    @Override
    public List<Review> findAllByProductId(Long id) {
        return reviewRepository.findAllByProductId(id);
    }

    @Override
    public Review addreview(Review review) {
        return reviewRepository.save(review);
    }
}
