package com.code.sbb;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@Controller
public class StudyPostCommentController {
    private final StudyPostCommentService studyPostCommentService;
    private final StudyPostService studyPostService;

    public StudyPostCommentController(StudyPostCommentService studyPostCommentService, StudyPostService studyPostService) {
        this.studyPostCommentService = studyPostCommentService;
        this.studyPostService = studyPostService;
    }

    @PostMapping("/studypost/detail/{postId}/comment")
    public String createComment(@PathVariable("postId") Integer postId, @Valid StudyPostCommentForm commentForm,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            StudyPost studyPost = studyPostService.getPostById(postId);
            model.addAttribute("post", studyPost);
            return "recruit_board.html";
        }
        StudyPostComment studyPostComment = new StudyPostComment();
        studyPostComment.setContent(commentForm.getContent());
        //studyPostComment.setCreateDate(LocalDateTime.now());
        studyPostComment.setStudyboard(studyPostService.getPostById(postId));
        studyPostCommentService.createComment(studyPostComment);
        return "redirect:/studypost/detail/{postId}";
    }
}
