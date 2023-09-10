package day09;

/*
哈希函数的特点
1、输入的个数可以是无穷个，但输出的个数一定是有限的
2、每一个输入值，与之对应的输出值只有一个
3、应为输入大于输出个数，所以可能出现，不同输入的输出相同，这种现象称为哈希碰撞，但概率很小
4、哈希函数具有良好的离散性和均匀性，分布均匀，相像的数也可能离得很远
练习一：当要查询的数据量过多时，应为性质4，可以对数据先进行取模处理，变成小数据
练习二：布隆过滤器：a、位图（布隆过滤器实际就是一个大位图）
                  b、公式
                  样本数据M,所有空间M/8,k为哈希函数的个数，p为失误率
练习三：一致性哈希

 */
public class Hash {
    public static void main(String[] args) {

        //位图：就是bite类型的数组，每一位存储一个信息
        {
            //一个int类型的数有四个字节，32bite

            int a = 0;

            //arr=10*32=320;
            int[] arr = new int[10];

            //像取得第178位的状态
            int i = 178;

            int numIndex = 178 / 32;
            int biteIndex = 178 % 32;

            //拿到178位的状态
            int s = (arr[numIndex] >> biteIndex & 1);

            //将178位的状态改成1
            arr[numIndex] = arr[numIndex] | (1 << biteIndex);

            //将178位的状态改成0

            arr[numIndex] = arr[numIndex] & (~(1 << biteIndex));
        }

    }
}
