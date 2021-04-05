package src.W01_ProblemeDeAlgoritmica;

public class Ex2 {

    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int copyM = m;
        for (int i = 0; i < n; i++) {
            nums1[copyM] = nums2[i];
            copyM++;
        }

        for (int i = 0 ; i < (n + m); i++ ) {
            for (int j = 0 ; j < (n + m); j++ ) {
                if(nums1[i] < nums1[j]) {
                    int aux = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = aux;
                }
            }
        }

        for (int i = 0; i < (n + m); i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
