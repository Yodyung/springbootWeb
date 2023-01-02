package com.example.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.BoardVO;

//******************************
public interface BoardRepository extends CrudRepository<BoardVO, Integer>{
	//상속받는 용도
}



/*
 * CrudRepository<T,ID>
 * 		T  : 엔티티 클래스 타입
 * 		ID : 식별자 타입
 * 		
 * 		-long count() : 
 * 		-void deleteById(ID) : 
 * 		-void deleteAll() : 
 * 		-boolean existsById(ID) :
 * 		-Iterable<T> findAll :  
 * 		-Optional<T> findById(ID) :  
 * 		-<S extends T>S save(S) : ()안에 들어가는 S 
 */