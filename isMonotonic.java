class Solution {
    public boolean isMonotonic(int[] A) {
        for (int i=0;i<A.length-2;i++) {
            i=rec(A,i);
            int j=rec(A,i+1);
            int k=rec(A,j+1);
            if (k<A.length && comparison(A[i],A[j])!=comparison(A[j],A[k])) {
                return false;
            }
            i=j-1;
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
    public static int rec(int[] A, int i) {
        while (i<A.length-1 && A[i]==A[i+1]) {
            i++;
        }
        return i;
    }
}
