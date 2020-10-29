import java.util.*;
class Student {
	String name;
	int score;

	public Student(String n, int s) {
		name = n; score = s;
	}
	public String toString() {
		return this.name + " " + this.score;
	}
}
class SortingComparator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] student = new Student[n];
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int score = Integer.valueOf(sc.nextInt());

			student[i] = new Student(name, score);
		}

		Arrays.sort(student, new Comparator<Student>() {   // We can sort the array in this way also
			@Override
			public int compare(Student s1, Student s2) {
				if ( s1.score == s2.score ) return s1.name.toString().compareToIgnoreCase(s2.name);
				return s2.score - s1.score;
			}
		});

		System.out.println(Arrays.toString(student));

		// for (int i = 0; i < n; i++)
		// 	System.out.println(student[i].name + " " + student[i].score);

	}
}
// SortingComparator.java