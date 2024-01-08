class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;

        while(start<end)
        {
            int area=Math.min(height[start],height[end])*(end-start);//height*width
            if(area>maxArea)
            maxArea=area;

            //if(Math.min(height[start],height[end])==height[start]). or
            if(height[start]<height[end])
            start++;
            else
            end--;
        }
        return maxArea;
    }
}
