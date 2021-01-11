package fullstack.engineer.presentation.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 商品情報を管理する。<br>
 *
 * @author maeda
 */
public class Product implements Serializable {

	/** 商品コード*/
	private String itemCode;

	/**商品名*/
	private String itemName;

	/**
	 * 値段
	 */
	private int price;

	/**
	 * 在庫数
	 */
	private int stockQuantity;

	/**
	 * 購入数
	 */
	private int purchaseNumber;

	/**
	 * 購入数リスト
	 */
	private List<Integer> purchaseNumberList;

	/**
	 * 備考
	 */
	private String remarks;

	/** 購入チェックフラグ */
	private boolean purchaseCheckFlag;

	/**
	 * Creates a new instance of Product
	 */
	public Product() {
	}

	public Product(String itemCode, String itemName, int price, int stockQuantity, int purchaseNumber,
			List<Integer> purchaseNumberList, String remarks) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.purchaseNumber = purchaseNumber;
		this.purchaseNumberList = purchaseNumberList;
		this.remarks = remarks;
	}

	public Product(String itemCode, String itemName, int price, int stockQuantity, String remarks) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.remarks = remarks;
	}

	/**
	 * @return itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode セットする itemCode
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return stockQuantity
	 */
	public int getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * @param stockQuantity セットする stockQuantity
	 */
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	/**
	 * @return purchaseNumber
	 */
	public int getPurchaseNumber() {
		return purchaseNumber;
	}

	/**
	 * @param purchaseNumber セットする purchaseNumber
	 */
	public void setPurchaseNumber(int purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	/**
	 * @return purchaseNumberList
	 */
	public List<Integer> getPurchaseNumberList() {
		return purchaseNumberList;
	}

	/**
	 * @param purchaseNumberList セットする purchaseNumberList
	 */
	public void setPurchaseNumberList(List<Integer> purchaseNumberList) {
		this.purchaseNumberList = purchaseNumberList;
	}

	/**
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks セットする remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 購入チェックフラグを取得するメソッド。
	 *
	 * @return purchaseCheckFlag
	 */
	public boolean getPurchaseCheckFlag() {
		return purchaseCheckFlag;
	}

	/**
	 * 購入チェックフラグを設定するメソッド。
	 *
	 * @param purchaseCheckFlag セットする purchaseCheckFlag
	 */
	public void setPurchaseCheckFlag(boolean purchaseCheckFlag) {
		this.purchaseCheckFlag = purchaseCheckFlag;
	}

}
