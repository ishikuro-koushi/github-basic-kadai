package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21{

	HashMap<String,String> aaa = new HashMap<String,String>();

	public Dictionary_Chapter21(){
		aaa.put("apple","りんご");
		aaa.put("peach","もも");
		aaa.put("banana","バナナ");
		aaa.put("lemon","レモン");
		aaa.put("pear","梨");
		aaa.put("kiwi","キウイ");
		aaa.put("strawberry","いちご");
		aaa.put("grape","ぶどう");
		aaa.put("muscat","マスカット");
		aaa.put("cherry","さくらんぼ");
	}
	public void bbb(String[]ddd) {
		for(int i = 0; i < ddd.length; i ++){
			if(aaa.get(ddd[i]) == null) {
				System.out.println(ddd[i] + "は辞書に存在しません");
			}else{
				System.out.println(ddd[i]+"の意味は" + aaa.get(ddd[i]));
			}
		}
	}
}