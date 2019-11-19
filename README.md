# JAVASE学习代码及笔记

### ----------------------------------------------day01------------------------------------------------

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



### ----------------------------------------------day02------------------------------------------------

##### 能够说出集合与数组的区别

###### 	数组:

​		1.长度是固定的
​		2.可以存储任意类型的数据
​			int[]  Student[]

###### 	集合:

​		1.长度是可以改变的
​		2.只能存储对象(引用类型的数据) ArrayList<String>  ArrayList<Integer>

##### 说出Collection集合的常用功能

- ​	public boolean add(E e)：  把给定的对象添加到当前集合中 。
- ​	public void clear() :清空集合中所有的元素。
- ​	public boolean remove(E e): 把给定的对象在当前集合中删除。
- ​	public boolean contains(E e): 判断当前集合中是否包含给定的对象。
- ​	public boolean isEmpty(): 判断当前集合是否为空。
- ​	public int size(): 返回集合中元素的个数。
- ​	public Object[] toArray(): 把集合中的元素，存储到数组中。

##### 能够使用迭代器对集合进行取元素

###### 	1.创建一个集合对象

​	Collection<集合的数据类型> coll = new ArrayList<>();

###### 	2.使用集合对象中的方法iterator获取迭代器对象

​	Iterator<集合的数据类型> it= coll.iterator();

###### 	3.使用迭代器中的方法hasNext和next依次取出集合中的元素

​	while(it.hasNext()){//判断是否有下一个元素

​			集合的数据类型 变量名 = it.next();//取出下一个元素
​	}

##### 能够说出集合的使用细节

​	1.会使用集合存储元素(add)

​	2.会取出集合中的元素(迭代器,增强for)

##### 能够使用集合存储自定义类型

```
	ArrayList<Person> list = new ArrayList<Person>();
	list.add(new Person("貂蝉",18));
	list.add(new Person("西施",19));
	list.add(new Person("王昭君",18));
	list.add(new Person("杨贵妃",20));
```

##### 能够使用foreach循环遍历集合

​	

```
for(集合/数组的数据类型 变量名 : 集合名/数组名){
            sout(变量名);
    }
	for(Person p : list){
		sout(p));
	}
```

​	快捷键:list.for

##### 能够使用泛型定义集合对象

```
	ArrayList<Person> list = new ArrayList<Person>();
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<String> list = new ArrayList<String>();
```



##### 能够理解泛型上下限

​	泛型上限限定:? extends E 代表使用的泛型只要是E类型的子类/本身即可

​	泛型下限限定:? super E   代表使用的泛型只要是E类型的父类/本身即可

##### 能够阐述泛型通配符的作用

​	泛型通配符:?

​	可以接收任意的数据类型(只能作为参数使用)



### ----------------------------------------------day03------------------------------------------------

##### 能够说出List集合特点

​	有序,允许重复,有索引

##### 能够说出常见的数据结构

- ​	堆栈:先进后出

- ​	队列:先进先出

- ​	数组:查询快,增删慢

- ​	链表:查询慢,增删快

- ​	红黑树(趋近平衡二叉树):查找的速度特别快

  ##### 能够说出数组结构特点

  ​	查询快,增删慢

  ##### 能够说出栈结构特点

  ​	先进后出

  ##### 能够说出队列结构特点

  ​	先进先出

  ##### 能够说出单向链表结构特点

  ​	查询慢,增删快

  ##### 能够说出Set集合的特点

  ​	不允许重复

  ​	没有索引,不能使用普通for

  ##### 能够说出哈希表的特点

  1. ​	JDK1.7:数组+链表:查询快,增删快

  2. ​	JDK1.8:数组+链表+红黑树:提高查询的效率

     ###### 使用HashSet集合存储自定义元素

     ​	要求:保证同名同年龄的人是同一个人,自定义类型必须重写hashCode和equals方法(快捷键)

     ​	

     ```
     HashSet<Person> set = new HashSet<Person>();
     ```

     ##### 能够使用集合工具类

     ​	

     ```
     public static void shuffle(List<?> list)://打乱集合顺序。
     public static <T> void sort(List<T> list)://将集合中元素按照默认规则排序。
     public static <T> void sort(List<T> list，Comparator<? super T> )://将集合中元素按照指定规则排序。
     ```

     ##### 能够使用Comparator比较器进行排序

     ​	升序排列/降序排列的口诀：

     ​		升序就是o1-o2,降序反之





### ----------------------------------------------day04------------------------------------------------

##### 能够说出Map集合特点

​	  是一个双列集合

​	1.key不允许重复,value可以重复

​	2.一个key只能对应一个value(一夫一妻)

​	3.key和value数据类型,可以相同,也可以不同

##### 使用Map集合添加方法保存数据

​	map.put(key,value);

​	key重复返回被替换的值

​	key不重复返回null

##### 使用”键找值”的方式遍历Map集合

​	使用Map集合中的方法keySet,把所有的key存储到Set集合中

​	遍历Set集合,获取Map集合的每一个key

​	使用Map中的方法get(key),获取value

##### 使用”键值对”的方式遍历Map集合

​	使用Map集合中的方法entrySet,把所有Entry对象(健和值的映射关系,结婚证)存储到Set集合中

​	遍历存储Entry对象的Set集合,获取每一个Entry对象

​	使用Entry对象中的方法getKey和getValue获取健和值

##### 能够使用HashMap存储自定义键值对的数据

​	自定义类型作为值:不需要重写hashCode和equals方法,值可以重复(同名,同年龄)

​	自定义类型作为健:需要重写hashCode和equals方法,保证健(同名,同年龄)视为同一个人

##### 能够使用可变参数

​	底层就是一个数组,会根据传递的参数个数不同,而创建长度不同的数组,来接收这些参数

​	修饰符 返回值类型 方法名(参数类型... 形参名){  }

​	public void show(int...a){}

##### 能够使用HashMap编写斗地主洗牌发牌案例



### ----------------------------------------------day05------------------------------------------------

##### 能够辨别程序中异常和错误的区别

​	异常:感冒,发烧

- ​	Exception编译期异常,进行编译JAVA程序时出现的问题
  ​		将异常处理掉,程序可以继续执行

- ​	RuntimeException运行期异常, JAVA程序运行过程中出现的问题
  ​			无序处理,JVM处理

- ​	Error 错误-->非典,艾滋,癌症
  ​		必须修改程序,程序才能执行

  ##### 说出异常的分类

  ​	编译期异常, 运行期异常

  ##### 说出虚拟机处理异常的方式

  ###### 	中断处理

   1. 以红色的字体打印异常信息到控制台

   2. 终止程序
      列举出常见的三个运行期异常

      - ClassCastException:类型转换异常

      - IndexOutOfBoundsException:索引越界异常(集合会报)

      - NullPointerException:空指针异常

      - ArrayIndexOutOfBoundsException:数组索引越界异常

      - StringIndexOutOfBoundsException:字符串索引越界异常

        ##### 能够使用try...catch关键字处理异常

        ```
        	try{
        		可能出现异常的代码
        	}catch(出现异常的变量 变量名){
        		处理异常的逻辑
        	}finally{
        		一定会执行的代码,释放资源
        	}
        ```

        ##### 能够使用throws关键字处理异常

        ​	

        ```
        public static void main(String[] args) throws 异常的名字{
        	}
        ```

        ##### 能够自定义异常类

        ​	创建一个类继承Exception或者RuntimeException

        ##### 能够处理自定义异常类

        ​	Exception:自定义异常就是一个编译异常;如果方法中抛出了编译异常,那么就必须处理这个异常(throws,try...catch)

        ​    RuntimeException:自定义异常就是一个运行期异常;如果方法中抛出了运行期异常,无需处理,交给JVM-->中断处理

        ##### 说出进程的概念

        ​	进程：进程指在内存中正在运行的程序

        ##### 说出线程的概念

        ​	线程：进程内部的一个独立执行单元(就是应用程序一个功能通向cpu的路径)

        ##### 能够理解并发与并行的区别

        ​	并行：指两个或多个事件在同一时刻发生（同时发生）。

        ​	并发：指两个或多个事件在同一个时间段内发生(交替发生)。

        ##### 能够开启新线程

        ​	

        ```
        public clsss MyThread extends Thread{
        		//重写run方法,设置线程任务
        		run(){
        		}
        	}
        	main(){
        		new MyThread().start();//开启新线程
        	}
        ```

        

### ----------------------------------------------day06------------------------------------------------



##### 能够描述Java中多线程运行原理

​	调用start方法会开辟一个栈空间运行run方法

​	多个栈空间的方法都是独立的,互相不影响

##### 能够使用继承类的方式创建多线程

​	

```
public clsss MyThread extends Thread{
		//重写run方法,设置线程任务
		run(){

​	}
}
main(){
​	new MyThread().start();//开启多线程
}
```

##### 能够使用实现接口的方式创建多线程

```
	public class RunnableImpl implements Runnable{
		//重写run方法,设置线程任务
		run(){
		}
	}
	new Thread(new RunnableImpl()).start();//开启多线程
```

##### 能够说出实现接口方式的好处

​	1.避免了实现类单继承的局限性(实现了Runnable接口,还可以继承其它的类,实现其它的接口使用)

​	2.降低了设置线程任务和执行线程之间的耦合性,增强了扩展性

##### 能够解释安全问题的出现的原因

​	多线程访问了同一个共享的数据

##### 能够使用同步代码块解决线程安全问题

```
	synchronized(锁对象){
		可能出现安全问题的代码
		(访问了共享数据的代码)
	}
```

​	注意:保证锁对象要唯一

##### 能够使用同步方法解决线程安全问题

​	1.把访问共享数据的代码,提取出来放在一个方法中

​	2.在方法上增加一个同步关键字
​	 

	修饰符 synchronized 返回值类型 方法名(参数列表){
		出现了安全问题的代码
		(使用了共享数据的代码)
	}
##### 能够说出线程6个状态的名称

​	

```
	NEW(新建) 
	Runnable(可运行)
	Blocked(锁阻塞)
	Waiting(无限等待)
	TimedWaiting(计时等待,睡眠)
	Teminated(被终止/死亡)
```

##### 能够理解等待唤醒案例

​	吃包子案例

​		一个生产者:生产者生产包子-->唤醒消费者吃包子 

​		一个消费者:消费者吃完包子-->唤醒生产者生产包子	

### ----------------------------------------------day07------------------------------------------------