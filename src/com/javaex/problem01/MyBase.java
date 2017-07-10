package com.javaex.problem01;

public class MyBase extends Base {

	// 코드작성
	public MyBase() {
	}

	public void service(String state) {	//App에서 낮들어오면
		
		if (state.equals("오후")) {		
			afternoon();
		}else {
			super.service(state);		//state에 낮->부모base에 state로 들어가서 구동.
		}

	}

	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}


	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
