import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i = 0; i < a.length(); i++) {
            char tmp = a.charAt(i);
            
            if('a' <= tmp && tmp <= 'z') {
                result += (tmp + "").toUpperCase();
            }
            else {
                result += (tmp + "").toLowerCase();
            }
        }
        
        System.out.print(result);
    }
}