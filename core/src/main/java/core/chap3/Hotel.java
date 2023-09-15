package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hotel {
	
	//제어의 역전(Ioc) :객체 생성의 제어권을 외부로 넘긴다.
	//의존성 주입 (DI) :외부에서 생성된 객체를 주입받는 개념. 
	
	
	//호텔은 레스토랑 객체에 의존적. 
	private Restaurant restaurant;
	// 그냥 초기화하면 기본값null이 나옴
	
	//헤드쉐프
	private Chef headChef;
	
	public Hotel() {
		
	}
	//생성자 주입
	
	//호텔객체가 생성될 때 매개변수로 맞는 값들이 전달됨

	public Hotel(Restaurant restaurant, Chef headChef) {
		super();
		this.restaurant = restaurant;
		this.headChef = headChef;
	}
	
	//setter 주입
	@Autowired
	@Qualifier("asianChef") // 내가 넣고자 하는 빈의 아이디를 넣어줌
	public void setHeadChef(Chef headChef) {
		this.headChef = headChef;
	}
	
	//setter 주입 
	@Autowired //spring 컨테이너에 접근해 필요한 값들을 불러 자동 주입해줌.
	@Qualifier("asianRes")
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	//호텔의 정보를 알려주는 기능
	public void inform() {
		System.out.printf("우리 호텔의 레스토랑은 %s입니다.헤드쉐프는 %s입니다.\n"
				,restaurant.getClass().getSimpleName()
				,headChef.getClass().getSimpleName());
		//클래스 이름만 단순출력 하겠다.
		restaurant.order();
	}
	
}
