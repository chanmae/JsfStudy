/**
 *
 */
package fullstack.engineer.presentation.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

/**
 * 画面間共有データを保持するクラス。<br>
 * @author maeda
 *
 */
@SessionScoped
public class InterScreenSharedData implements Serializable {

	/** 購入商品リスト（買い物かご）*/
	List<Product> purchasedProductList = new ArrayList<>();

	/**
	 * 購入商品リスト（買い物かご）取得メソッド。
	 *
	 * @return purchasedProductList
	 */
	public List<Product> getPurchasedProductList() {
		return purchasedProductList;
	}

	/**
	 * 購入商品リスト（買い物かご）設定メソッド。
	 *
	 * @param purchasedProductList セットする purchasedProductList
	 */
	public void setPurchasedProductList(List<Product> purchasedProductList) {
		this.purchasedProductList = purchasedProductList;
	}

}
