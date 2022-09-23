    public static int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> maps = new HashMap<>();

        int sum = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] ){
                    count++;

                }
            }

            maps.put(  nums[i],count);
            count= 0;
//            sum+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(!(maps.get(nums[i])>1)){
                sum+=nums[i];
            }
        }

        return sum;
    }
