class Solution {
    public int reverseBits(int n) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            str.append(n % 2);
            n = n / 2;
        }

         int decimalNumber = Integer.parseUnsignedInt(str.toString(), 2);
         return decimalNumber;
      
    }
}