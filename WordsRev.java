package Highlight;

public class WordsRev {
	public static void main(String[] args) {
		String str = "apple banana kiwi";
		System.out.println(revWords(str)); // kiwi banana apple
	}

    public static String revWords(String str) {
        // your code goes here
     String res = "";
     String[] words = str.split(" ");
      for (int i=words.length-1; i>=0; i--){
     res += words[i]+" ";   
      }
  		return res;
    }
}
 