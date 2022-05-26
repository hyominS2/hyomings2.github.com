package com.shop.model;

import java.util.ArrayList;

import com.shop.common.GoodsVO;

public class GoodsDAO {
	private int cnt = 0; 
	public int insertGoods(GoodsVO goods) {	//상품등록
		
		return cnt;
	}
	public int updateGoods(int gno) {
		
		return cnt;
	}
	public int deleteGoods(int gno) {
		
		return cnt;
	}	
	public ArrayList<GoodsVO> getGoodsList() { //상품목록
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		
		return list;
	}
	public GoodsVO getGoods(int gno) {
		GoodsVO goods = new GoodsVO();
		
		return goods; 
	}
}