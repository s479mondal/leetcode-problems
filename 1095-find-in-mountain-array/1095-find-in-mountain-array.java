class Solution {

        public int ass(MountainArray arr, int l, int r, int t) {

                while (l <= r) {

                            int m = l + (r - l) / 2;

                                        if (arr.get(m) == t)
                                                        return m;

                                                                    if (arr.get(m) > t)
                                                                                    r = m - 1;
                                                                                                else
                                                                                                                l = m + 1;
                                                                                                                        }

                                                                                                                                return -1;
                                                                                                                                    }

                                                                                                                                        public int dss(MountainArray arr, int l, int r, int t) {

                                                                                                                                                while (l <= r) {

                                                                                                                                                            int m = l + (r - l) / 2;

                                                                                                                                                                        if (arr.get(m) == t)
                                                                                                                                                                                        return m;

                                                                                                                                                                                                    if (arr.get(m) > t)
                                                                                                                                                                                                                    l = m + 1;   // reverse logic
                                                                                                                                                                                                                                else
                                                                                                                                                                                                                                                r = m - 1;
                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                return -1;
                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                        public int findInMountainArray(int target, MountainArray mountainArr) {

                                                                                                                                                                                                                                                                                int l = 0;
                                                                                                                                                                                                                                                                                        int r = mountainArr.length() - 1;

                                                                                                                                                                                                                                                                                                // find peak
                                                                                                                                                                                                                                                                                                        while (l < r) {

                                                                                                                                                                                                                                                                                                                    int m = l + (r - l) / 2;

                                                                                                                                                                                                                                                                                                                                if (mountainArr.get(m) > mountainArr.get(m + 1))
                                                                                                                                                                                                                                                                                                                                                r = m;
                                                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                                                                            l = m + 1;
                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                            int p = l;

                                                                                                                                                                                                                                                                                                                                                                                                    int left = ass(mountainArr, 0, p, target);
                                                                                                                                                                                                                                                                                                                                                                                                            if (left != -1)
                                                                                                                                                                                                                                                                                                                                                                                                                        return left;

                                                                                                                                                                                                                                                                                                                                                                                                                                return dss(mountainArr, p + 1, mountainArr.length() - 1, target);
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }

