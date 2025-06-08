package Array;

public class DistributeCandies_1103 {
    public static void main(String[] args) {
        new DistributeCandies_1103().distributeCandies(7,4);

    }
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int candy = 1;
        while(candies > 0){
            if(candies > candy) result[(candy-1)%num_people] += candy;
            else{
                result[(candy-1)%num_people] += candies;
                return result;
            }
            candies -= candy;
            candy++;
        }
        return result;
    }
}
