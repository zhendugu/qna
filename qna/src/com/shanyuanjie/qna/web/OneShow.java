package com.shanyuanjie.qna.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shanyuanjie.qna.dao.CandidateDao;
import com.shanyuanjie.qna.vo.Candidate;

public class OneShow extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		Candidate candidate = null;
		candidate = new CandidateDao().showOne(Integer.parseInt(request.getParameter("id")));
		
		request.setAttribute("candidate", candidate);
		
		request.getRequestDispatcher("final.jsp").forward(request, response);

	}
}
