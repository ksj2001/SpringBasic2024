package com.green.session.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.green.session.dto.Member;
@Repository
public class MemberDao implements IMemberDao{
	
	// HashMap으로 임시 테이블 작성
	//HashMap<String,Member> db;
	
	public MemberDao() {
		//db = new HashMap<String,Member>();
	}
	
	//================  db 연결 코드
	private String URL="jdbc:mysql://localhost:3306/springdb?serverTimezone=UTC";
	private String userId = "root";
	private String userPw = "12345678";
	
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, userId, userPw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int memberInsert(Member member) {
		getCon();
		int result = 0; // 
		// member table에 삽입
		try {
			String sql = "insert into member(memId,memPw,memMail) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPw());
			pstmt.setString(3, member.getMemMail());
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				// 자원 반납
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public Member memberSelect(Member member) {
		getCon();
		Member mem = null;
		try {
			String sql = "select * from member where memId=? and memPw=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPw());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mem = new Member();
				mem.setMemId(rs.getString(1));
				mem.setMemPw(rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return mem;
	}

	@Override
	public int memberUpdate(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
