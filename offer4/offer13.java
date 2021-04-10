package aa;

public class offer13 {
    public int[] reOrderArray (int[] array) {
        // write code here
        //使用冒泡排序思想
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //比较两个相邻之间元素 偶数在前 奇数在后就交换
                if(array[j]%2==0 && array[j+1]%2==1){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    //定义一个新数组依次按条件搬移旧数组中所有元素
    public int[] reOrderArray1 (int[] array) {
        // write code here
       int []newArr=new int[array.length];
       int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                newArr[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                newArr[j]=array[i];
                j++;
            }
        }
        return newArr;
    }
}
