/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int binaryA(int t,MountainArray mountainArr, int low, int high)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)==t)
            {
                return mid;
            }
            if(mountainArr.get(mid)>t)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public int binaryD(int t,MountainArray mountainArr, int low, int high)
    {
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(mountainArr.get(mid)==t)
            {
                return mid;
            }
            if(mountainArr.get(mid)>t)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low=0;
        int high=mountainArr.length()-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        int p=low;
        int ass=binaryA(target,mountainArr,0,p);
        if(ass!=-1)
        {
            return ass;
        }
        int dss=binaryD(target,mountainArr,p+1,mountainArr.length()-1);
        if(dss!=-1)
        {
            return dss;
        }
        return -1;
    }
}