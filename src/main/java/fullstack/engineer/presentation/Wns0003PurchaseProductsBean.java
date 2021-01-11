package fullstack.engineer.presentation;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fullstack.engineer.presentation.common.constant.FormDataConst;
import fullstack.engineer.presentation.common.util.Wns0003PurchaseProductsEditScreenDto;
import fullstack.engineer.presentation.dto.InterScreenSharedData;
import fullstack.engineer.presentation.dto.Wns0003PurchaseProductsScreenDto;

/**
 * WNS0003_商品購入画面のイベント処理を行う。<br>
 *
 * @author maeda
 */
@Named(value = "wns0003PurchaseProductsBean")
@ViewScoped
public class Wns0003PurchaseProductsBean implements Serializable {

	/** 画面間共有データ */
	@Inject
	private InterScreenSharedData interScreenSharedData;

	/** WNS0003商品購入画面DTO */
	private Wns0003PurchaseProductsScreenDto wns0003PurchaseProductsScreenDto;

	/** WNS0003商品購入画面イベントサービス */
	//	@Inject
	//	WNS0003MenuBusinessFacade WNS0003BusinessFacade;

	/** FacesContext */
	FacesContext facesContext;

	/**
	 * コンストラクタ。<br>
	 */
	public Wns0003PurchaseProductsBean() {
	}

	/**
	 * 【表示】イベント。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@PostConstruct
	public void init() {

		// JSFアプリケーションの現在の状態を保持しているオブジェクト
		facesContext = FacesContext.getCurrentInstance();

		// InAppView
		//		WNS0003MenuEventInAppView WNS0003MenuEventAppViewIn = new WNS0003MenuEventInAppView();
		// OutAppView
		//		WNS0003MenuEventOutAppView WNS0003MenuEventAppViewOut = new WNS0003MenuEventOutAppView();

		// 表示イベントサービス呼び出し
		//		WNS0003MenuEventAppViewOut = WNS0003BusinessFacade.initEventSevrice(WNS0003MenuEventAppViewIn);

		// 画面DTOがnullの場合、インスタンスを生成する
		if (Objects.isNull(wns0003PurchaseProductsScreenDto)) {
			wns0003PurchaseProductsScreenDto = new Wns0003PurchaseProductsScreenDto();
		}

		// 画面間共有データから画面DTOへ移送
		Wns0003PurchaseProductsEditScreenDto.editScreenDto(wns0003PurchaseProductsScreenDto, interScreenSharedData);
	}

	/**
	 * 【商品購入】イベント。<br>
	 * メソッド仕様：購入イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	public String productPurchase() {

		// TODO 未実装

		// WNS0004_商品購入確認画面へ遷移する
		return FormDataConst.SCREEN_URL_WNS0004_PRODUCT_PURCHASE_CONFIRMATION;
	}

	/**
	 * 画面DTO取得メソッド
	 *
	 * @return 画面DTO
	 */
	public Wns0003PurchaseProductsScreenDto getWns0003PurchaseProductsScreenDto() {
		return wns0003PurchaseProductsScreenDto;
	}

	/**
	 * 画面DTO設定メソッド
	 *
	 * @param WNS0003MenuScreenDto 画面DTO
	 */
	public void setWns0003PurchaseProductsScreenDto(Wns0003PurchaseProductsScreenDto wns0003PurchaseProductsScreenDto) {
		this.wns0003PurchaseProductsScreenDto = wns0003PurchaseProductsScreenDto;
	}

}
