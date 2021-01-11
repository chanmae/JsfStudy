package fullstack.engineer.presentation.common.util;

import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;
import fullstack.engineer.presentation.dto.Wns0002MenuScreenDto;

public class Wns0002MenuEditScreenDto {

	/**
	 * コンストラクタ
	 */
	private Wns0002MenuEditScreenDto() {
		// インスタンス生成抑止
	}

	/**
	 * WNS0002_メニュ画面の画面DTOへの移送処理<br>
	 * メソッド仕様：<br>
	 * WNS0002_メニュ画面の画面DTOへの移送処理を行う。<br?
	 * 注意事項：なし。<br>
	 *
	 * @param
	 */
	public static void editScreenDto(Wns0002MenuScreenDto wns0002MenuScreenDto,
			Wns0002MenuEventOutAppView wns0002MenuEventOutAppView) {
		// 商品一覧
		wns0002MenuScreenDto.setProductList(wns0002MenuEventOutAppView.getProductList());
	}

}
