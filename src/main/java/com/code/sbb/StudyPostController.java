package com.code.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@Controller
public class StudyPostController {
    private final StudyPostService studyPostService;

    public StudyPostController(StudyPostService studyPostService) {
        this.studyPostService = studyPostService;
    }

    @GetMapping("/studyboard")
    public String list(Model model) {
        List<StudyPost> studyPostList = studyPostService.getList();
        model.addAttribute("studyboard", studyPostList);
        return "recruit_board.html";
    }

   @GetMapping(value = "/studypost/detail/{postId}")
    public String detail(Model model, @PathVariable("postId") Integer postId) {
        StudyPost studyPost = studyPostService.getPostById(postId);
        model.addAttribute("post", studyPost);
        return "question_detail.html";
    }

    @GetMapping("/studyposting")
    public String createForm(Model model) {
        model.addAttribute("studyPostForm", new StudyPostForm());
        return "recruit_posting.html";
    }

    @PostMapping("/studyposting")
    public String create(@Valid StudyPostForm studyPostForm, BindingResult result) {
        if (result.hasErrors()) {
            return "recruit_posting.html";
        }
        StudyPost studyPost = new StudyPost();
        studyPost.setPostTitle(studyPostForm.getPostTitle());
        studyPost.setPostContent(studyPostForm.getPostContent());
        studyPostService.createPost(studyPost);
        return "redirect:/studyboard";
    }
}
