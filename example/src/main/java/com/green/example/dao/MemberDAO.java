package com.green.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.green.example.dto.MemberDTO;

@Repository
public class MemberDAO implements IMemberDAO{
//	private HashMap<String, MemberDTO> dbMap;
	
	public MemberDAO() {
//		dbMap = new HashMap<String, MemberDTO>();
	}

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
	public int memberInsert(MemberDTO mdto) {
		getCon();
		int result = 0;
		
		try {
			String sql = "insert into customer(id,pwd,name,email,birth,sns) values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPwd());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getBirth());
			pstmt.setString(6, mdto.getSns());
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
//		MemberDTO mdto = new MemberDTO();
//		mdto.setId(id);
//		mdto.setPwd(pwd);
//		mdto.setName(name);
//		mdto.setEmail(email);
//		mdto.setBirth(birth);
//		mdto.setSns(sns);
		
//		dbMap.put(id, mdto);
		
//		for(String key: dbMap.keySet()) {
//			MemberDTO value = dbMap.get(key);
//			System.out.print("memberId:"+value.getId()+"\t");
//			System.out.print("|memberPw:"+value.getPwd()+"\t");
//			System.out.print("|memberName:"+value.getName()+"\t");
//			System.out.print("|memberMail:"+value.getEmail()+"\t");
//			System.out.print("|memberBirth:"+value.getBirth()+"\t");
//			System.out.print("|memberSns:"+value.getSns()+"\t");
//		}
	}

	@Override
	public MemberDTO memberSelect(MemberDTO mdto) {
//		MemberDTO mem = dbMap.get(mdto.getId());
//		return mem;
		getCon();
		MemberDTO mem = null;
		
		try {
			String sql = "select * from customer where id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPwd());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String birth = rs.getString("birth");
				String sns = rs.getString("sns");
				
				mem = new MemberDTO();
				mem.setId(id);
				mem.setPwd(pwd);
				mem.setName(name);
				mem.setEmail(email);
				mem.setBirth(birth);
				mem.setSns(sns);
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
	public int memberDelete(MemberDTO mdto) {
		getCon();
		int result = 0;
		
		try {
			String sql = "delete from customer where id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPwd());
			result = pstmt.executeUpdate();
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
		return result;
	}
}
