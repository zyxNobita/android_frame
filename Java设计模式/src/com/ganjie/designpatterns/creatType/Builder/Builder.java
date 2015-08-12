package com.ganjie.designpatterns.creatType.Builder;

import java.util.ArrayList;
import java.util.List;

import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.MailSender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.Sender;
import com.ganjie.designpatterns.creatType.factoryMethod.oneFactory.SmsSender;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

}
