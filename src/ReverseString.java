public class ReverseString {

    public String reverseString1(String str) {
        StringBuilder returnStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            returnStr.insert(0, str.charAt(i));
        }
        return returnStr.toString();
    }

    public String revString(String str) {
        String result = "";
        for(char c : str.toCharArray()) {
            result = c + result;
        }
        return result;
    }

    public String reverseString2(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
