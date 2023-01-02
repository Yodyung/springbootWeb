package com.example.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.BoardVO;

public interface QueryAnnoRepository extends CrudRepository<BoardVO, Integer> {
	
	//[1] JPQL (복잡한 쿼리)
	 @Query("SELECT b FROM BoardVO b WHERE b.title LIKE %?1% ORDER BY b.seq DESC")
	 List<BoardVO> queryAnnotation(String word);
	 
	 //[2] SQL (복잡한 쿼리)
	 @Query(value="SELECT * FROM board WHERE title LIKE '%'||?1||'%' ORDER BY seq DESC",
			 nativeQuery=true)
	 List<BoardVO> queryAnnotation2(String word);
	 	 
	 //[2] SQL (복잡한 쿼리 - 조인인 경우)
	 //Board2와 board_file 
	 //레코드 리턴 값이 BoardVO으로 안나옴 => Object[], HashMap 등으로 받아야함 
	 @Query(value="SELECT seq,title,writer,regdate,cnt FROM board WHERE title LIKE '%'||?1||'%' ORDER BY seq DESC",
			 nativeQuery=true)
	 List<BoardVO> queryAnnotation3(String word);
	 
	
}
