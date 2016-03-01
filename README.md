# java-practice
Place for java exercises

exercises:
```java
make a stack with java:
import java.util.Arrays;

public class stack {
	public static void main(String [] args){

	// give it a data store
	int[] dataStore = { 1,2,3,4,5,6,7,8,9,10 };
	// way to print what the datastore is
	System.out.println(Arrays.toString(dataStore));

	// make a setter method
	public static int addToStack(itemToAdd){
		dataStore[0] = itemToAdd;
	}

	// make a getter method
	public static int getTopItem(){
		dataStore[0] = itemToAdd;
		return dataStore[0 - 1];
	}
	}
}



```
