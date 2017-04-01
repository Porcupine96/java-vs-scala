package C;

import java.util.List;

class CJava {

    /*
    Let's sum all integers from a given list but only those that are divisible by 7.
    In addition to this, assume that the input is provided as a list of Strings.
     */

    int sumDivBy7PreJava8(List<String> numbers) {
        int sum = 0;
        for (String number : numbers) {
            int n = Integer.valueOf(number);
            if (n % 7 == 0) {
                sum += n;
            }
        }
        return sum;
    }

    int sumDiv7Java8(List<String> numbers) {
        return numbers
                .stream()
                .mapToInt(Integer::valueOf)
                .filter(n -> n % 7 == 0)
                .sum();
    }

}
