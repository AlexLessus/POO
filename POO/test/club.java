public class club {
   public static void main(String args[]) {
      int[] nums = {3,2,2,3}; // Input array
      int val = 3; // Value to remove
      int[] expectedNums = {2,2,3,3}; // The expected answer with correct length.
                                  // It is sorted with no values equaling val.
      removeElement(nums, val); // Calls your implementation
      
      
   }

   public static void removeElement(int[] nums, int val) {
      int x = nums.length-1, c=0;
      String res = "";
      for(int i = 0; i<nums.length; i++){
         if(nums[i] == val) {
            c++;
            nums[i] = -1;
         }
      }
      
      
      
      res+= "conc: " + Integer.toString(c) + "\n Nums[]: {";
      for(int i = 0; i<nums.length; i++) {
         if(nums[i] != -1){
            res += Integer.toString(nums[i]) + ",";
         }
      }
      System.out.print(res);
   }   
}