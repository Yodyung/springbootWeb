package sample.repository;

import java.util.HashMap;
import java.util.List;

import sample.java.domain.EmpVO;

public interface EmpDao {

	List<EmpVO> empSelect();
	
	List<HashMap> empDept();
	

}