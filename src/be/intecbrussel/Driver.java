package be.intecbrussel;
import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;
public class Driver {

    int len = 3;
    int randNumOrigin = 97, randNumBound = 122;

    protected List<Integer> random_num;

    public static String generateRandomLicensePlate(int len, int randNumOrigin, int randNumBound) {
        SecureRandom random = new SecureRandom();
        return random.ints(len, randNumOrigin, randNumBound + 1)
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
    }

    String generateLicensePlate() {

        String licPl = generateRandomLicensePlate(len, randNumOrigin, randNumBound);

        String endLicPl = licPl.toUpperCase() + "-"+random_num;

        System.out.println(endLicPl);
        return endLicPl;
    }

    List<Integer> randomNum_n() {
        System.out.println("repair cost is: " + random_num);

        return random_num;
    }
}


