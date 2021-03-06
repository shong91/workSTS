package sample03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ComponentScan("com.conf")
@Setter @Getter @ToString
public class ScoreDTO {
	@Value("길동") private String name;
	@Value("90") private int kor;
	@Value("100") private int eng;
	@Value("88") private int math;
	private int tot;
	private double avg;
}
