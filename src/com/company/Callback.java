package com.company;

public interface Callback <T extends InfoType>{
	void call(T info);
}
