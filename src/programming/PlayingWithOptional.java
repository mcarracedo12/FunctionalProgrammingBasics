package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Banana", "Mango", "Mmmm");

		Predicate<? super String> predicate = fruit -> fruit.startsWith("M");

		Optional<String> optional = fruits.stream().filter(predicate).findFirst();

		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		
		System.out.println(optional.get());

		
		Optional <String> fruit = Optional.of("banana"); 
		Optional<String> empty = Optional.empty();
		
		
		System.out.println(fruit);
		System.out.println(empty);
	}

}
