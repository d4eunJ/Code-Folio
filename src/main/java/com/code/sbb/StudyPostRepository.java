package com.code.sbb;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudyPostRepository extends JpaRepository<StudyPost, Integer> {
    List<StudyPost> findAllByOrderByPostIdDesc();
}
