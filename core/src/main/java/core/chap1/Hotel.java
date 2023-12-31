package core.chap1;

public class Hotel {
	
	//호텔은 레스토랑 객체에 의존적. 
	private Restaurant restaurant = new WesternRestaurant();
	// 그냥 초기화하면 기본값null이 나옴
	
	//헤드쉐프
	private Chef headchef = new FrenchChef();
	
	//호텔의 정보를 알려주는 기능
	public void inform() {
		System.out.printf("우리 호텔의 레스토랑은 %s입니다.헤드쉐프는 %s입니다.\n"
				,restaurant.getClass().getSimpleName()
				,headchef.getClass().getSimpleName());
		//클래스 이름만 단순출력 하겠다.
		restaurant.order();
	}
	
}
