class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
		// 1st Part 
		// Calculate the total area.
        int alength = Math.abs(ax1 - ax2);
        int awidth = Math.abs(ay1 - ay2);

        int blength = Math.abs(bx1 - bx2);
        int bwidth = Math.abs(by1 - by2);
        
        int total = (awidth * alength) + (bwidth * blength);
        
		// 2nd Part 
		// Check all the boundary condition when they don't overlap if any condition is true return the totalArea.
        if(by2 <= ay1 || ay2 <= by1 || bx2 <= ax1 || ax2 <= bx1){   
            
            return total;
        } 
        
		// 3rd Part
		// When they overlap find the extra rectangle coordinates ex1, ex2, ey1 and ey2.
        int ex1 = Math.max(ax1, bx1);
        int ex2 = Math.min(ax2, bx2);
        
        int ey1 = Math.max(ay1, by1);
        int ey2 = Math.min(ay2, by2);
        
		// Calculate width and length of extra rectangle.
        int ewidth = Math.abs(ex1 - ex2);
        int elength = Math.abs(ey1 - ey2);
        
		// Calculate the area of extra rectangle
        int extra = ewidth * elength;
        
		// Remove the extra area from totalArea and return it.
        return total - extra;
        
    }
}
