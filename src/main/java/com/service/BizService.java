package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//<bean id="biza" class="com.service.BizService"></bean>

@Service("biza") //@Repository , @Component ,@Controller
public class BizService {
	
	@Autowired //it is pulling bean of type DataSource and setting here
	@Qualifier("pmagic")
	private DataSource dataSource;
	
	public void save(Biz biz){
		try {
			Connection conn=dataSource.getConnection();
			PreparedStatement preparedStatement=conn.prepareStatement("insert into biz_service_tbl"
					+ "(name,brand,doe) values(?,?,?)");
			preparedStatement.setString(1,biz.getName());
			preparedStatement.setString(2,biz.getBrand());
			preparedStatement.setTimestamp(3,biz.getDoe());
			int rows=preparedStatement.executeUpdate();
			System.out.println("Ahahah saved!!  = "+rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("saving biz = "+biz);
	}
	
	
	public List<Biz> findAll(){
		List<Biz> bizList=new ArrayList<>();
		try {
			Connection conn=dataSource.getConnection();
			PreparedStatement preparedStatement=conn.prepareStatement("select id,name,brand,doe from biz_service_tbl");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String brand=rs.getString(3);
				Timestamp doe=rs.getTimestamp(4);
				Biz biz=new Biz(id,name,brand,doe);
				bizList.add(biz);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bizList;
		
	}

}
