package fullstack.engineer.presentation.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * WNS0003商品購入画面の画面出力情報を保持する。<br>
 *
 * @author maeda
 */
public class Wns0003PurchaseProductsScreenDto implements Serializable {

	/** 購入商品一覧 */
	List<Product> purchasedProductList = new ArrayList<>();

	/** 合計金額 */
	int totalAmonut;

	/**
	 * コンストラクタ<br>
	 */
	public Wns0003PurchaseProductsScreenDto() {
	}

	/**
	 * @return purchasedProductList
	 */
	public List<Product> getPurchasedProductList() {
		return purchasedProductList;
	}

	/**
	 * @param purchasedProductList セットする purchasedProductList
	 */
	public void setPurchasedProductList(List<Product> purchasedProductList) {
		this.purchasedProductList = purchasedProductList;
	}

	/**
	 * @return totalAmonut
	 */
	public int getTotalAmonut() {
		return totalAmonut;
	}

	/**
	 * @param totalAmonut セットする totalAmonut
	 */
	public void setTotalAmonut(int totalAmonut) {
		this.totalAmonut = totalAmonut;
	}


}
