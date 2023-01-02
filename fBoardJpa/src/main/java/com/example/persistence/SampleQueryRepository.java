package com.example.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.BoardVO;

public interface SampleQueryRepository extends CrudRepository<BoardVO, Integer> {
	
	//제목 검색
	List<BoardVO> findBoardVOByTitle(String title);
	//제목에 글자 포함된 검색	
	List<BoardVO> findBoardVOByTitleContaining(String word);
	//전체검색을 페이징!!!
	List<BoardVO> findAll(Pageable paging);
	
}


/*   조건 검색          ==>       		쿼리 메소드

WHERE title=?1            			findBoardVOByTitle() (BoardVO 생략 가능)
WHERE lastname=?1      	 			findByLastname()
WHERE lastname<>?1      	 		findByLastnameNot()
where lastname=?1 and firstname=?2  findByLastnameAndFirstname()
where startDate between ?1 and ?2	findByStartDateBetween()
where age < ?1						findByAgeLessThen()
where age <= ?1						findByAgeLessThenEqual()
where age > ?1						findByAgeGraeterThen()
where age >= ?1						findByAgeGraeterThenEqual()
where age is null					findByAgeIsNull()
where age is not null				findByAgeIsNotNull()
where firstname like '%'||?||'%'	findByFirstnameContain()
where age =?1
order by lastname desc				findByAgeOrederByLastnameDesc()
*/