package com.ea.ecommercereviewservicebackend.controller;

import com.ea.ecommercereviewservicebackend.model.Review;
import com.ea.ecommercereviewservicebackend.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review){
        return reviewService.addreview(review);
    }
    @GetMapping("/getReviewByAccount/{id}")
    public List<Review> getAllReviewsByProduct(@PathVariable Long id){
        return reviewService.findAllByAccountId(id);
    }
    @GetMapping("/getReviewByProduct/{id}")
    public List<Review> getAllReviewsByAccount(@PathVariable Long id){
        return reviewService.findAllByProductId(id);
    }

}
