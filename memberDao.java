package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Model.member;

public class memberDao implements implMember{

	public static void main(String[] args) {
		//create
		member m = new member("john","0000","j","taipei","0900123123","354566");
		new memberDao().add(m);
		//read
		//System.out.println(new memberDao().query("00002"));`
		//update
		//m.setUsername("null");
		//new memberDao().update(m); 
		//delete
		//new memberDao().delete(2);

	}

	public void add(Object o) {
		Connection conn = implMember.getDb();
		String SQL = "insert into member(username,password,name,address,phone,mobile)"
					+"values(?,?,?,?,?,?)";
		member m = (member) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getUsername());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getName());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			ps.setString(6, m.getMobile());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String query(String username, String password) {
		Connection conn = implMember.getDb();
		String SQL = "select * from member where username = ?, password = ?";
		String show = "";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				show = show+"<tr><td>"+rs.getInt("memberId")+
						"<td>"+rs.getString("username")+
						"<td>"+rs.getString("password")+
						"<td>"+rs.getString("name")+
						"<td>"+rs.getString("address")+
						"<td>"+rs.getString("phone")+
						"<td>"+rs.getString("mobile");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return show;
		
	}

	@Override
	public void update(Object o) {
		Connection conn = implMember.getDb();
		String SQL = "update member set memberId=?,username=?,password=?,name=?,address=?,phone=?,mobile=?"
				+",where id=?";
		member m  =(member) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, m.getMemberId());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getName());
			ps.setString(5, m.getAddress());
			ps.setString(6, m.getPhone());
			ps.setString(7, m.getMobile());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int memberId) {
		Connection conn = implMember.getDb();
		String SQL = "delete from member where memberId = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, memberId);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<member> queryMember(String username, String password) {
		Connection conn = implMember.getDb();
		String SQL = "select * from member where username = ?,password = ?";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
		
	}

}
