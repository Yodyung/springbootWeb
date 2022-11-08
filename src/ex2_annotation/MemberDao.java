package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDao {
	//3. 필드 기반 의존성 주입 방식(DI)
	//**********************************
	@Autowired
	private MemberBean member;

//	public MemberDao() {}
//	기본적으로 생성자 또는 setter로 지정해줌	
//	//setter
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
//	//생성자
//	public MemberDao(MemberBean member) {
//		this.member = member;
//	}
	
	public void insert() {
		member.output();
		System.out.println("내 마음속에 저 장");
	}
	
	

}
