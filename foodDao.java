package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.food;
import Model.rstr;

public class foodDao implements implFood{

	public static void main(String[] args) {
		//create
		food f = new food(3,"curry");
		new foodDao().add(f);
		//read
		//System.out.println(new foodDao().query("00002"));`
		//update
		//u.setName(null);
		//new foodDao().update(r); 
		//delete
		//new foodDao().delete(3);


	}

	@Override
	public void add(Object o) {
		Connection conn = implFood.getDb();
		String SQL = "insert into food(rstrId,foodName)"+"values(?,?)";
		food f = (food) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, f.getRstrId());
			ps.setString(2, f.getFoodName());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String query(Integer foodId) {
		Connection conn = implFood.getDb();
		String SQL = "select * from food where foodId = ?";
		String show = "";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, foodId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				show = show+"<tr><td>"+rs.getInt("foodId")+
						"<td>"+rs.getString("foodName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return show;
	}

	@Override
	public void update(Object o) {
		Connection conn = implFood.getDb();
		String SQL = "update food set foodId=?,foodName=?"
				+",where foodId=?";
		food f  =(food) o;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, f.getFoodId());
			ps.setString(2, f.getFoodName());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int foodId) {
		Connection conn = implFood.getDb();
		String SQL = "delete from food where foodId = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, foodId);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
