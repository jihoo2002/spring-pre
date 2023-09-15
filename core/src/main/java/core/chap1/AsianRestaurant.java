package core.chap1;

public class AsianRestaurant implements Restaurant {
			//레스토랑은 두가지 객체에 의존하고 있다.
			//두가지 객체가 없으면 안됨(의존적 관계)
	private Chef chef = new AsianChef();
	
	//요리 코스 
	private Course course = new SushiCourse();
	
	
	//요리를 주문하는 기능
	
	@Override
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu(); // 아시안 코스 메서드를 부름
		chef.cook();//아시안쉐프의 메서드를 부름
	}
	
	
}
