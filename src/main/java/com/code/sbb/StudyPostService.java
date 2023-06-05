package com.code.sbb;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudyPostService {
    private final StudyPostRepository studyPostRepository;

    public List<StudyPost> getList() {
        return studyPostRepository.findAllByOrderByPostIdDesc();
    }

    public StudyPost getPostById(Integer postId) {
        return studyPostRepository.findById(postId).orElse(null);
    }

    public void createPost(StudyPost studyPost) {
        studyPost.setPostCreateDate(LocalDateTime.now());
        studyPost.setPostViews(0);
        studyPost.setCommentCount(0);
        studyPostRepository.save(studyPost);
    }
}
