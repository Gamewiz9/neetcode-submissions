class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> list = new HashSet<>();

        for (int num : nums){
            if (list.contains(num)){
                return true;
            } else {
                list.add(num);
            }
        }
        return false;
    }
}