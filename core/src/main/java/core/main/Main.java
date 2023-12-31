package core.main;

import org.springframework.aop.framework.adapter.AdvisorAdapterRegistrationManager;
import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {
		
//		Hotel hotel = new Hotel();
//		hotel.inform();
			
		//빈 등록에 사용된 xml의 설정을 가져오는 객체 생성 (classpath == src/main/resources)
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:hotel-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class); //호텔 클래스 타입의 id 호텔
		hotel1.inform(); //id hotel을 지목하고 그 옆에 타입인 Hotel.class임.
		//xml에서 만든 hotel 객체를 통해 메서드를 부름 
		//getBean은 싱글톤이라 객체가 단 하나임 
		
		System.out.println("=========================");
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();
		

	}

}
