package core.chap2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor //기본 생성자
@AllArgsConstructor //매개값 두개 받는 생성자 
public class WesternRestaurant implements Restaurant {
			//레스토랑은 두가지 객체에 의존하고 있다.
			//두가지 객체가 없으면 안됨(의존적 관계)
	private Chef chef;
	
	//요리 코스 
	private Course course;
	
	
	
	//요리를 주문하는 기능
	@Override
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
	
}
