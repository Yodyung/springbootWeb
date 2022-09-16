package Chapter10.EX09;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	VIPCustomer(){
		grade="VIP";
		bonusratio=0.05;
		bonuspoint=10;
	}
	VIPCustomer(int id, String name, int agentID){
		super(id,name);
		grade="VIP";
		bonusratio=0.05;
		bonuspoint=10;
	}
	
	//교재 10장에 슈퍼까지 나갔다고 하면됨.
	
}
