package sample05;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Scope("prototype")
@Data
public class ScoreDTO implements Comparable<ScoreDTO>{ 
	private String name; // 이름은 중복 불가 
	private int kor; 
	private int eng; 
	private int math; 
	private int tot; 
	private double avg;
	
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f",avg);
	}

	@Override
	public int compareTo(ScoreDTO o) {
		if(this.getTot() > o.getTot()) return -1;
		else if(this.getTot() < o.getTot()) return 1; 
		return 0;
	}
}
