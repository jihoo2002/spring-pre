package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
			//레스토랑은 두가지 객체에 의존하고 있다.
			//두가지 객체가 없으면 안됨(의존적 관계)
	@Autowired
	@Qualifier("asianChef")
	private Chef chef;
	
	//요리 코스 
	@Autowired
	@Qualifier("sushi")
	private Course course;
	
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
//	
//	public void setCourse(Course course) {
//		this.course = course;
//	}
	/*
    # @Autowired
    - 객체를 자동 주입할 때 사용하는 아노테이션입니다.
    - 스캔 명령을 통해 객체를 찾아 주입하는데, 타입 이름으로 검색합니다.
    - 타입을 찾아내지 못하면 이름(id 속성값)을 통해 검색합니다.
    - 생성자, 메서드, 필드에 적용 가능합니다.
    
    # @Qualifier("bean id")
    - Autowired를 사용할 때 동일 타입의 빈이 여러 개 있는 경우
    어떤 빈을 주입해야 하는 지 선택해 주는 추가 아노테이션 입니다.
    */
	
	@Autowired //spring 컨테이너에서 필요한 값들을 넣어줌
	
	
//	
//	public AsianRestaurant(@Qualifier("asianChef")Chef chef, @Qualifier("sushi")Course course) {
//		super();
//		this.chef = chef;
//		this.course = course;
//	} //생성자 말고 필드 변수에 @Autowired @Qualifier를 선언해서 사용해도 됨
//	
	
	//요리를 주문하는 기능
	
	@Override
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu(); // 아시안 코스 메서드를 부름
		chef.cook();//아시안쉐프의 메서드를 부름
	}

	
	
}
