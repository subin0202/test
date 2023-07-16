package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDao {
	
	//필드 기반의 의존성 주입 방식
	@Autowired
	private MemberBean member;
	
//	public MemberDao() {
//		// TODO Auto-generated constructor stub
//	}
//	public MemberDao(MemberBean member) {
//		super();
//		this.member=member;
//	}
//	public MemberBean getMember() {
//		return member;
//	}
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	public void insert() {
		member.output();
		
	}
}
