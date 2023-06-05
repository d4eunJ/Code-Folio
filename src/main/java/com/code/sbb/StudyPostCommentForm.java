package com.code.sbb;
import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudyPostCommentForm {
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String CommentContent;

    public String getContent() {
        return CommentContent;
    }
}
