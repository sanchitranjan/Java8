/* Q -> Use String Joiner
 * 
	Input - Hello how are you
	Output - [Hello-how-are-you]
*/

package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerClass {
	public static void main(String[] args) {
		
		String input = "Hello how are you";
		String inputArray[] = input.split(" ");
		List<String> inputArr = Arrays.asList(inputArray);
		
		StringJoiner joiner = new StringJoiner("-", "[", "]");
		for (String ele : inputArr) {
			joiner.add(ele);
		}
		
		// String output =  inputArr.stream().collect(Collectors.joining("-"));
		
		System.out.println(joiner.toString());
	}
}
