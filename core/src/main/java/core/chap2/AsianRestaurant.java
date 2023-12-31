package core.chap2;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
			//레스토랑은 두가지 객체에 의존하고 있다.
			//두가지 객체가 없으면 안됨(의존적 관계)
	private Chef chef;
	
	//요리 코스 
	private Course course;
	
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
//	
//	public void setCourse(Course course) {
//		this.course = course;
//	}
	
	//요리를 주문하는 기능
	
	@Override
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu(); // 아시안 코스 메서드를 부름
		chef.cook();//아시안쉐프의 메서드를 부름
	}
	
	
}
