## Programming Exercise 
In order to get you more familiar with Java syntax and testing, there are couple of exercises for you to solve! After you complete the functions, we have provided couple tests for you to test. Although we have provided tests, you are welcomed to write your own too! Writing tests is not only crucial for this class but it is one of the most important skills to have in general. It reinforces our understanding of what specific method is supposed to do and allows us to catch edge cases! You will have more exercises for testing but we want you to get exposed early on.

While completing the assignment, you may need to use different data structures like ArrayList and TreeMap. In order to import these classes, if you hover over wherever you are using the data structures, IntelliJ will give you option to import it or you can do it manually by adding:


```java
import java.util.ArrayList;
import java.util.TreeMap;
```

### ListExercises 
ListExercises.java has 4 different methods for you to complete:

- `sum`: This method takes a list List<Integer> L and returns the total sum of the elements in that list. If the list is empty, it method should return 0.
evens: This method takes a list List<Integer> L and returns a new list containing the even numbers of the given list. If there are no even elements, it should return an empty list.
- `common`: This method takes two lists List<Integer> L1, List<Integer> L2 and returns a new list containing the common item of the two given lists. If there are no common items, it should return an empty list.
- `countOccurrencesOfC`: This method takes a list and a character List<String> words, char c and returns the number of occurrences of the given character in a list of strings. If the character does not occur in any of the words, it should return 0.
For this part, you can import ArrayList.

### MapExercises 
MapExercises.java has 3 different methods for you to complete:

- `letterToNum`: This method returns a map from every lower case letter to the number corresponding to that letter starting with ‘a’ is 1.
- `squares`: This method takes a list List<Integer> nums and returns a map from the integers in the list to their squares. If the given list is empty, it should return an empty map.
- `countWords`: This method takes a list List<String> words and returns a map of the counts of all words that appear in a list of words. If the given list is empty, it should return an empty map.
For this part, you can import TreeMap.

## Deliverables 
`ListExercises.java`
`MapExercises.java`

For this assignment, you need to complete the methods in ListExerises and MapExercises. Make sure you test before you submit it to Gradescope. Although we do not have a submission limit for this specific assignment, in the future it is encouraged to use existing tests and write your own tests to see if your methods work before submitting your code to the autograder.
