package com.shanyuanjie.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shanyuanjie.qna.util.DBUtil;
import com.shanyuanjie.qna.vo.Candidate;

public class CandidateDao {

	/**
	 * 获取某人票数
	 * @param candidate
	 * @return
	 */
	public Integer checkVote(String name) {

		Integer vote = null;

		String sql = "SELECT vote FROM candidate WHERE NAME = ?";

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;

		connection = DBUtil.getConnection();

		pstmt = DBUtil.getPstmt(connection, sql);
		try {
			pstmt.setString(1, name);

			resultSet = pstmt.executeQuery();

			while (resultSet.next()) {
				vote = resultSet.getInt("vote");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(connection, pstmt, resultSet);
		}

		return vote;

	}

	/**
	 * 票数＋1
	 * @param name
	 * @param vote
	 */
	public void addVote(String name, Integer vote) {
		// TODO Auto-generated method stub
		String sql = "UPDATE candidate SET vote = ? WHERE name = ?	";
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		connection = DBUtil.getConnection();
		pstmt = DBUtil.getPstmt(connection, sql);
		
		try {
			pstmt.setInt(1, vote);
			pstmt.setString(2, name);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeAll(connection, pstmt, null);
		}
		
	}
	
	

}
