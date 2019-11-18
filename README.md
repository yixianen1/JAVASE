# JAVASE学习代码及笔记

### day01:

##### 能够说出Object类的特点:

​	所有类的父类,任意的类都直接或者间接的继承了Object类,都可以使用Object类的方法

##### 能够重写Object类的toString方法

​	alt+insert,选择toString()

##### 能够重写Object类的equals方法

​	alt+insert,选择equals and hashCode(使用HashSet集合/HashMap集合)

##### 能够使用日期类输出当前日期

​	Date date = new Date();
​	sout(date);

##### 能够使用将日期格式化为字符串的方法

​	

```
SimpleDateFormat sdf = new SimpleDateFormat("模式:yyyy-MM-dd HH:mm:ss");
	String s = sdf.format(new Date());
	sout(s);//2018-08-24 08:36:33
```



##### 能够使用将字符串转换成日期的方法

```
	main throws xxxException(
		SimpleDateFormat sdf = new SimpleDateFormat("模式:yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("2018-06-01 08:36:33");
		sout(date);
	)
```



##### 能够使用System类的数组复制方法

​	static void arraycopy(源数组,源数组的起始索引,目标数组,目标数组的起始索引,复制元素个数);

##### 能够使用System类获取当前毫秒时刻值

​	

```
long s = System.currentTimeMillis();
	sout(s);1527731875729L
```



##### 能够说出使用StringBuilder类可以解决的问题

​	提高字符串的效率,在内存中始终操作的是一个数组(一个字符串),占用内存小,效率高

##### 能够使用StringBuilder进行字符串拼接操作

​	bu.append("a").append("b").append("c");

##### 能够说出8种基本类型对应的包装类名称
  
###### 	 基本的数据类型:4类8种

​	    

```
byte short  int long    float   double  boolean char
```



###### 	 对应的包装类:java.lang中

​	   

```
 Byte Short  Integer Long    Float   Double  Boolean Character
```



##### 能够说出自动装箱、自动拆箱的概念

​	基本类型的数据和包装类之间可以自动的相互转换

##### 能够将字符串转换为对应的基本类型

###### 	使用包装类中的静态方法parseXXX("数值的的字符串");

​        Integer类:static int parseInt(String s)
​        Double类:static double parseDouble(String s)

##### 能够将基本类型转换为对应的字符串

​	基本类型的值+""