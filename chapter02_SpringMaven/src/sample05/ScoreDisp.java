package sample05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.conf")
public class ScoreDisp implements Score{
	@Qualifier("list")
	@Autowired private List<ScoreDTO> list;
	
	@Override
	public void execute() {
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(ScoreDTO scoreDTO : list) {
			System.out.println(scoreDTO.toString());			
		}
		
		//*자바의 실수* list는 clear() 하지 않는 한 지역변수일지라도, 소멸되지 않는다.
		//list가 DTO 클래스의 주소값을 참조하므로, 각각의 DTO에 대하여 서로 다른 주소값(=scope: prototype)을 가져야 함 (otherwise 마지막 DTO의 참조값으로 모든 DTO가 설정된다. )
		
	}

}
