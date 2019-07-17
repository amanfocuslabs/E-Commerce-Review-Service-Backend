package com.ea.ecommercereviewservicebackend.repository;

import com.ea.ecommercereviewservicebackend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    public List<Review> findAllByAccountId(Long id);
    public List<Review> findAllByProductId(Long id);
}
