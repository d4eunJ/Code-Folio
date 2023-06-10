package com.code.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private StudyPostRepository studyPostRepository;

	@Test
	void testJpa() {
		StudyPost q1 = new StudyPost();
		q1.setPostTitle("sbb가 무엇인가요?");
		q1.setPostContent("sbb에 대해서 알고 싶습니다.");
		q1.setPostCreateDate(LocalDateTime.now());

		this.studyPostRepository.save(q1);  // 첫번째 질문 저장

		StudyPost q2 = new StudyPost();
		q2.setPostTitle("스프링부트 모델 질문입니다.");
		q2.setPostContent("id는 자동으로 생성되나요?");
		q2.setPostCreateDate(LocalDateTime.now());
		this.studyPostRepository.save(q2);  // 두번째 질문 저장
	}
}