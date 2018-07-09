package org.websparrow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class AppendTagAction extends ActionSupport {

	private static final long serialVersionUID = -2422285858809271233L;

	private List<String> list1 = new ArrayList<>();
	private List<String> list2 = new ArrayList<>();
	private List<Integer> list3 = new ArrayList<>();

	private Map<String, String> map1 = new HashMap<>();
	private Map<Integer, String> map2 = new HashMap<>();

	@Override
	public String execute() throws Exception {

		// ArrayList Data
		list1.add("Java");
		list2.add("C++");
		list2.add("PHP");
		list3.add(10);
		list3.add(8);
		list3.add(5);

		// HashMap Data
		map1.put("New Delhi", "India");
		map1.put("Washington DC", "USA");
		map1.put("Moscow", "Russia");
		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Three");

		return SUCCESS;
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<String> getList2() {
		return list2;
	}

	public void setList2(List<String> list2) {
		this.list2 = list2;
	}

	public List<Integer> getList3() {
		return list3;
	}

	public void setList3(List<Integer> list3) {
		this.list3 = list3;
	}

	public Map<String, String> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, String> map1) {
		this.map1 = map1;
	}

	public Map<Integer, String> getMap2() {
		return map2;
	}

	public void setMap2(Map<Integer, String> map2) {
		this.map2 = map2;
	}
}
