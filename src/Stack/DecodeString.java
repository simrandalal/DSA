
class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack= new Stack<>(); // it maintain numbers from the expression
        Stack<StringBuilder> stringStack= new Stack<>(); // it maintain result of the expression
        StringBuilder currentString=new StringBuilder(); // current string result store
        int num=0; // fetch num from the expression
        for(char singleChar: s.toCharArray()){
            if(Character.isDigit(singleChar)){
                // convert char into int
                num=num * 10 + (singleChar-'0');
            }
            else if(singleChar=='['){
                    countStack.push(num);
                    stringStack.push(currentString);
                    num=0;
                    currentString=new StringBuilder();
            }
            else if(singleChar==']'){
                    int repeat=countStack.pop();
                    StringBuilder temp= stringStack.pop();
                    for(int i=1;i<=repeat;i++){
                        temp.append(currentString);
                    }
                    currentString= temp;
            }
            else{
                currentString.append(singleChar);
            }
            
        }
        return currentString.toString();
    }
}
