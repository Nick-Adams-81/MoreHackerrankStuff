import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {

    public int sockPairs(List<Integer> socks) {
        int pairs = 0;
        Set<Integer> sockPairs = new HashSet<>();
        for (Integer sock : socks) {
            if (!sockPairs.contains(sock)) {
                sockPairs.add(sock);
            } else {
                pairs++;
                sockPairs.remove(sock);
            }
        }
        return pairs;
    }
}
