import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100); 
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (i > 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
                total = total + 4;
                i = i - 1;
            } else if (i > 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
                total = total + 9;
                i = i - 1;
            }else if(i > 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X'){
                total = total + 40;
                i = i - 1;
            }else if(i > 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X'){
                total = total + 90;
                i = i - 1;
            }else if(i > 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C'){
                total = total + 400;
                i = i - 1;
            }else if(i > 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C'){
                total = total + 900;
                i = i - 1;
            }
            
            else {
                total += map.get(s.charAt(i));
            }
        }

        return total;

        

        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Roman Number in caps");
        String roman = in.nextLine();
        Solution sol = new Solution();
        System.out.println(sol.romanToInt(roman));
        in.close();
        
    }
}