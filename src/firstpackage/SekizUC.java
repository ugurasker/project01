package firstpackage;

public class SekizUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  // Students' answers to the questions
			 char[][] answers = {
			 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
			
			 // Key to the questions
			 char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
			 int[]grades = new int[answers.length];
			 int[] students=new int[answers.length];
			 // Grade all answers
			 for (int i = 0; i < answers.length; i++) {
			 // Grade one student
			 int correctCount = 0;
			 for (int j = 0; j < answers[i].length; j++) {
			 if (answers[i][j] == keys[j])
			 correctCount++;
			}
			 grades[i]=correctCount;
			 students[i]=i;
			 }
			sortArray(grades,students);
			 }
	  public static void sortArray (int[] grades,int[] students) {
		  
		  for (int i=0;i<grades.length-1;i++) {
			 int  curMin=grades[i];
			  int curInd= i;
			  for (int j=i+1;j<grades.length;j++) {
				  if (curMin>grades[j]) {
					  curMin=grades[j];
					  curInd=j;
				  }
			  }
			  if (curInd != i) {
				  int temp= students[i];
				  students[i]=students[curInd];
				  students[curInd]=temp;
				  
				  grades[curInd]=grades[i];
				  grades[i]=curMin;
			  }
		  }
			for (int i=0;i<grades.length;i++) {
				System.out.println("Student number"+students[i]+" "+grades[i]);
			}
	  }
			 }

