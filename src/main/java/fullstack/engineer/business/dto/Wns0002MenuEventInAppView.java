/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.dto;

/**
 *
 * @author maeda
 */
public class Wns0002MenuEventInAppView {

	/** 商品検索ワード */
	String productSearchtext;

	/**
	 * 商品検索ワード取得メソッド
	 *
	 * @return
	 */
	public String getProductSearchtext() {
		return productSearchtext;
	}

	/**
	 * 商品検索ワード設定メソッド
	 *
	 * @param itemSearchWord
	 */
	public void setProductSearchtext(String productSearchtext) {
		this.productSearchtext = productSearchtext;
	}

}
