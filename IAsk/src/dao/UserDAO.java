package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.UserBean;

import utils.DBConn;

public class UserDAO {
	public ArrayList<UserBean> selectAll(){
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		DBConn jdbc = DBConn.getInstance();
		jdbc.startConn();
		ResultSet rs = jdbc.query(" select * from qiuwen_user ");
		if(rs != null){
			try{
				while(rs.next()){
					UserBean user = new UserBean();
					user.setId(rs.getString("usr_id"));
					user.setPwd(rs.getString("usr_pwd"));
					user.setNickname(rs.getString("nickname"));
					user.setIsOk(rs.getInt("is_ok"));
					user.setSex(rs.getInt("sex"));
					user.setAge(rs.getInt("age"));
					user.setSchool(rs.getString("school"));
					user.setText(rs.getString("text"));
					users.add(user);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jdbc.close();
		return users;
	}
	
	public boolean deleteAccount(int id){
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		String sql1 = "delete from qiuwen_user where usr_id = '"+id+"'";
		String sql2 = "delete from qiuwen_userques where u_id = '"+id+"'";
		boolean rs1 = jdbc.execute(sql1);
		boolean rs2 = jdbc.execute(sql2);
		jdbc.commit();
		return rs1&&rs2;
	}
	
	public boolean lockAccount(int id){
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		String sql = "update qiuwen_user set is_ok = '0' where usr_id = '"+id+"'";
		boolean rs = jdbc.execute(sql);
		jdbc.commit();
		return rs;
	}
	
	public boolean unlockAccount(int id){
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		String sql = "update qiuwen_user set is_ok = '1' where usr_id = '"+id+"'";
		boolean rs = jdbc.execute(sql);
		jdbc.commit();
		return rs;
	}
	
	public ArrayList<UserBean> searchById(String id){		
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		DBConn jdbc = DBConn.getInstance();
		jdbc.startConn();
		ResultSet rs = jdbc.query("select * from qiuwen_user where usr_id = '"+id+"'");
		if(rs != null){
			try{
				while(rs.next()){
					UserBean user = new UserBean();
					user.setId(rs.getString("usr_id"));
					user.setNickname(rs.getString("nickname"));
					user.setPwd(rs.getString("usr_pwd"));
					user.setIsOk(rs.getInt("is_ok"));
					user.setSex(rs.getInt("sex"));
					user.setAge(rs.getInt("age"));
					user.setSchool(rs.getString("school"));
					user.setText(rs.getString("text"));
					users.add(user);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jdbc.close();
		return users;
	}

	public ResultSet selectIsOk(String uid){
		DBConn jdbc=DBConn.getInstance();
		jdbc.startConn();
		String sql = " select is_ok from qiuwen_user where usr_id=\""+uid+"\"" ;
		ResultSet rs = jdbc.query(sql);
		jdbc.close();
		return rs;
	}
	
	public ResultSet selectAccount(String account,String pwd){
		DBConn jdbc = DBConn.getInstance();
		jdbc.startConn();
		String sql = " select usr_id,is_ok from qiuwen_user where usr_id='"+account+"' and usr_pwd='"+pwd+"'" ;
		ResultSet rs = jdbc.query(sql);
		jdbc.close();
		return rs;
	}
	
	public boolean insertAccount(String account,String pwd){
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		String sql = "insert into qiuwen_user (usr_id,usr_pwd,is_ok,sex,age,school) values('"+account+"','"+pwd+"',1,-1,-1,'未知学校')";
		boolean rs = jdbc.execute(sql);
		jdbc.commit();
		return rs;
	}
	
	public boolean updateSchool(String quesId,String text) {
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		boolean rs = jdbc.execute(" update qiuwen_user set school = '"+text+"' where usr_id = '"+quesId+"'" );
		jdbc.commit();
		return rs;
		
	}
	
	public boolean updateSex(String quesId,int sex) {
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		boolean rs = jdbc.execute("update qiuwen_user set sex = "+sex+" where usr_id = '"+quesId+"'" );
		jdbc.commit();
		return rs;
	}
	
	public boolean updateAge(String quesId,int age) {
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		boolean rs = jdbc.execute("update qiuwen_user set age = "+age+" where usr_id = '"+quesId+"'" );
		jdbc.commit();
		return rs;
	}

	public boolean updateNickName(String quesId, String text) {
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		boolean rs = jdbc.execute("update qiuwen_user set nickname = '"+text+"' where usr_id = '"+quesId+"'" );
		jdbc.commit();
		return rs;
	}

	public boolean updatetext(String quesId, String text) {
		// TODO Auto-generated method stub
		DBConn jdbc=DBConn.getInstance();
		jdbc.startTrans();
		boolean rs = jdbc.execute("update qiuwen_user set text = '"+text+"' where usr_id = '"+quesId+"'" );
		jdbc.commit();
		return rs;
	}
	
}