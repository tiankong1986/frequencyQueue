package com.vf.ex.data.model;

public class MyElem implements Comparable<MyElem> {
	public Integer value;
	public Integer num;
	public MyElem(){}
	public MyElem(Integer value,Integer num){
		this.num = num;
		this.value = value;
	}
	@Override
	public int compareTo(MyElem o) {
		if(this.num > o.num){
			return 0;
		}
		if(this.num < o.num){
			return -1;
		}
		return 0;
	}
}
