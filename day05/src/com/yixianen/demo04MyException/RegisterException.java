package com.yixianen.demo04MyException;

/*
    自定义异常类:
        java给我们提供的异常不够我们使用,我们需要自己定义一些异常类
    格式:
        public class 自定义异常类的名称 extends Exception | RuntimeException{
            定义一个空参数构造方法
            public 自定义异常类的名称(){
            }

           定义一个带异常信息的构造方法
           public 自定义异常类的名称(String message){
                super(message);
           }
        }
     注意:
        1.自定义异常类名称一般都是以Exception结尾,让别人见名知意
        2.自定义异常类
            如果继承Exception,那么它就是一个编译异常;方法内部抛出了编译异常,就必须处理这个异常(throws,try...catch)
            如果继承RuntimeException,那么它就是一个运行期异常;无需处理,交给JVM处理(中断)
 */
public class RegisterException extends /*Exception*/ RuntimeException{
    //定义一个空参数构造方法
    public RegisterException() {
        super();//调用父类的空参数构造方法
    }

    //定义一个带异常信息的构造方法
    //查看java已有异常类,发现都有2个构造方法,带异常信息的构造方法,调用父类的带异常信息的构造方法,把异常信息交给父类封装
    public RegisterException(String message) {
        super(message);//调用父类带异常信息的构造方法
    }

}

















