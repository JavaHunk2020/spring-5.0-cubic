package com.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//<bean id="biza" class="com.service.BizService"></bean>

@Service("biza") //@Repository , @Component ,@Controller
public class BizService {
	
	@Autowired //it is pulling bean of type DataSource and setting here
	@Qualifier("pmagic")
	private DataSource dataSource;
	
	
	public String updateByName(String name,String brand){
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		int rows=jdbcTemplate.update("update biz_service_tbl set brand=? where name = ?",brand,name);
		String result="Number of row update is  = "+rows;
		/*String result="";
		try {
			Connection conn=dataSource.getConnection();
			PreparedStatement preparedStatement=conn.prepareStatement("update biz_service_tbl set brand=? where name = ?");
			preparedStatement.setString(1,brand);
			preparedStatement.setString(2,name);
			int rows=preparedStatement.executeUpdate();
			result="Number of row update is  = "+rows;
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return result;
	}
	
	
	public String deleteByName(String name){

		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		int rows=jdbcTemplate.update("delete from biz_service_tbl where name = ?",name);
		String result="Number of row deleted is  = "+rows;
		
		/*String result="";
		try {
			Connection conn=dataSource.getConnection();
			PreparedStatement preparedStatement=conn.prepareStatement("delete from biz_service_tbl where name = ?");
			preparedStatement.setString(1,name);
			int rows=preparedStatement.executeUpdate();
			result="Number of row deleted is  = "+rows;
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return result;
	}
	
	public void save(Biz biz){
		String sql="insert into biz_service_tbl(name,brand,doe) values(?,?,?)";
		Object[] data={biz.getName(),biz.getBrand(),biz.getDoe()};
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,data);
		/*try {
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
		*/
		System.out.println("saving biz = "+biz);
	}
	
	
	public List<Biz> findAll(){
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		List<Biz> bizList=jdbcTemplate.query("select id,name,brand,doe from biz_service_tbl", new BeanPropertyRowMapper(Biz.class));
		/*List<Biz> bizList=new ArrayList<>();
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
		*/
		return bizList;
		
	}

}
