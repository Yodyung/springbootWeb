package sample.java.Service;

import java.util.HashMap;
import java.util.List;

import sample.java.domain.EmpVO;

public interface EmpService {

	List<EmpVO> empSelect();
	public List<HashMap> empDept();
}
