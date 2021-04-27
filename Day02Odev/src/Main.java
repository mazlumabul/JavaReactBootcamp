
public class Main {
	public static void main(String[] args) {

		Course javaReactBootcamp = new Course(1, "Java React ", "21/04/2021");
		Course charpAnuglarBootcamp = new Course(2, "Charp Angular ", "09/01/2021");
		Course temelKurs = new Course(3, "Programlamaya Giriþ için Temel Kurs", "01/01/2021");

		Course[] courses = { javaReactBootcamp, charpAnuglarBootcamp, temelKurs };

		System.out.println("-Bootcampler-");
		for (Course course : courses) {
			
			System.out.println("Bootcamp Adý : " + course.name + ", Baþlangýç Tarihi : " + course.date);
		}

		Instructor javaReactInstructor = new Instructor(1, "Engin", "DEMÝROÐ", "engindemirog@gmail.com");
		Instructor charpAngularInstructor = new Instructor(2, "Mazlum", "ABUL", "mazlumabul10@gmail.com");
		Instructor temelKursInstructor = new Instructor(3, "Ali", "OSMAN", "aliosman@gmail.com");

		Instructor[] instructors = { javaReactInstructor, charpAngularInstructor, temelKursInstructor };

		System.out.println("-Eðitmen Bilgileri-");
		for (Instructor instructor : instructors) {
			
			System.out.println("Ad Soyad : "+instructor.firstName +" "+ instructor.lastName + ", Mail : "+ instructor.email );
		} 
		
		
		System.out.println("Kayýt Olduðunuz Kurslar");
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(temelKurs);
		courseManager.addToCourse(javaReactBootcamp);
		 
		System.out.println("-Eðitmenlerimiz-");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showInstructor(javaReactInstructor);
		instructorManager.showInstructor(charpAngularInstructor);
		instructorManager.showInstructor(temelKursInstructor);
		
		
	}
} 
