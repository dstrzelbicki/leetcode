class Solution {
    public boolean isPalindrome(int x) {
        String converted = Integer.toString(x);
        int length = converted.length();
        char[] charArray = converted.toCharArray();
        String reversedOrder = "";
        char character;
        for (int i = 0; i < length; i++){
            character = charArray[i];
            reversedOrder = character + reversedOrder;
        }
        if (reversedOrder.equals(converted)){
            return true;
        } else {
            return false;
        }
    }
}