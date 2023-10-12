public class CountingValleys {

    public int countingValleys(String str) {
        int count = 0;
        int elevation = 0;
        for(char c : str.toCharArray()) {
            if(c == 'u') {
                if(elevation == -1) {
                    count++;
                }
                elevation++;
            }
            if(c == 'd') {
                elevation--;
            }
        }

        return count;
    }
}
