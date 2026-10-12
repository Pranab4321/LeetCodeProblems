class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while(i<chars.length){
            char ch = chars[i]; 
            int count = 0;
            while(i<chars.length && chars[i] == ch){
                count++;
                i++;
            }

            chars[write] = ch;
            write++;

            if(count>1){
                String num = String.valueOf(count);
                for(int j=0;j<num.length(); j++){
                    chars[write] = num.charAt(j);
                    write++;
                }
            }


        }

        return write;
        
    }
}