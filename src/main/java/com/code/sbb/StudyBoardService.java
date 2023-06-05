package com.code.sbb;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class StudyBoardService {
    private final StudyBoardRepository studyBoardRepository;

    public List<StudyBoard> getList() {
        return this.studyBoardRepository.findAll();
    }
}
