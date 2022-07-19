class Solution {
  public void moveZeroes(int[] nums) {
     
      int n= nums.length;
      int zStart = n;
      for(int i =0; i < zStart;){
          if(nums[i] == 0){
              swap(nums, i,--zStart);
          }else{
              i++;
          }            
      }
  }
  
  private void swap(int[] nums, int a, int b){
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
  }
}