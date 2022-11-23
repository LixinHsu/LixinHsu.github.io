package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.member;
import Model.rstr;

public class rstrDao implements implRstr{

	public static void main(String[] args) {
		//create
		//rstr r = new rstr("sushi");
		//new rstrDao().add(r);
		//read
		//System.out.println(new rstrDao().query("00002"));`
		//update
		//u.setName(null);
		//new rstrDao().update(r); 
		//delete
		new rstrDao().delete(6);

	}

	@Override
	public void add(Object o) {
		Connection conn = implRstr.getDb();
		String SQL = "insert into rstr(rstrName)"+"values(?)";
		rstr r = (rstr) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, r.getrstrName());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String query(Integer rstrId) {
		Connection conn = implRstr.getDb();
		String SQL = "select * from rstr where rstrId = ?";
		String show = "";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, rstrId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				show = show+"<tr><td>"+rs.getInt("rstrId")+
						"<td>"+rs.getString("rstrName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return show;
	}

	@Override
	public void update(Object o) {
		Connection conn = implRstr.getDb();
		String SQL = "update rstr set rstrId=?,rstrName=?"
				+",where rstrId=?";
		rstr r  =(rstr) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, r.getRstrId());
			ps.setString(2, r.getrstrName());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int rstrId) {
		Connection conn = implRstr.getDb();
		String SQL = "delete from rstr where rstrId = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, rstrId);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
