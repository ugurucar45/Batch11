// Copyright 2020 Techtorial LLC
package practiceMyself.WeeklyProject6;

public class Main {

    /*
     * Write a method that will accept an array as parameter
     * and return maximum value from array.
     * <p>
     * for example:
     * {3,9,55,73,99,2,10} -> return 99
     *
     * @param arrays of numbers
     * @return maximum value from array
     */
    public int maxNum(int[] arrays) {//{-1,-2,-3}
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > res) {
                res = arrays[i];
            }
            if (arrays.length == 1) {
                res = arrays[0];
            }
        }
//        Arrays.sort(arrays);
//
//        return arrays[arrays.length - 1];
        return res;
    }

    /*
     * Write a method that received an integer array and returns the sum of all
     * odd numbers in the array
     *
     * @param array
     * @return sum of odd numbers in the array
     */
    public int sumOfOdds(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if ((-1 * array[i]) % 2 == 1) {
                    sum += (array[i]);
                }
            }
            if (array[i] % 2 == 1) {
                sum += (array[i]);
            }
        }
        return sum;
    }

    /*
     * Write a method that takes an array of integers and returns a boolean. You
     * method should return true if array contains three consecutive even number
     * or three consecutive odd numbers. Return false otherwise.
     * threeAmigos([2, 1, 3, 5]) -> true
     * threeAmigos([2, 1, 2, 5]) -> false
     * threeAmigos([2, 4, 2, 5]) -> true
     */

    public boolean threeAmigos(int[] array) {
        boolean res = false;
        for (int i = 0; array.length-2 > i; i++) {
            if (array[i] % 2 == 1&&array[i+1] % 2 == 1&&array[i+2] % 2 == 1||
                    array[i] % 2 == 0 && array[i+1] % 2 == 0 &&array[i+2] % 2 == 0) {
                res = true;
                break;
            }
        }
        return res;
    }


    /*
     * Write a method that takes an array of ints and returns a boolean.
     * Return true if that array contains two numbers anywhere in the array
     * whose sum is 100
     *
     * @param nums
     * @return boolean
     */
    public boolean make100With2(int[] nums) {
        int sum = 0;
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 100) {
                    res = true;
                }
            }
        }
        return res;
    }


    /*
     * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values,
     * then switch the order of the next two, switch the order of the next two, and so on.
     * <p>
     * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
     * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
     * <p>
     * Method that is using String[]
     *
     * @param Array
     * @return switched pairs array
     */
    public String[] switchPairs(String[] list) {
        String one = "", two = "";
        for (int i = 0, j = 1; j < list.length; i++, j++, i++, j++) {
            one = list[i];
            two = list[j];
            list[i] = two;
            list[j] = one;
        }


        return list;
    }

    /*
     * @param array of book pages
     * @return page that is out of order; if all pages in the order return -1;
     * <p>
     * For example you given an array
     * int[]pages={20,100,55,78,44,90}; -> method will return 55
     * int[]pages2={20,21,22,78,44,90};-> method will return 44
     * int[]pages3={20,21,22,78,84,90};-> method will return -1
     */
    public int outOfOrder(int[] arr) {
        int a = 0;
        for (int i = 0, j = 1; j < arr.length; i++, j++) {
            if (arr[j] > arr[i]) {
                a = -1;

            } else {
                a = arr[j];
                break;
            }
        }
        return a;
    }

    /*
     * Write a method that takes an array of integers and returns a boolean.
     * Return true if the array contains 1 and 2 later somewhere in the array,
     * and 1 has to come before 2.
     * <p>
     * contains12([1, 3, 2]) -> true
     * contains12([3, 1, 2]) -> true
     * contains12([3, 1, 4, 5, 2]) -> true
     * contains12([3, 2, 4, 5, 1]) -> false
     *
     * @param nums
     * @return boolean
     */

    public boolean contains12(int[] nums) {
        boolean a = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        a = true;
                    }
                }
            }
        }
        return a;
    }

    /*
     * Write a method that will accept array of integers as parameter
     * and will return one long number of combined numbers.
     * If the number is negative accept it as positive
     * <p>
     * For example:
     * {2,66,3,90,1,-10} -> return int 266390110
     * {0,34,5,3,8} -> return int 34538
     *
     * @param array of numbers
     * @return combined numbers of array
     */
    public long combineNumbers(int[] numbers) {//use remainder try again
        int res = 0;        //266390110
        for (int i = 0; i < numbers.length; i++) {//{2,66,3,90,1,-10}
            if (numbers[i] < 0) {
                numbers[i] = numbers[i] * -1;
            }
            if (numbers[i] > 9 && numbers[i] < 100) {
                res *= 10;//20
            }
            if (numbers[i] > 99 && numbers[i] < 1000) {
                res *= 100;
            }

            res = res * 10 + numbers[i];     //266*10+3=2663
        }
        return res;
    }

    /*
     * Write a method that will accept one array as parameter and will remove duplicates
     * and return will have unique numbers inside
     * <p>
     * for example:
     * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
     * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
     *
     * @param array of numbers
     * @return array of unique numbers
     */
    public int[] removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] != Integer.MAX_VALUE) {
                    count++;
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        int[] den = new int[nums.length - count];
        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MAX_VALUE) {
            } else {
                den[k] = nums[i];
                k++;
            }
        }
        return den;
    }

}
