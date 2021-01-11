/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullstack.engineer.business.facade;

import fullstack.engineer.business.dto.Wns0001LoginEventInAppView;
import fullstack.engineer.business.dto.Wns0001LoginEventOutAppView;

/**
 * WNS0001ログイン画面のイベントサービス。<bbr>
 *
 * @author maeda
 */
public interface Wns0001LoginBusinessFacade {

	/**
	 * WNS0001ログイン画面の表示イベント
	 *
	 * @param wns0001LoginEventInAppView
	 * @return wns0001LoginEventOutAppView
	 */
	public Wns0001LoginEventOutAppView initEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventInAppView);

	/**
	 * WNS0001ログイン画面の商品検索イベント
	 *
	 * @param wns0001LoginEventInAppView
	 * @return wns0001LoginEventOutAppView
	 */
	public Wns0001LoginEventOutAppView productSearchEventSevrice(Wns0001LoginEventInAppView wns0001LoginEventInAppView);

}
