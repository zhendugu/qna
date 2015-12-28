package com.shanyuanjie.qna.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shanyuanjie.qna.dao.CandidateDao;
import com.shanyuanjie.qna.vo.Candidate;

public class CandidateShow extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		List<Candidate> candidates = null;
		candidates = new CandidateDao().showAll();
		
		request.setAttribute("list", candidates);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
