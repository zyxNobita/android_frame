package com.ganjie.designpatterns.creatType.factoryMethod.manyFactory;

import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.MailSender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.Sender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.SmsSender;

public class SendFactory {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}

}
