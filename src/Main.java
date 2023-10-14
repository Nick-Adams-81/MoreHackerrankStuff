public class Main {

    public static void main(String[] args) {

        CountingValleys countValleys = new CountingValleys();
        System.out.println(countValleys.countingValleys("dududu"));

        ValidParens validParens = new ValidParens();
        System.out.println(validParens.validParens("[]{{"));

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString1("hello"));
        System.out.println(reverseString.reverseString2("world"));

        CountVowels vowels = new CountVowels();
        System.out.println(vowels.countVowels("hello world"));

        RemoveVowels remove = new RemoveVowels();
        System.out.println(remove.removeVowels("hello world"));
    }
}
