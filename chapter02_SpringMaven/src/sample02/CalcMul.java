package sample02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mul")
public class CalcMul implements Calc {
	//private @Value("25") int x;
	//private @Value("36") int y; 
	private int x, y; 
	
	@Autowired
	public void setX(@Value("25")int x) {
		this.x = x;
	}

	@Autowired
	public void setY(@Value("36")int y) {
		this.y = y;
	}

	/* 생성자함수는 실행과 동시에 자동 실행하지만, setter/getter는 그렇지 않기 때문에, 실행과 동시에 자동처리하도록
	 * annotation: Autowired 을 걸어주어야 한다.
	 */

	@Override
	public void calculate() {
		System.out.println(x + "*" + y + "=" + (x*y));

	}

}
