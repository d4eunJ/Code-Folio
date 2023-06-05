package com.code.sbb;
//스터디 모집.java

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudyPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    @Column(length = 200)
    private String postTitle;

    @Column(columnDefinition = "TEXT")
    private String postContent;

    private LocalDateTime postCreateDate;

    private int postViews;
    private String author;
    private int commentCount;
    @ElementCollection
    private List<String> postHashtags;

    @OneToMany(mappedBy = "studyboard", cascade = CascadeType.REMOVE)
    private List<StudyPostComment> commentlist;

}
