//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でGrandPianoという名前のクラスを作成、Pianoという名前のクラスを継承せよ
public class GrandPiano extends Piano {

  //パブリック設定でString型の引数instrumentNameを受け取るplayという名前のメソッドを作成せよ
  public String play(String instrumentName) {

    //引数instrumentNameと"素晴らしい!"を連結した文字列を呼び出し元に返せ
    return super.play(instrumentName) + "素晴らしい!";
  }

  //パブリック設定でString型の引数instrumentNameを受け取るtuneという名前のメソッドを作成せよ
  public String tune(String instrumentName) {

    //引数instrumentNameと"を調律しています!"を連結した文字列を呼び出し元に返せ
    return instrumentName + "を調律しています！";
  }
}
