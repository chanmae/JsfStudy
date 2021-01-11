/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.facade;

import fullstack.engineer.business.dto.Wns0002MenuEventInAppView;
import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;

/**
 * WNS0002メニュー画面のイベントサービス。<bbr>
 *
 * @author maeda
 */
public interface Wns0002MenuBusinessFacade {

	/**
	 * WNS0002メニュー画面の表示イベント
	 *
	 * @param wns0002MenuEventAppViewIn
	 * @return Wns0002MenuEventAppViewOut
	 */
	public Wns0002MenuEventOutAppView initEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn);

	/**
	 * WNS0002メニュー画面の商品検索イベント
	 *
	 * @param wns0002MenuEventAppViewIn
	 * @return Wns0002MenuEventAppViewOut
	 */
	public Wns0002MenuEventOutAppView productSearchEventSevrice(Wns0002MenuEventInAppView wns0002MenuEventAppViewIn);

}
