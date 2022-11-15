package sample.repository;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.java.domain.EmpVO;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private SqlSessionTemplate sqlsess;
	
	@Override
	public List<EmpVO> empSelect(){
		return sqlsess.selectList("EmpDao.empSelect");
						//하나만 받을거면 셀렉트원, 여러개 셀렉트리스트
	}

	@Override
	public List<HashMap> empDept() {
		return sqlsess.selectList("EmpDao.empDept");
	}
}
