package com.vf.ex.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vf.ex.data.model.MyElem;

public class MyQueue {
	//存数据
	private List<MyElem> dataList = new ArrayList<MyElem>();
	//存索引
	private Map<Integer,Integer> indexMap = new HashMap<Integer, Integer>();
		
	public void insert(Integer elem) {
		Integer index = indexMap.get(elem);
		if(null == index){
			MyElem myElem = new MyElem(elem,1);
			dataList.add(myElem);
			indexMap.put(elem, dataList.size()-1);
		}else{
			dataList.get(index).num++;
		}
	}
	public Integer getElem(){
		Integer value = null;
		if(dataList.size() > 0){
			Integer index = getIndexOfMaxElem(dataList);
			if(null != index){
				value = dataList.get(index).value;
				dataList.get(index).num--;
			}
		}
		return value;
	}
	public Integer getIndexOfMaxElem(List<MyElem> dataList){
		Integer position = null;
		Integer tempNum = 0;
		for(int i = 0;i < dataList.size();i++){
			Integer elemNum = dataList.get(i).num;
			if(elemNum > tempNum){
				position = i;
				tempNum = elemNum;
			}
			
		}
		return position;
	}
}
