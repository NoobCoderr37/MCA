package Statistics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
public static double mean(double[] A) {
double sum = 0;
for (double b : A) {
sum += b;
}
return sum / A.length;
}
public static double median(double[] A) {
    Arrays.sort(A);
    int middle = A.length / 2;
    if (A.length % 2 == 0) {
        return (A[middle - 1] + A[middle]) / 2.0;
    } else {
        return A[middle];
    }
}

public static double mode(double[] A) {
    Map<Double, Integer> map = new HashMap<>();
    for (double a : A) {
        if (map.containsKey(a)) {
            map.put(a, map.get(a) + 1);
        } else {
            map.put(a, 1);
        }
    }
    double mode = 0;
    int maxCount = 0;
    for (Map.Entry<Double, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
            mode = entry.getKey();
            maxCount = entry.getValue();
        }
    }
    return mode;
}
}