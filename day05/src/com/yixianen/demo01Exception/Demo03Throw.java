package com.yixianen.demo01Exception;

/*
    throw关键字:
    作用:
        使用throw关键字,可以在指定的位置抛出指定的异常对象

    格式:
        throw new xxxException("异常产生的原因");
    注意事项:
        throw关键字必须写在方法内部
        throw关键字后边创建的异常对象,必须是Exception或者是Exception的子类对象
        throw关键字后边创建的异常对象
            如果是运行期异常,那么我们不用处理这个异常,交给JVM处理,默认处理方式就是中断处理
            如果是编译期异常,那么我们就必须处理这个异常,要么throws继续抛出给别人处理,要么try...catch自己处理
 */
public class Demo03Throw {
    public static void main(String[] args) {
        //int[] arr = null;
        int[] arr = {1,2,3};
        int element = getElement(3, arr);
        System.out.println(element);
    }

    /*
        定义一个方法,根据数组的索引查找并返回对应的元素
        参数:
            int index
            int[] arr
        在工作,我们都会都方法的参数进行合法性判断
        如果传递的参数不合法,那么我们就可以使用抛出异常对象的方式
        告之方法的调用者,传递参数不合法
     */
    public static int getElement(int index,int[] arr){
        /*
            对传递的参数数组arr进行判断,判断数组是否为null
            如果传递的数组arr是null
            那么我就抛出一个异常对象,告之方法的调用者,数组的值是null
         */
        if(arr == null){
            throw new NullPointerException("数组的值是null");
        }

        /*
            对传递的参数index进行判断,判断index是否在数组的索引范围内
            如果index不在数组索引范围
            那么我就抛出一个异常对象,告之方法的调用者,参数index超出了数组的索引范围
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("参数index:"+index+"超出了数组的索引范围");
        }

        int element = arr[index];
        return element;
    }
}
