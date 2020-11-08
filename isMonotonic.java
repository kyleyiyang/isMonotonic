class Solution {
    public boolean isMonotonic(int[] A) {
        List<Integer> ans = new ArrayList<>();
        for (int a=0;a<A.length;a++) {
            while (a<A.length-1 && A[a]==A[a+1]) {
                a++;
            }
            ans.add(A[a]);
        }
        System.out.println(ans);
        for (int i=0;i<ans.size()-2;i++) {
            if (comparison(ans.get(i),ans.get(i+1))!=comparison(ans.get(i+1),ans.get(i+2))) {
                return false;
            }
        }
        return true;
    }
    public boolean comparison(int a, int b) {
        if (a>b) {
            return true;
        } else {
            return false;
        }
    }
}
