package com.code.sbb;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudyPostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CommentId;

    @Column(columnDefinition = "TEXT")
    private String CommentContent;

    private LocalDateTime CommentCreateDate;

    @ManyToOne
    private StudyPost studyboard;

    public void setContent(String content) {
        this.CommentContent = content;
    }

    public void setCommentCreateDate() {
        this.CommentCreateDate = LocalDateTime.now();
    }
}
