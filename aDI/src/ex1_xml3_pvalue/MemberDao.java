package ex1_xml3_pvalue;

public class MemberDao {
	
	private MemberBean member;
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
	}
	public MemberDao(MemberBean member) {
		this.member = member;
	}
	public MemberBean getMember() {
		return member;
	}
	public void setMember(MemberBean member) {
		this.member = member;
	}
	public void insert() {
		member.output();
		System.out.println("DB에 입력했다");
	}
}
