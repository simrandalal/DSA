class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray()){
            vowels[c] = true;
        }

        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i < j){
            while(i < j && !vowels[ch[i]]){
                ++i;
            }

            while(i < j && !vowels[ch[j]]){
                --j;
            }
            
            if(i < j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}
