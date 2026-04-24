package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {

		try(Scanner scanner = new Scanner(System.in)){
			String aaa;
			while(true) {
				try {
					System.out.println("自分のじゃんけんの手を入力しましょう");
					System.out.println("グーはrockのrを入力しましょう");
					System.out.println("チョキはscissorsのsを入力しましょう");
					System.out.println("パーはpaperのpを入力しましょう");
					aaa = scanner.next();
					if(aaa.equals("r")||aaa.equals("s")||aaa.equals("p")) {
						return aaa;
					}else {
						throw new IllegalArgumentException("エラー");
					}
				}catch(IllegalArgumentException e){
					System.out.println("エラー");
				}
			}
		}

	}
	public String getRandom() {
		String[] hand = {"r","s","p"};
		int String = (int)Math.floor(Math.random()*3);

		return hand[String];
	}
	public void playGame() {
		HashMap<String,String> bbb = new HashMap<String,String>();
		bbb.put("r","グー");
		bbb.put("s","チョキ");
		bbb.put("p","パー");

		String myHand = getMyChoice();
		String enemyHand = getRandom();

		System.out.print("あなたの手は" + bbb.get(myHand));
		System.out.println(",対戦相手の手は" + bbb.get(enemyHand));

		if(myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		}else if((myHand.equals("r") && enemyHand.equals("s"))||(myHand.equals("s") && enemyHand.equals("p"))||(myHand.equals("p") && enemyHand.equals("r"))){
			System.out.println("自分の勝ちです");
		}else{
			System.out.println("自分の負けです");
		}
	}
}