package com.ganjie.designpatterns.creatType.Builder;

public class Test {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args   
	 * @return void   
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Builder builder = new Builder();  
	     builder.produceMailSender(10); 
	     /****
	      * 从这点看出，建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
	      * 所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，
	      * 多个部分。因此，是选择工厂模式还是建造者模式，依实际情况而定。
	      */
	}

}
