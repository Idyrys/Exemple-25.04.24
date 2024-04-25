import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       String s = "madam";
        LinkedList<Character> list = new LinkedList<>();
        for(char item: s.toCharArray() ){
            list.add(item);
        }
        System.out.println(list);

        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if (listIterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(-3);
        list1.add(8);
        list1.add(12);
        list1.add(-8);
        list1.add(0);
        list1.add(5);
        list1.add(10);
        list1.add(1);
        list1.add(150);
        list1.add(-30);
        list1.add(19);
        Collections.sort(list1);
        System.out.println(list1);
        int index = Collections.binarySearch(list1,12);
        System.out.println(index);
    }
}