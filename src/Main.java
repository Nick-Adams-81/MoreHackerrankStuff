import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        PrimeNumbers primes = new PrimeNumbers();
        System.out.println(primes.primeNumbers(50));

        Palindrome isPalindrome = new Palindrome();
        System.out.println(isPalindrome.isPalindrome("daddy"));

        SockMerchant sockMerchant = new SockMerchant();
        List<Integer> socks = new ArrayList<>();
        socks.add(1);
        socks.add(1);
        socks.add(1);
        socks.add(2);
        socks.add(2);
        socks.add(3);
        socks.add(3);

        System.out.println(sockMerchant.sockPairs(socks));

        TwoSum twoSum = new TwoSum();
        int[] numsArr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum1(numsArr, 9)));
        System.out.println(Arrays.toString(twoSum.twoSum2(numsArr, 18)));

//        JumpOnClouds cloudJumper = new JumpOnClouds();
//        int[] clouds = {};

        ContainerWithMostWater water = new ContainerWithMostWater();
        int[] rainWater = {1, 8, 6, 2, 5,4, 8, 3, 7};
        System.out.println(water.mostWater(rainWater));
    }
}
