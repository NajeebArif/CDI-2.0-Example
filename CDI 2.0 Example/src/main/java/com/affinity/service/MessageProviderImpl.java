package com.affinity.service;

import com.affinity.qualifiers.Implementation2;

@Implementation2
public class MessageProviderImpl implements MessageProviderService {

	public String getSomethingWillYou() {
		return "MESSAGE FROM OTHER IMPLEMENTATION";
	}

}
