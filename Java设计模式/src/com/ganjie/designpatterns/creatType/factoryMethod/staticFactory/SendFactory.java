package com.ganjie.designpatterns.creatType.factoryMethod.staticFactory;

import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.MailSender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.Sender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.SmsSender;

public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}

}
