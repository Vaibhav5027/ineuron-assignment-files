package in.ineuron;

/*Stream APi is a type of collections in java, 
where we use it primarily to operate data , 
without disrupting entire data.. Like you'll 
collect your data by using one of collections 
method like lambda expression,filter, map , hash set first, then manipulate the data in your way .. so that only particular collection will get manipulated.

*/

import java.util.Arrays;
import java.util.List;
public class StreamApi {
	

	
	    public static void main(String[] args) {
	        // Create a list of friends
	        List<String> friends = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

	        // Filter friends whose names start with 'A'
	        friends.stream()
	            .filter(name -> name.startsWith("A"))
	            .forEach(System.out::println);

	        // Map friends' names to uppercase
	        friends.stream()
	            .map(String::toUpperCase)
	            .forEach(System.out::println);

	        // Count the number of friends
	        long count = friends.stream().count();
	        System.out.println("Number of friends: " + count);
	    }
	}

