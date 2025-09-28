package String;

import java.util.*;

public class SubdomainVisitCount_811 {
    public static void main(String[] args) {
        SubdomainVisitCount_811 a = new SubdomainVisitCount_811();
        String[] t = {"9001 discuss.leetcode.com"};
        a.subdomainVisits(t);
    }

    //
    public List<String> subdomainVisits(String[] cpdomains) {
        //
        HashMap<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] domains = domain.split(" ");
            String subdomains = domains[1];
            int count = Integer.parseInt(domains[0]);
            //count sub domain
            String[] subdomain = subdomains.split("\\.");
            //2 format
            if (subdomain.length == 3) {
                String temp = subdomain[1] + "." + subdomain[2];
                map.put(temp, map.getOrDefault(temp, 0) + count);
            }
            //for nomal format d1.d2
            map.put(subdomains, map.getOrDefault(subdomains, 0) + count);
            //the root
            String d3 = subdomain[subdomain.length - 1];
            map.put(d3, map.getOrDefault(d3, 0) + count);
        }
        //build the domain
        List<String> res = new ArrayList<>();
        //
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.add(entry.getValue() + " " + entry.getKey());
        }
        //
        return res;
    }
}
