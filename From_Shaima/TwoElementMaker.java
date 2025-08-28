import java.util.Arrays;
public class TwoElementMaker {
    public static int[] makeTwoElement(int[] a, int[] b) {
        if (a.length >= 2){ // check array 'a' length must be at least 2
            return new int[]{a[0],a[1]}; // create and return  a new array has the first 2 element from array 'a'
        }
        else if (a.length ==1 && b.length >0){ // if array 'a' length is 1 and array 'b' is not empty
            return new int[]{ a[0],b[0]} ; // create and return a new array has the first element from array 'a' and 'b'
        }
        else if (b.length >=2){ // if array 'a' is empty and array 'b' length at least is 2
            return new int[]{b[0],b[1]}; // create and return  a new array has the first 2 element from array 'b'
        }
        return new int[] {}; // if both arrays are empty , create and return an empty array
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(makeTwoElement(new int[]{4},new int[]{1,2,3})));
    }
}
