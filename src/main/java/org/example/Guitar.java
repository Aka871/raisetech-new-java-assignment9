//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でGuitarという名前のクラスを作成、Instrumentという名前のインターフェイスを実装せよ
public class Guitar implements Instrument {

  //パブリック設定で変更不可のString型のINSTRUMENT_NAMEという名前のクラス変数を作成し、文字列"ギター"を入れよ
  public static final String INSTRUMENT_NAME = "ギター";

    //パブリック設定で戻り値がString型のplayという名前のメソッドを作成せよ
    public String play() {

    //引数instrumentNameと"を弾いています!"を連結した文字列を呼び出し元に返せ
    return INSTRUMENT_NAME + "を弾いています!";
  }
}
