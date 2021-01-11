/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.facade.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fullstack.engineer.business.dto.Wns0002MenuEventInAppView;
import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;
import fullstack.engineer.business.facade.Wns0002MenuBusinessFacade;
import fullstack.engineer.business.logic.Wns0002MenuBusinessLogic;

/**
 *
 * @author maeda
 */
@ApplicationScoped
public class Wns0002MenuBusinessFacadeImpl implements Wns0002MenuBusinessFacade {

	/** ビジネスロジック */
	@Inject
	Wns0002MenuBusinessLogic wns0002MenuBusinessLogic;

	/**
	 * 表示イベントを実行する。<br>
	 * メソッド仕様：表示イベントを実行する。<br>
	 * 注意事項：なし。<br>
	 */
	@Override
	public Wns0002MenuEventOutAppView initEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn) {
		return wns0002MenuBusinessLogic.initEventSevrice(wns0002MenuEventAppViewIn);
	}

	/**
	 * WNS0002メニュー画面の商品検索イベント
	 *
	 * @param wns0002MenuEventAppViewIn
	 * @return Wns0002MenuEventAppViewOut
	 */
	@Override
	public Wns0002MenuEventOutAppView productSearchEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn) {
		return wns0002MenuBusinessLogic.productSearchEventSevrice(wns0002MenuEventAppViewIn);
	}

}
