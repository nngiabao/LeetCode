package BST;

import java.util.Arrays;

public class MagneticForce_1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        //
        int n = position.length;
        int maxLength = position[n - 1] - position[0];
        //
        int low = 0, high = n - 1;
        int answer = 0;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (check(position,mid,n)) {
                answer = mid;
                low = mid+1;
            } else {
                high = mid - 1; // smaller
            }
        }
        //
        return answer;
    }

    //we have to check with this distance that we can place or not
    //dist = distance we place to ball
    boolean check(int[] position, int dist, int m) {
        int count = 1;
        int last = position[0];//the first ball is here
        for(int i=1;i<position.length;i++){
            if(position[i]-last >= dist){
                count++;
                last = position[i];
                if(count>=m) return true;
            }

        }
        return false;
    }
    //Solution 2:Best
    public int maxDistance2(int[]a,int m) {
        int n=a.length;
        Arrays.sort(a);
        int lo =1;
        int hi = (a[n-1]-a[0])/(m-1);
        int ans =1;
        while(hi>=lo){
            int mid = (hi+lo)/2;
            if(funct(a,mid,m)){
                ans=mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public boolean funct(int a[],int com,int cows){
        int n = a.length;
        int co=1;
        int last = a[0];
        for(int i =0;i<n;i++){
            if(a[i]-last>=com){
                co++;
                last=a[i];
            }
            if(co>=cows){
                return true;
            }
        }
        return false;
    }
}
