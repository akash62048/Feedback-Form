package com.feedback.FeedbackForm.repository;

import com.feedback.FeedbackForm.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {

}
