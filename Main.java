import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
/*  ----------  Q1 --------------
 1.Write a program to find all of the longest word in a given dictionary.
Example:
{ "cat", "dog", "red", "is", "am" } Expected Output:
"cat", "dog", "red"

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> longestWords = new ArrayList<>();

        words.add("cat");
        words.add("dog");
        words.add("red");
        words.add("is");
        words.add("am");
        int maxLength=0;

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength > maxLength) {
                maxLength = wordLength;
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        System.out.println(longestWords);
*/

/*  ----------  Q2 --------------
2. Write a program that displays the number of occurrences of an element in the array.
Original Array:
[1,1,1,3,3,5]
Sample Output:
3 occurs 2 times
1 occurs 3 times
9 occurs 0 time

       int[] numbers ={1,1,1,3,3,5};
       int[] to_check ={1,3,5};

 int sum=0;
 for (int element : to_check) {
            int count=0;

            for (int num : numbers) {
                if (num == element) {
                    count++;
                }
            }
            System.out.printf("%d occurs %d times \n", element, count);

        }
---------------- Q3 ----------
3.Write a program t
o find the k largest elements in a given array.
 Elements in the array can be in any order.
 [1, 4, 17, 7, 25, 3, 100]
Expected Output:
3 largest elements of the said array are: 100 25 17

        ArrayList <Integer> numbers_arr= new ArrayList<>();
        ArrayList <Integer> newNum_arr= new ArrayList<>();

        numbers_arr.add(1) ;
        numbers_arr.add(4) ;
        numbers_arr.add(17) ;
        numbers_arr.add(25) ;
        numbers_arr.add(3) ;
        numbers_arr.add(100) ;

        int max_value = 0;
        int max_2_value = 0;
        int max_3_value = 0;

        for (int i = 0; i < numbers_arr.size(); i++)
        {
            if (numbers_arr.get(i) > max_value)
            {
                max_value= numbers_arr.get(i);
            }
        }
        for (int i = 0; i < numbers_arr.size(); i++)
        {
            if (numbers_arr.get(i) > max_2_value && max_value != numbers_arr.get(i))
            {
                max_2_value= numbers_arr.get(i);
            }
        }

        for (int i = 0; i < numbers_arr.size(); i++){
            if (numbers_arr.get(i) != max_value && numbers_arr.get(i) != max_2_value &&  numbers_arr.get(i) > max_3_value )
            {
                max_3_value= numbers_arr.get(i);
            }
        }
        newNum_arr.add(max_value);
        newNum_arr.add(max_2_value);
        newNum_arr.add(max_3_value);

        System.out.print("3 largest elements of the said array are: \t");
        System.out.println(newNum_arr);


 ----------  Q4 --------------
 4. Create a method to reverse an array of integers. Implement the method without creating a new array.
 Original Array:
[5,4,3,2,1] Expected Output: Reversed Array:
1 2 3 4 5

 int [] numbers = {5,4,3,2,1};
  int[] newNumbers = new int[numbers.length];

        for (int i = numbers.length-1, j=0; i >= 0 ; j++,i--) {
            newNumbers[j] = numbers[i];
        }

        for (int i = 0; i < newNumbers.length; i++) {
            System.out.print(newNumbers[i]);
        }
--------------- Q5
5. Write a menu driven Java program with following option:
 */
       /* System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Accept elements of the array");
            System.out.println("2. Display elements of the array");
            System.out.println("3. Search an element in the array");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptElements(arr, sc);
                    break;
                case 2:
                    displayElements(arr);
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int value = sc.nextInt();
                    searchElement(arr, value);
                    break;
                case 4:
                    sortArray(arr);
                    displayElements(arr); // Display sorted array
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }*/


/*
        System.out.print("Enter the minimum value of the range: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = sc.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int count = sc.nextInt();

        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < count; i++) {
            int randomNumber = generateRandomNumber(min, max);
            System.out.print(" "+randomNumber);
        }


   
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

         
        int total_Score = checkLength(password)
                + checkSpecial(password)
                + check_Upper_Lower(password);


        if (total_Score >= 8)
        {
            System.out.println("Password is strong.");

        } else if (total_Score >= 5)
        {
            System.out.println("Password is moderately strong.");

        } else
        {
            System.out.println("Password is weak.");
        }
}

    public static int checkLength(String password) {
        int length = password.length();
        if (length >= 8) {
            return 3;
        } else if (length >= 6) {
            return 2;
        } else {
            return 0;
        }
    }


    public static int checkSpecial(String password) {
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return 2;
        } else {
            return 0;
        }
    }

    
    public static int check_Upper_Lower(String password) {
        boolean Upper = false;
        boolean Lower = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                Upper = true;
            } else if (Character.isLowerCase(ch)) {
                Lower = true;
            }

            if (Upper && Lower) {
                return 3;
            }
        }
        return 0;
    }
    */
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);

    }

    public static void generateFibonacci(int terms)
    {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence with " + terms + " terms:");
        for (int i = 1; i <= terms; i++)
        {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static int generateRandomNumber(int min, int max)
    {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static void acceptElements(int[] arr, Scanner sc)
    {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayElements(int[] arr)
    {
        System.out.println("Array elements:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void searchElement(int[] arr, int value)
    {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + value + " found at index " + index);
        } else {
            System.out.println("Element " + value + " not found in the array.");
        }
    }

    public static void sortArray(int[] arr)
    {
        Arrays.sort(arr);

        System.out.println("Array sorted.");
    }
}