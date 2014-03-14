package vit;
import java.sql.ResultSet;
import java.sql.Types;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;


public class DbGateway {
private SimpleJdbcTemplate simpleJdbctemplate;
	
	public void setSimpleJdbctemplate(SimpleJdbcTemplate simpleJdbctemplate) {
		this.simpleJdbctemplate = simpleJdbctemplate;
	}
	
	public void insertStudent(student s){
		String q="insert into STUDENT values(?,?,?)";
		simpleJdbctemplate.update(q,new Object[]{s.getGrno(),s.getFirstname(),s.getLastname()});
	}
	public void searchStudent(student s){
		String q="select * from STUDENT where FNAME = ?";
		int rs=simpleJdbctemplate.update(q, new Object[]{s.getFirstname()});
		System.out.println(rs+"  founds");
	}
	public void deleteStudent(student s){
		String q="delete from STUDENT where FNAME = ?";
	
		int drows =simpleJdbctemplate.update(q, new Object[]{s.getFirstname()});
		
		System.out.println(drows+" record deleted with first name "+ s.getFirstname());
	}
}
