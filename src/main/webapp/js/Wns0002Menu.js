/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// イベント登録

// 商品検索ボタンクリックイベント後処理（onevent属性→Ajax処理成功）
function productSearch_after(data) {
    var ajaxStatus = data.status;
    switch (ajaxStatus) {
        case "begin":
            window.alert("商品検索イベント（成功）の前処理が実行されました。");
            break;
        case "complete":
            window.alert("complete");
            break;
        case "success":
            window.alert("success");
            break;
    }
}

// 買い物かごへボタン押下
const toshoppingcartbutton = document.getElementById("toshoppingcartbutton");
toshoppingcartbutton.addEventListener("click", function () {
    alert("買い物かごへボタンがクリックされました。");
});

// 購入履歴確認へボタン押下

// 商品購入へボタン押下

// 買い物かご確認ボタン押下