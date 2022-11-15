package sample.java.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.java.domain.EmpVO;
import sample.repository.EmpDao;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;
	
	@Override
	public List<EmpVO> empSelect() {
		
		return empDao.empSelect();
	}

	@Override
	public List<HashMap> empDept() {
		return empDao.empDept();
	}

}
