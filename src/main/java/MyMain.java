import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i=0; i<list.size(); i++){
            if ((list.get(i)+100)%2 == 1){
                count += 1;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        // REPLACE WITH YOUR CODE
        boolean ifDuplicate = false;
        for (int i=0; i<list1.size(); i++){
            for (int y=0; y<list2.size(); y++){
                if(list1.get(i)==list2.get(y)){
                    ifDuplicate = true;
                }
            }
        }
        return ifDuplicate;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        // create array list
        ArrayList<Integer> newList = new ArrayList<Integer>();
        // set values equal to one another
        for (int i=1; i <= arr.length; i++){
            newList.add(i);
        }
        return newList;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        
        //make some array lists
        ArrayList<Integer> testList1 = new ArrayList<Integer>();
        ArrayList<Integer> testList2 = new ArrayList<Integer>();

        // add values
        testList1.add(1);
        testList1.add(6);
        testList1.add(9);
        
        testList2.add(8);
        testList2.add(7);
        testList2.add(2);

        // test methods
        System.out.println(checkDuplicates(testList1, testList2));
        System.out.println(countOdd(testList1));

        // test converttoarraylist and create int[]
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        convertToArrayList(intArray);
        
    }
}
