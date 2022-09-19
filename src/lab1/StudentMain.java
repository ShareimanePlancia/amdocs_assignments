package lab1;

public class StudentMain {

	public static void main(String[] args) {
			Student[] std = new Student[5];
			
			std[0] = new Student ("Nancy", 16, 1234, 75);
			std[1] = new Student ("Mae", 16, 4567, 30);//“Marks less than 30 cannot be accepted”
			std[2] = new Student ("John", 18, 8910, 80);
			std[3] = new Student ("Philip", 17, 1122, 90);
			std[4] = new Student ("Carla", 18, 2122, 25);//“Marks less than 30 cannot be accepted”
			
			for (int i = 0; i < std.length; i++) {
				if (std[i].getMarks() <= 30)
				{
					System.out.println("Marks less than 30 cannot be accepted");
				} else {
					System.out.println(std[i].toString());				}
			}
		}
}
