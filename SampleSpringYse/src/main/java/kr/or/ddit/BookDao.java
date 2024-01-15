package kr.or.ddit;

import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Inject
	SqlSessionTemplate sqlSessionTemplate;

	public int insert(Map<String , Object> map) {
		return sqlSessionTemplate.insert("book.insert" , map);
	}
	
	public Map<String, Object> selectDetail(Map<String , Object> map){
		return sqlSessionTemplate.selectOne("book.select_detail" , map);
	}
}
