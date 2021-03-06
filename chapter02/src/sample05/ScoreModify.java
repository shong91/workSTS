package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;

@Setter
public class ScoreModify implements Score{
	private ArrayList<ScoreDTO> list;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);		
		int sw=0; 
		for (ScoreDTO scoreDTO : list) {
			sw =1; 
			System.out.print("수정할 이름 입력: ");
			String name = scan.next();
			if (scoreDTO.getName().equals(name)) {
				System.out.print("국어 점수 입력: ");
				scoreDTO.setKor(scan.nextInt());
				System.out.print("영어 점수 입력: ");
				scoreDTO.setEng(scan.nextInt());
				System.out.print("수학 점수 입력: ");
				scoreDTO.setMath(scan.nextInt());
				scoreDTO.setTot(scoreDTO.getKor() + scoreDTO.getEng() + scoreDTO.getMath());
				scoreDTO.setAvg(scoreDTO.getTot() / 3.0);

				System.out.println("성적 정보가 수정되었습니다. ");

			} else {
				System.out.println("해당하는 이름이 없습니다. ");
			}
		}
		
		if(sw == 0) System.out.println("등록된 정보가 없습니다. ");
		

	}

}
