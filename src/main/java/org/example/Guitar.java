//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でGuitarという名前のクラスを作成、Instrumentという名前のインターフェイスを実装せよ
public class Guitar implements Instrument {

  //パブリック設定でString型の引数instrumentNameを受け取るplayという名前のメソッドを作成せよ
  public String play(String instrumentName) {

    //引数instrumentNameと"を弾いています!"を連結した文字列を呼び出し元に返せ
    return instrumentName + "を弾いています!";
  }
}
