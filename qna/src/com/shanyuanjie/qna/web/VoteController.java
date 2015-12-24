package com.shanyuanjie.qna.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shanyuanjie.qna.dao.CandidateDao;
import com.shanyuanjie.qna.vo.Candidate;

public class VoteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		
		Integer vote = new CandidateDao().checkVote(name);
		
		vote ++;
		
		new CandidateDao().addVote(name ,vote);
		
		
	}
}
