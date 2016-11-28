package text.bwei.com.javademo4.three;

/**
 * 1.version:
 * 2.date:2016/11/28 15:54
 * 3.update:2016/11/28.
 * 4.autour:张玉杰
 */
public class Three {

    //二分查找法
    /*public static void main(String[] args) {
        int[] a = {2, 4, 6, 9};
        int key = 2;
        BinarySearchM(a, key);
        System.out.println("The key is in " + BinarySearchM(a, key));
    }

    public static int BinarySearchM(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            System.out.println(mid);
            if (key < list[mid])//mid 改为 list[mid]
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }*/

    /*public static int binarySearch(Integer[] srcArray, int des) {
        int low = 0;
        int high = srcArray.length - 1;

        while ((low <= high) && (low <= srcArray.length - 1)
                && (high <= srcArray.length - 1)) {
            int middle = (high + low) >> 1;
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }*/


    /*倒三角******************************************************************/

    /*public static void main(String[] args) {
        int i, j;
        for (i = 9; i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }*/

    /*乘法表**************************************************************************/
    /*public static void main(String[] args) {

        int q, w;
        for (q = 1; q <= 9; q++) {
            for (w = 1; w <= q; w++) {
                System.out.print(w + "*" + q + "=" + w * q + " ");
            }
            System.out.print("\n");
        }

    }*/
//选择运算符************************************************************
    /*public static void main(String[] args) {
        int k = 10;
        int y = 20;
        //以下要有值返回
        int i = (k > y) ? 300 : 200;
        //if else 不一定要有值出现
        if (k > y) {
            System.out.println(100);
        } else {
            System.out.println(200);
        }
        System.out.println("i=" + i);
    }*/


    /*冒泡排序，最大值*************************************************************/
    /*public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2, 8, 9, 0, 10};
        //length属性表示为数组的长度
        System.out.println("数组的长度为：" + arr.length);
        System.out.println("第一个元素为：" + arr[0]);
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("第"+i+"个元素为："+arr[i]);
        }
        //通过比较得到数组中的最大值
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("最大值为：" + temp);
        //通过角标得到最大值的下标
        int temp1 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[temp1]) {
                temp1 = i;
            }
        }
        System.out.println("最大值为：" + arr[temp1]);
        //冒泡算法，对数据进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = 0; y < arr.length - 1 - i; y++) {
                if (arr[y] < arr[y + 1]) {
                    int temp2 = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp2;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个元素为：" + arr[i]);
        }
    }*/

    //封装************************************************************
    /*public static void main(String[] args) {
        A a = new A();
        a.setName("张玉杰");
        a.setAge("22");
        a.setSex("男");
        a.setAddress("北京市海淀区上地七街软件园南站北京八维学院");
        String str = a.toString();
        System.out.println(str);
    }*/

    //九九乘法表************************************************************
    /*public static void main(String[] args) {
        int x, y;
        for (x = 1; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.println(x + "*" + y + "=" + x * y + "");
            }
            System.out.println("\n");
        }
    }*/

    //switch************************************************************
    /*public static void main(String[] args) {
        System.out.println("输入1给你讲一个笑话 \n 输入2给你讲一个鬼故事 \n 输入3告诉你一个秘密 \n 请输入");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        switch (t) {
            case 1:
                System.out.println("想听笑话自己上网看去");
                break;
            case 2:
                System.out.println("想听鬼故事自己上网看去");
                break;
            case 3:
                System.out.println("知道我秘密的人都已经死了");
                break;
        }
    }*/


    //双层数组************************************************************
    /*public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 6}, {9, 10, 2, 4}, {13, 12, 15, 8}, {0, 7, 11, 14}};

        for (int i = 0; i < 4; i++) {
            for (int c = 0; c < 4; c++) {
                for (int y = 0; y < 4; y++) {
                    for (int j = 0; j < 4; j++) {
                        if (a[i][c] < a[y][j]) {
                            int temp = a[i][c];
                            a[i][c] = a[y][j];
                            a[y][j] = temp;
                        }

                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("第" + a[i][j]);
            }
        }
    }*/

    //输入圆的半径直径得面积周长************************************************************
   /* public static double PAI = 3.14;//定义一个静态常量

    public static void main(String[] args)//定义一个主方法入口
    {
        while (true)//定义一个循环
        {
            System.out.println("请输入圆的半径");//输入半径的值
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();//接收半径的值
            System.out.println("请输入圆的直径");//输入直径的值
            Scanner sx = new Scanner(System.in);
            int b = sx.nextInt();//接收直径的值
            //静态
            AreaDome1.area(c, PAI);//调用静态方法
            AreaDome1.area(c, b, PAI);//调用静态方法
            //重载
            AreaDome a = new AreaDome();//使用new 创建一个空间
            a.AreaDomess(c, PAI);//调用方法
            a.AreaDomess(c, b, PAI);//调用方法

            System.out.println("是否继续：1/0");//判断是否继续
            Scanner sa = new Scanner(System.in);
            int r = sa.nextInt();
            if (r == 0) {
                break;//用于退出循环
            }
        }
    }
}

class AreaDome //创建一个类
{
    public void AreaDomess(int aRadius, double PAI)//创建一个方法
    {
        System.out.println("圆的面积=" + ((aRadius * aRadius) * PAI));//计算并输出
    }

    public void AreaDomess(int aRadius, int aDiameter, double PAI)//创建一个方法
    {
        System.out.println("圆的周长=" + (aRadius * 2 * PAI));//计算并输出
        System.out.println("圆的周长=" + (aDiameter * PAI));//计算并输出
    }

}

class AreaDome1 //创建一个类
{
    public static void area(int aRadius, double PAI)//创建一个静态方法
    {
        double a = PAI;//接收PAI的值
        double acreage = (aRadius * aRadius) * a;//计算面积
        System.out.println("圆的面积=" + acreage);//输出面积
    }

    public static void area(int aRadius, int aDiameter, double PAI)//创建一个静态方法
    {
        double a = PAI;//接收PAI的值
        double perimeter = aDiameter * a;//计算周长
        double perimeter1 = (aRadius * 2) * a;//计算周长
        System.out.println("圆的周长=" + perimeter1);//输出周长
        System.out.println("圆的周长=" + perimeter);//输出周长
    }*/


    //简单的计算****************************************************************
   /* public static void main(String[] args) {

        int i = 100 % 3;
        int y = 100 / 3;
        y += 10;
        y %= 10;

        short s = 3;
        //s=s+2;
        s += 2;

        int k = 7 | 2;
        System.out.println("i=" + i);
        System.out.println("y=" + y);
        System.out.println("5+5=" + (5 + 5));
        System.out.println("s=" + s);
        System.out.println("k=" + k);
    }*/


    //输入成绩判断及不及格*******************************************************************
    /*//这是程序的入口
    public static void main(String[] args) {
        //输入
        System.out.println("请输入成绩0-100");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        //为int赋值
        int temp = sc.nextInt();
        //利用if语句执行成绩判断

        //判断成绩在90-100之间

        if (temp >= 90 && temp <= 100) {
            System.out.println("优秀!");
        }
        //判断成绩在80-90之间
        else if (temp >= 80 && temp < 90) {
            System.out.println("良好!");
        }
        //判断成绩在60-80之间
        else if (temp >= 60 && temp < 80) {
            System.out.println("一般!");
        }
        //判断成绩在0-60之间
        else if (temp >= 0 && temp < 60) {
            System.out.println("不合格!");
        }
        //判断成绩不在0-100范围内
        else {
            System.out.println("成绩不符合!");
        }
    }*/
}
