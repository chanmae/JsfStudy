package fullstack.engineer.presentation.common.util;

import fullstack.engineer.presentation.dto.InterScreenSharedData;
import fullstack.engineer.presentation.dto.Wns0003PurchaseProductsScreenDto;

public class Wns0003PurchaseProductsEditScreenDto {

	/**
	 * コンストラクタ
	 */
	private Wns0003PurchaseProductsEditScreenDto() {
		// インスタンス生成抑止
	}

	/**
	 * WNS0003_商品購入画面の画面DTOへの移送処理<br>
	 * メソッド仕様：<br>
	 * WNS0003_商品購入画面の画面DTOへの移送処理を行う。<br?
	 * 注意事項：なし。<br>
	 *
	 * @param
	 */
	public static void editScreenDto(Wns0003PurchaseProductsScreenDto wns0003PurchaseProductsScreenDto,
			InterScreenSharedData interScreenSharedData) {
		// 商品一覧
		wns0003PurchaseProductsScreenDto.setPurchasedProductList(interScreenSharedData.getPurchasedProductList());;
	}

}
