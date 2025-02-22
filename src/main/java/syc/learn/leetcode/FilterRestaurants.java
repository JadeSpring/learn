package syc.learn.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRestaurants {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        return Arrays.stream(restaurants)
                .filter(x -> (veganFriendly == 0 || x[2] == 1) && x[3] <= maxPrice &&  x[4] <= maxDistance)
                .sorted((x, y) -> y[1] == x[1] ? y[0] - x[0] : y[1] - x[1])
                .map(x -> x[0])
                .collect(Collectors.toList());
    }
}
