package ex1_xml5_collections;

public class MemberDao {
	private MemberBean member;
	
	public MemberDao() {
		
	}
	public MemberDao(MemberBean member) {
		super();
		this.member = member;
	}
	public  void setMember(MemberBean member) {
		this.member = member;
	}
	public void insert() {
		member.output();
	}
}
