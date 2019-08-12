public class searchInsert{
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = 0;
        int mid = 0;
        while(left < right){
            mid = (left + right)>>>1;
            if(nums[mid] < target){
                left = mid+1;
            }
            else if (nums[mid] > target){
                right = mid-1;
            }
            else {
                index = mid;
                break;
            }
        }
        return left == right? left:index;
    }
}
