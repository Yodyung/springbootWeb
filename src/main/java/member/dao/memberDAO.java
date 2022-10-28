package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import temp.EmpDAO;
import temp.EmpVO;

public class memberDAO {
	
	private memberDAO() throws Exception{
		//1. driver loading (보낼 때마다가 아닌 드라이버 로딩 1번만 할거임)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버로딩 성공");   
	}
	
	//singleton 패턴 <**********실무에서 정말 많이 사용됨*********>
		//static에는 static만 접근할 수 있기 때문에 static변수 선언 뒤 static 함수로 만들어 준다.
		static memberDAO empDAO=null;
		//위의 클래스가 throws Exception을 하니 throws Exception을 같이 던져준다.
		public static memberDAO getInstance() throws Exception{
		//null 값일때만 새로 객체를 열어 생성해주고 null값이 아니면 그 동일한 주소값을 return 해준다.	
			if(empDAO ==null) empDAO=new memberDAO();
			return empDAO;
		}
		
		public void insert(memberVO vo) throws Exception{
			//2. 연결객체 얻어오기
			String url="jdbc:oracle:thin:@192.168.0.56:1521:xe";
			String user="scott";
			String pass="tiger";

			Connection con=null;											//전송 객체 선언 해주기
			PreparedStatement ps=null;
			try {
				con = DriverManager.getConnection(url,user,pass);
				System.out.println("DB 연결 성공"); 

				//3. sql 문장 만들기
				String sql = "INSERT INTO bad (name, ename, email, age ) VALUES (?,?,?,?) ";

				//4. 전송객체 얻어오기 (?에 값 저장)
				ps=con.prepareStatement(sql);
				ps.setString(1,vo.getName());;
				ps.setString(2,vo.getEname());;
				ps.setString(3,vo.getEmail());
				ps.setInt(4,vo.getAge());

				//5. 전송
				ps.executeUpdate();

			}finally {
				// 6. 닫기 
				ps.close();
				con.close();
			}
		}	

}
