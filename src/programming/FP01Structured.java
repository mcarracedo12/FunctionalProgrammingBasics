package programming;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 6, 8, 9, 1, 5, 45, 36, 21, 23, 78, 56, 98);
		
		System.out.println("*** Imprime Imperativo");
		
		printAllNumbersInListStructure(numbers);
			
		System.out.println("*** Ahora Segun Curso");
		
		printAllNumbersInListFunctional(numbers);
		
		System.out.println("*** Ahora Segun Curso 2");
		
		printAllNumbersInListFunctional2(numbers);
		
		System.out.println("*** Imprime Even Imperativo");
		
		printEvenNumbersInListStructure(numbers);
		
		System.out.println("*** Imprime Even Funcional");
		
		printEvenNumbersInListFunctional(numbers);
		
		System.out.println("*** Imprime Even Functional Lambda");
		
		printEvenNumbersInListLambda(numbers);
		
		System.out.println("*** Imprime Odd con Lambda");
		
		printOddNumbers(numbers);
		
		
		List<String>courses = List.of("Java in 28 minutes", "Spring", "Spring Boot", "API", "Azure", "Docker");
		
		System.out.println("*** Imprime Cursos");
		
		printAllCourses(courses);
		
		System.out.println("*** Imprime Cursos Filtrados con Lambda");
		
		printFilteredCourses(courses);
		
		System.out.println("*** Imprime Cursos Filtrados con Lambda mayores a n");
		
		printCoursesFilteredByLength(courses, 6);
		
		
		System.out.println("*** Imprime Squares of Even Numbers");
		
		printEvenNumbersSquares(numbers);
		
		System.out.println("*** Imprime el largo de cada curso");
		
		printCoursesLength(courses);
		
	}



	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		for(int number:numbers) {
			System.out.println(number);
		}
	}


	private static void print(Integer number) {
		System.out.println(number);
	}
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FP01Structured::print);
	}
	
	private static void printAllNumbersInListFunctional2(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListStructure(List<Integer> numbers) {
		for(int number:numbers) {
			if(number%2==0) {
			System.out.println(number);
			}
		}
	}
	
	
	
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(FP01Structured::isEven).forEach(System.out::println);
	}
	
	//Lambda expression
	private static void printEvenNumbersInListLambda(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2==0).forEach(System.out::println);
	}
	
	private static void printOddNumbers(List<Integer>numbers) {
		numbers.stream().filter(number->number%2 !=0).forEach(System.out::println);
	}
	

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}
	
	private static void printFilteredCourses(List<String> courses) {
		courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
	}


	private static void printCoursesFilteredByLength(List<String> courses, Integer n) {
		courses.stream().filter(course->course.length()>= n).forEach(System.out::println);		
	}

	private static void printEvenNumbersSquares(List<Integer> numbers) {
		numbers.stream().filter(number->number%2==0).map(number->number*number).forEach(System.out::println);
	}


	private static void printCoursesLength(List<String> courses) {
		courses.stream().map(course->"El largo del curso " +course +" es: " + course.length()).forEach(System.out::println);
	}

	

}
