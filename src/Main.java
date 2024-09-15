//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    //Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while flooring division (Math.floor(n/10)) by 10 removes the rightmost digit [Math.floor(126 / 10) is 12].
    //solution
    public static int sumDigits1(int n){
        if(n <= 1) return n;
        return sumDigits1((int) Math.floor(n/10)) +(n%10);
    }

    //Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while flooring division (Math.floor(n/10)) by 10 removes the rightmost digit [Math.floor(126 / 10) is 12].
    //solution
    public static int count7(int n){
        int count = 0;
        if(n == 0) return 0;
        if(n % 10 == 7){
            count = 1;
        }
        return count + count7((int) Math.floor(n/10));
    }

    //Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while flooring division (Math.floor(n/10)) by 10 removes the rightmost digit [Math.floor(126 / 10) is 12].
    //solution
    public static int count8(int n){
        int count = 0;
        if(n == 0) return 0;

        if(n % 10 == 8){
            count = 1;
        }

        if(n % 10 == 8 && Math.floor(n/10) % 10 == 8){
            count = 2;
        }

        return count + count8((int) Math.floor(n/10));
    }

    //Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    //solution
    public static int countX(String str){
        int count = 0;
        if(str.isEmpty()) return 0;
        if(str.charAt(0) == 'x') {
            count = 1;
        }
        return count + countX(str.substring(1));
    }

    //Given a string, compute recursively a new string where all the 'x' chars have been removed.
    //solution
    public static String noX(String str){
        if(str.length() == 0) return str;
        if(str.charAt(0) == 'x'){
            return noX(str.substring(1));
        } return str.charAt(0) + noX(str.substring(1));
    }

    //Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    //solution
    public static boolean array6(int[] nums, int i){
        if (nums.length == 0) {
            if (nums[0] == 6) {
                return true;
            }
            return array6(nums, i+1);
        }

        return false;
    }

//Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    //solution
    public static int array11(int[]nums, int i){
        int count = 0;
        if(nums.length == 0) return 0;
        if(nums[0] == 11) count = 1;
        return count + array11(nums, i+1);
    }

    //Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    //solution
    public static boolean array220(int[] nums, int i){
        if(nums.length == 0) return false;
        if(nums[1] == nums[0] * 10) return true;
        return array220(nums, i+1);
    }

    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
    //solution
    public static String allStar(String str){
        if(str.length()<=1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    //Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*"
    //solution
    public static String pairStar(String str){
        if(str.isEmpty()) return str;
        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0)+ pairStar(str.substring(1));
    }
}