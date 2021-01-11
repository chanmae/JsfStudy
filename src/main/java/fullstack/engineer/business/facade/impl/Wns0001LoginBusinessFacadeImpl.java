/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.facade.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fullstack.engineer.business.dto.Wns0001LoginEventInAppView;
import fullstack.engineer.business.dto.Wns0001LoginEventOutAppView;
import fullstack.engineer.business.facade.Wns0001LoginBusinessFacade;
import fullstack.engineer.business.logic.Wns0001LoginBusinessLogic;

/**
 *
 * @author maeda
 */
@ApplicationScoped
public class Wns0001LoginBusinessFacadeImpl implements Wns0001LoginBusinessFacade {

	/** ビジネスロジック */
	@Inject
	Wns0001LoginBusinessLogic wns0001LoginBusinessLogic;

	/**
	 * 表示イベントを実行する。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@Override
	public Wns0001LoginEventOutAppView initEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventAppViewIn) {
		return wns0001LoginBusinessLogic.initEventSevrice(wns0001LoginEventAppViewIn);
	}

	/**
	 * WNS0001メニュー画面の商品検索イベント
	 *
	 * @param wns0001LoginEventAppViewIn
	 * @return Wns0001LoginEventAppViewOut
	 */
	@Override
	public Wns0001LoginEventOutAppView productSearchEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventAppViewIn) {

		return wns0001LoginBusinessLogic.productSearchEventSevrice(wns0001LoginEventAppViewIn);
	}

}
