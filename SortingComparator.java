import java.util.*;
class Student{
	String name;
	int score;

	public Student(String n, int s){
		name = n; score = s;
	}
}
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] student = new Student[n];
		for(int i = 0; i<n; i++){
			String name = sc.next();
			int score = Integer.valueOf(sc.nextInt());
			
			student[i] = new Student(name, score);
		}

		Arrays.sort(student, new Comparator<Student>(){    // We can sort the array in this way also
			@Override 
			public int compare(Student s1, Student s2){
				if( s1.score == s2.score ) return s1.name.toString().compareToIgnoreCase(s2.name);
				return s2.score - s1.score;
			}
		});

		for(int i = 0; i<n; i++)
			System.out.println(student[i].name + " " + student[i].score);
		
	}
}


// import java.util.*;

// class Player {
// 	String name;
// 	int score;

// 	Player(String name, int score) {
// 		this.name = name;
// 		this.score = score;
// 	}
// }

// class Checker implements Comparator<Player> {
//   	// complete this method
// 	public int compare(Player a, Player b) {
    
//     }
// }


// public class Solution {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         Player[] player = new Player[n];
//         Checker checker = new Checker();
        
//         for(int i = 0; i < n; i++){
//             player[i] = new Player(scan.next(), scan.nextInt());
//         }
//         scan.close();

//         Arrays.sort(player, checker);
//         for(int i = 0; i < player.length; i++){
//             System.out.printf("%s %s\n", player[i].name, player[i].score);
//         }
//     }
// }