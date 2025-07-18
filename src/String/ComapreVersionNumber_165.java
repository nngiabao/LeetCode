package String;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ComapreVersionNumber_165 {
    //Solution 1:
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n1 = version1.length(), n2 = version2.length();

        while (i < n1 || j < n2) {
            int ver1 = 0, ver2 = 0;

            // Parse the next revision from version1
            while (i < n1 && version1.charAt(i) != '.') {
                ver1 = ver1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            // Parse the next revision from version2
            while (j < n2 && version2.charAt(j) != '.') {
                ver2 = ver2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            // Compare the two revisions
            if (ver1 < ver2) return -1;
            if (ver1 > ver2) return 1;

            // Skip the dot
            i++;
            j++;
        }

        return 0;
    }

    //Solution 2:put every number in a cage to comapare
    public int compareVersion2(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }

        return 0;
    }
}
