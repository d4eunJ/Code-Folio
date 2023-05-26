package com.code.sbb;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class StudyPostService {
    private final StudyPostRepository studyPostRepository;

    public List<StudyPost> getList() {
        return this.studyPostRepository.findAll();
    }
}
