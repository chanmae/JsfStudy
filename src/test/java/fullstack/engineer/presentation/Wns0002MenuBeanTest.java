package fullstack.engineer.presentation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import fullstack.engineer.business.dto.Wns0002MenuEventInAppView;
import fullstack.engineer.business.dto.Wns0002MenuEventOutAppView;
import fullstack.engineer.business.facade.Wns0002MenuBusinessFacade;
import fullstack.engineer.presentation.dto.Product;
import fullstack.engineer.presentation.dto.Wns0002MenuScreenDto;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class Wns0002MenuBeanTest {

	@Tested
	Wns0002MenuBean target;

	@Injectable
	Wns0002MenuBusinessFacade wns0002BusinessFacade;

	@Injectable
	Wns0002MenuScreenDto wns0002MenuScreenDto;

	@Before
	public void setUp() {

		// 画面DTO
		wns0002MenuScreenDto = new Wns0002MenuScreenDto();
	}

	/**
	 * 【表示】イベントのテスト<br>
	 * テスト観点<br>
	 * ・画面DTOに期待通りの値が設定されていること。<br>
	 *
	 * 条件<br>
	 * ・画面DTOの初期値がnull<br>
	 *
	 * 期待結果<br>
	 * ・画面DTOに期待通りの値が設定されていること。<br>
	 */
	@Test
	public void testInit_UT001() {
		// 期待値
		Wns0002MenuScreenDto wns0002MenuScreenDto_expected =new Wns0002MenuScreenDto();
		List<Product> productList_expected = new ArrayList<Product>();
		productList_expected.add(new Product());
		wns0002MenuScreenDto_expected.setProductList(productList_expected);

		// アプリビューIn
		Wns0002MenuEventInAppView wns0002MenuEventAppViewIn = new Wns0002MenuEventInAppView();
		// アプリビューOut
		Wns0002MenuEventOutAppView wns0002MenuEventAppViewOut = new Wns0002MenuEventOutAppView();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product());

		wns0002MenuEventAppViewOut.setProductList(productList);

		// 表示イベントサービスをモック化
		new Expectations() {
			{
				wns0002BusinessFacade.initEventSevrice(wns0002MenuEventAppViewIn);
				result = wns0002MenuEventAppViewOut;
				maxTimes=0;
			}
		};

		// 画面DTOにnullを設定
		target.setWns0002MenuScreenDto(null);

		// テスト対象メソッド実行
		target.init();

		// 期待結果の比較
		assertEquals(wns0002MenuScreenDto_expected.getProductList(), target.getWns0002MenuScreenDto().getProductList());
	}

}
