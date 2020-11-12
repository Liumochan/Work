package Interface;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Text implements Student,Teacher{
	
	//成员变量
		private String name;
		private boolean sex;
		private int age;
		private static double fee,pay;//缴纳学费，发放薪水
		
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public boolean isSex() {
			return sex;
		}


		public void setSex(boolean sex) {
			this.sex = sex;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		@Override
		public void setPay(double pay) {
			// 发放薪水
			this.pay = pay * 12;//计算年工资
			System.out.println("实发薪水："+this.pay);//输出一年实际发放的工资
		}
		

		@Override
		public void getPay(double pay) {
			// 查询薪水
			this.pay = pay * 12;
			System.out.println("应发薪水："+this.pay);
		}
		

		@Override
		public void setFee(double fee) {
			// 缴纳学费
			this.fee = fee;
			System.out.println("实缴学费："+this.fee);
		}
		

		@Override
		public void getFee(double fee) {//get方法查询学费
			
			this.fee = fee;
			System.out.println("应缴学费："+this.fee);//输出应缴学费
		}
		
		public static void NaShui() {
			try{
			if((pay-fee)<3000) {//年工资减去学费，小于3000元
				System.out.println("应纳税款："+(pay-fee)*0.03);//应纳税额计算
				System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.03)));//纳税之后的实发工资
			}else if((pay-fee)>5000 && (pay-fee)<=12000){//如果年工资减去学费大于5000，并且年工资减去学费小于等于12000
				System.out.println("应纳税款："+(pay-fee)*0.1);//计算实际的应纳税额
				System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.1)));//纳税之后的实发工资
			}else if((pay-fee)>12000 && (pay-fee)<=25000) {
				System.out.println("应纳税款："+(pay-fee)*0.2);
				System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.2)));
			}else if((pay-fee)>25000 && (pay-fee)<=55000) {
				System.out.println("应纳税款："+(pay-fee)*0.25);
				System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.25)));
			}else if((pay-fee)>50000) {
				System.out.println("应纳税款："+(pay-fee)*0.45);
				System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.45)));
			}	
			}catch(InputMismatchException e){//处理异常try catch
				System.out.println(e.toString());//输出异常语句
			}
		}
		public static void main(String[] args) {
			//创建研究生对象
			try {
			//Scanner用法
			Text graduate = new Text();//初始化研究生对象
			Scanner scanner = new Scanner(System.in);//然后从键盘输入	
			
			System.out.println("请输入姓名:");//姓名
			graduate.name = scanner.next();		
			System.out.println("请输入年龄:");//年龄
			graduate.age = scanner.nextInt();	
			System.out.println("请输入性别:");//性别
			graduate.sex = scanner.nextBoolean();		
			//设置工资
			System.out.println("请输入月工资:");
			double pay = scanner.nextDouble();	//月工资
			graduate.setPay(pay);//获取月工资
			System.out.println("请输入学费:");
			double fee = scanner.nextDouble();	//输入学费
			graduate.setFee(fee);//获取学费
			NaShui();
			}catch (InputMismatchException e) {//输入异常
				// TODO: handle exception
			System.out.println("输入类型不匹配");
			}
		}


}
