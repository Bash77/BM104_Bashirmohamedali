package Helloe;
import java.util.*;
public class hafta9 {
public static boolean validParantheses(String str) {
Stack<Character> s = new Stack<Character>();

for(char x:str.toCharArray()) {
if (x =='{' || x == '[' || x == '(')
{s.push(x);
}
else if (!s.isEmpty() && (x ==']' && s.peek() == '['|| s.peek() == ')' && s.peek() ==  '(' ||s.peek() == '}'&& s.peek() == '{')) {
s.pop();
}
else {
return false; 
}
}
return s.isEmpty();
}}