package com.ganjie.designpatterns.creatType.factoryMethod;

//import com.ganjie.designpatterns.factoryMethod.oneFactory.SendFactory;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.Sender;
import com.ganjie.designpatterns.creatType.factoryMethod.staticFactory.SendFactory;
//import com.ganjie.designpatterns.factoryMethod.manyFactory.SendFactory;
public class FactoryTest {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args   
	 * @return void   
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1、普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
//		SendFactory factory1 = new SendFactory();  
//        Sender sender1 = factory1.produce("sms");  
//        sender1.send();  
        // 2、多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
       //    则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
//        SendFactory factory2 = new SendFactory();  
//        Sender sender2 = factory2.produceMail();  
//        sender2.send();  
		// 3、静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
		  Sender sender = SendFactory.produceMail();  
	      sender.send();  
	    // 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法
	   //  模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于
	   //  第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
	}

}
