##计G201 刘园园 2020322078
## work
## 1 .实验目的：
     （1）. 掌握Java中抽象类和抽象方法的定义； 
     （2）. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
     （3）. 了解异常的使用方法，并在程序中根据输入情况做异常处理
## 2.实验内容:
     某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
     （1) . 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
     （2）.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
     （3）.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
## 3.实验要求：
     （1）. 在 博士研究生类中实现各个接口定义的抽象方法。
     （2）. 对年学费和年收入进行统计，用收入减去学费，求得纳税额。
     （3）. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
      (4）. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
     （5）. 根据输入情况，要在程序中做异常处理。
## 4.实验过程：
     （1）. 定义学生和老师两个接口。学生接口里面设置了缴纳学费和查学费的方法。老师接口里面设置了发放薪水和查询薪水的方法。
     （2）. 在测试类里面写了博士研究生类，并实现学生和老师的两个接口。定义了该博士研究生的成员变量姓名，性别，年龄，缴纳学费和发放薪水。
     （3）. 在set方法里面计算年工资，并输出一年实发薪水。在get方法里面查询薪水，并输出一年应发薪水。
           在set方法里面计算应交学费，并输出应缴学费金额。在get方法 里面查询学费，并输出应缴学费金额。
	   输出异常，并判断博士研究生初始化的对象输入是否匹配。如果输入的类型不匹配就会输出，输入类型不匹配。
     （4）. 在博士研究生里面统计了他们的年收入和学费。根据两者之差，算出来每名博士研究生的年纳税金额。
        ① . 如果年工资减去学费，小于3000元。利用公式计算出了他的应纳税额，和纳税之后的实发工资。
        ② . 如果年工资减去学费大于5000，并且年工资减去学费小于等于12000，计算实际的应纳税额和纳税之后的实发工资。
        ③ . 如果年工资减去学费大于12000，并且年工资减去学费小于等于25000，计算实际的应纳税额和纳税之后的实发工资。
        ④ . 如果年工资减去学费大于25000，并且年工资减去学费小于等于55000，计算实际的应纳税额和纳税之后的实发工资。
        ⑤ . 如果年工资减去学费大于50000，计算实际的应纳税额和纳税之后的实发工资。处理异常，如果输入的类型不匹配就会输出异常语句
      (5) .创建博士研究生对象，并初始化博士研究生对象。输出该博士研究生的姓名，年龄，性别，然后设置工资。
           首先输入月工资并获取月工资，输入学费并获取学费。通过Scanner方法 读入然后实现运行时交互式输入。
           输出异常，并判断博士研究生初始化的对象输入是否匹配。如果输入的类型不匹配就会输出，输入类型不匹配。
## 5.核心代码
```
public static void NaShui() {
   	try{
 if((pay-fee)<3000) {//年工资减去学费，小于3000元
	     System.out.println("应纳税款："+(pay-fee)*0.03);  //应纳税额计算
	     System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.03)));  //纳税之后的实发工资
	}else if((pay-fee)>5000 && (pay-fee)<=12000){  //如果年工资减去学费大于5000，并且年工资减去学费小于等于12000
	      System.out.println("应纳税款："+(pay-fee)*0.1);  //计算实际的应纳税额
	      System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.1)));  //纳税之后的实发工资
	}
}catch(InputMismatchException e){    //处理异常try catch
				System.out.println(e.toString());    //输出异常语句
      }
  }
  ```
## 6.系统运行截图：
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/Rq1QcIyJPlUbj53oyNfE7uyqkYFsXW8kMcibx6aZC4GYkvL1JSG5CTJVBrGVRNE12ahTibzRt49U4/0)

## 7.编程感想:
     在该实验中掌握了Java中接口的定义，以及接口的实验方法。学会了通过Scanner方法读入然后实现运行时交互式输入以及如何在程序中做异常处理。

