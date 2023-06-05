package com.code.sbb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RequestMapping("/studypost")
//@RequiredArgsConstructor
@Controller
public class StudyBoardController {
    @GetMapping("/studyboard")
    public String feed() {
        return "recruit_board.html";
    }
}
