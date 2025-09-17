package com.feedback.FeedbackForm.controller;

import com.feedback.FeedbackForm.model.Post;
import com.feedback.FeedbackForm.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PostController {

    @Autowired
    PostRepo repo;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("post", repo.findAll());
        model.addAttribute("newPost", new Post());
        return "index";
    }
    @PostMapping("/save")
    public String savePost(@ModelAttribute("newPost") Post post) {
        repo.save(post);
        return "redirect:/";
    }

}
