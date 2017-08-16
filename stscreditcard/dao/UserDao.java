package com.czbank.stscreditcard.dao;

import java.util.List;

import com.czbank.stscreditcard.po.TblAdmin;
import com.czbank.stscreditcard.po.TblUser;
import com.czbank.stscreditcard.po.LoginUser;
import com.czbank.stscreditcard.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserDao {

	public List<TblUser> userSelectAll();
	 
	public int userApplyInsert(TblUser tbluser);
	
	public int userUpdate(TblUser tbluser);

	String TABLE_NAME = "tbluser";
	String INSERT_FIELDS = "user_name, age, sex, phone, address, ID_number, url1, url2, debt, income, Guaranteer, Guaranteer_phone, email";
	String SELECT_FIELDS = " user_id, " + INSERT_FIELDS;
	String LOGIN_FIELDS = "user_id, login_name, pwd";

	@Update({"update ", TABLE_NAME, "set user_name = #{user_name}, age = #{age}, sex = #{sex}, phone = #{phone}, " +
			"address = #{address}, ID_number = #{ID_number}, url1 = #{url1}, url2 = #{url2}, debt = #{debt}, " +
			"income = #{income}, Guaranteer = #{Guaranteer}, Guaranteer_phone = #{Guaranteer_phone}, " +
			"email = #{email}  where user_id=#{user_id}"})
	int addUser(@Param("user_id") int user_id, @Param("user_name") String user_name, @Param("age") int age,
				@Param("sex") int sex, @Param("phone") String phone, @Param("address") String address,
				@Param("ID_number") String ID_number, @Param("url1") String url1, @Param("url2") String url2,
				@Param("debt") double debt, @Param("income") double income, @Param("Guaranteer") String Guaranteer,
				@Param("Guaranteer_phone") String Guaranteer_phone, @Param("email") String email);

	@Select({"select ", LOGIN_FIELDS, " from ", TABLE_NAME, "where","login_name=#{name}"})
	LoginUser selectByLoginName(String name);

	@Select({"select ", SELECT_FIELDS , " from ", TABLE_NAME, " where id=#{user_id}"})
	User getUser_id(int user_id);
}