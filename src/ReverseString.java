public class ReverseString {

    public String reverseString1(String str) {
        StringBuilder returnStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            returnStr.insert(0, str.charAt(i));
        }
        return returnStr.toString().toString();
    }
}
