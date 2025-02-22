package syc.learn.leetcode;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author syc
 * @date 2023/10/10
 */
public class _1010_MovementOfRobots {

    public int sumDistance(int[] nums, String s, int d) {
        char[] chars = s.toCharArray();
        boolean[] cmd = new boolean[chars.length];
        for (int i = 0; i < chars.length; i++) {
            cmd[i] = Objects.equals('R', chars[i]);
        }

        int[] nextNums = new int[nums.length];

        for (int i = 0; i < d; i++) {
            System.out.println("第" + i + "秒");
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(cmd));
            // 按当前指令走一步
            for (int j = 0; j < nums.length; j++) {
                if (cmd[j]) {
                    if (j < nums.length - 1 && !cmd[j+1]){
                        if (nums[j]+1 == nums[j+1]) {
                            cmd[j] = !cmd[j];
                        } else if (nums[j]+1 == nums[j+1] -1){
                            cmd[j] = !cmd[j];
                            nums[j] += 1;
                        } else {
                            nums[j] += 1;
                        }
                    }
                    nextNums[j] = nums[j] + 1;
                } else {
                    nextNums[j] = nums[j] - 1;
                }
            }
            // 检查是否有碰撞，更新指令
            for (int j = 0; j < nextNums.length; j++) {
                System.out.println(j);
                if ((j < nextNums.length - 1 && (nextNums[j] == nextNums[j + 1] || nums[j] == nextNums[j + 1]))
                        || (j > 0 && (nextNums[j] == nextNums[j - 1] || nums[j] == nextNums[j - 1]))) {
                    cmd[j] = !cmd[j];
                }
            }

            nums = nextNums;
            System.out.println("第" + i + "秒后");
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(cmd));
            System.out.println("============================");
        }


        //计算距离
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                sum += Math.abs(nums[i] - nums[j]);
            }
        }

        return sum % 1000000007;
    }


    public static void main(String[] args) {
        _1010_MovementOfRobots r = new _1010_MovementOfRobots();
        int[] nums = new int[]{-10, -13, 10, 14, 11};
        int rll = r.sumDistance(nums, "LRLLR", 2);
        System.out.println(rll);
    }

}
