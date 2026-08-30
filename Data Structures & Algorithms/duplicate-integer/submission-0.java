class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int no : nums){
            if (list.contains(no)){
                return true;
            } else {
                list.add(no);
            }
        }

        return false;
    }
}