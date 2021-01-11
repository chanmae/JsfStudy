/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.dto;

import java.util.ArrayList;
import java.util.List;

import fullstack.engineer.presentation.dto.Product;

/**
 *
 * @author maeda
 */
public class Wns0002MenuEventOutAppView {

	// 商品情報リスト
	List<Product> productList = new ArrayList<>();

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
