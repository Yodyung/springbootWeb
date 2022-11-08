package ex1_xml2_ref;

public class MemberDao {
	private MemberBean member;

	public MemberDao() {}
	
	//setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
	//생성자
	public MemberDao(MemberBean member) {
		this.member = member;
	}
	
	public void insert() {
		member.output();
		System.out.println("내 마음속에 저 장");
	}
	
	

}
