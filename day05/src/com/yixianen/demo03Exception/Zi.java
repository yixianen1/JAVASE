package com.yixianen.demo03Exception;

/*
    异常注意事项:子父类异常
        - 如果父类抛出了多个异常,子类重写父类方法时,
            只能抛出和父类相同的异常
            或者抛出父类异常的子类
            或者不抛出异常。
        - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
    简单记:
        父类异常什么样,子类就什么样,无需考虑异常问题
 */
public class Zi extends Fu{
    //抛出和父类相同的异常
    @Override
    public void show01() throws ClassCastException, IndexOutOfBoundsException {
    }

    //抛出父类异常的子类
    //ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException{}

    //不抛出异常
    @Override
    public void show03(){}

    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。
    /*@Override
    public void show04() throws Exception{}*/

    public void show04() {
        //此时子类产生该异常，只能捕获处理，不能声明抛出
        try {
            throw new Exception("编译期异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
