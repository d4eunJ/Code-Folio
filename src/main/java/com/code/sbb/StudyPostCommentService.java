package com.code.sbb;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudyPostCommentService {
    private final StudyPostCommentRepository studyPostCommentRepository;

    public void createComment(StudyPostComment studyPostComment) {
        studyPostCommentRepository.save(studyPostComment);
    }
}
