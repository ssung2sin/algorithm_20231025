package Programmers;

public class A159994_CardBundle {
	public static void main(String[] args) {

	}

	static class Solution {
		public String solution(String[] cards1, String[] cards2, String[] goal) {
			String answer = "No";
			if(completeText(goal,cards1,cards2)){
				answer = "Yes";
			}

			return answer;
		}



		private boolean completeText(String[]goal,String[]cards1, String[]cards2){
			int idx1 = 0;
			int idx2 = 0;

			for(String goalText : goal){
				if(idx1<cards1.length && goalText.equals(cards1[idx1])){
					idx1++;
				}else if(idx2<cards2.length && goalText.equals(cards2[idx2])){
					idx2++;
				}else{
					return false;
				}
			}
			return true;
		}
}
