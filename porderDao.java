package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import Model.porder;

public class porderDao implements implPorder{

	public static void main(String[] args) {
		//create
		porder p = new porder(2,1,2);
		new porderDao().add(p);
		//read
		//System.out.println(new porderDao().query("00002"));`
		//update
		//porder p = new porderDao().update(2);
		//p.setName("null");
		//delete
		//new porderDao().delete(2);


	}

	@Override
	public void add(Object o) {
		Connection conn = implPorder.getDb();
		String SQL = "insert into porder(memberId,rstrId,foodId)"
					+"values(?,?,?)";
		porder p = (porder) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, p.getMemberId());
			ps.setInt(2, p.getRstrId());
			ps.setInt(3, p.getFoodId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String query(int porderId) {
		Connection conn = implPorder.getDb();
		String SQL = "select * from porder where porderId = ?";
		String show = "";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, porderId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				show = show+"<tr><td>"+rs.getInt("porderId")+
						"<td>"+rs.getInt("memberId")+
						"<td>"+rs.getInt("rstrId")+
						"<td>"+rs.getInt("foodId");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return show;
	}

	@Override
	public void update(Object o) {
		Connection conn = implPorder.getDb();
		String SQL = "update porder set porderId=?,memberID=?,rstrId=?,foodId=?"
				+",where porderId=?";
		porder p  =(porder) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, p.getPorderId());
			ps.setInt(2, p.getMemberId());
			ps.setInt(3, p.getRstrId());
			ps.setInt(4, p.getFoodId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int porderId) {
		Connection conn = implPorder.getDb();
		String SQL = "delete from porder where porderId = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, porderId);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<porder> queryAll() {
		Connection conn = implPorder.getDb();
		String SQL = "select * from porder";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
