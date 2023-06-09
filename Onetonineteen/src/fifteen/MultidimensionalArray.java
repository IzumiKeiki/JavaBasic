/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package fifteen;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[][] test = {
				{64,73,69},
				{58,81,75},
				{86,68,79},
				{72,55,80},
		};
		
		for ( int i=0; i<test.length; i++) {
			System.out.println("生徒" + (i+1) + "：国語" + test[i][0] + "点、" + "数学" + test[i][1] + "点、" + "英語" + test[i][2] + "点" );
		}
		
		System.out.println("-----");
		
		int a = 0;
		for ( int j=0; j<test.length; j++) {
			a = a + test[j][0];
		}
		System.out.println("国語の平均点は" + a/test.length + "点です。");
		
		int b = 0;
		for ( int j=0; j<test.length; j++) {
			b = b + test[j][1];
		}
		System.out.println("数学の平均点は" + b/test.length + "点です。");
		
		int c = 0;
		for ( int j=0; j<test.length; j++) {
			c = c + test[j][2];
		}
		System.out.println("英語の平均点は" + c/test.length + "点です。");
		
		
	}

}
