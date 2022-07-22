package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.MemberVO;
import com.javaclass.service.MemberService;

// ### (1) 해당 어노테이션 지정
@Controller
public class MemberController {

	// ### (2) 해당 어노테이션 지정
	@Autowired
	private MemberService memberServiceImpl;
	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
	// ### (3) 해당 어노테이션 지정
	@RequestMapping("insertMember.do")
	public void insertMember( MemberVO vo ) {
		memberServiceImpl.insertMember(vo);
	}
	
	// ### (4) 해당 어노테이션 지정
	@RequestMapping("login.do")
	public String login(MemberVO vo, HttpSession session) {
		MemberVO result = memberServiceImpl.loginCheck(vo);
		System.out.println(result.getUsername());
		if(result==null || result.getUserid() == null) {
			return "loginForm";
		}else {
			// (5) 로그인 성공한 사용자이름을 세션에 저장
			// 비교
			//if( vo.getUserid() == vo.getUserid() && vo.getUserpass().equals(vo.getUserpass())) {
				System.out.println("로그인성공");
				System.out.println("로그인성공");
				System.out.println("로그인성공");
				System.out.println("로그인성공");
				System.out.println("로그인성공");
				session.setAttribute("login", result.getUsername());
			//}
			return "loginConfirm";
		}
	}
	
}
