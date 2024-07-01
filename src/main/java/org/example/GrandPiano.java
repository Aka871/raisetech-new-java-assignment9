//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でGrandPianoという名前のクラスを作成、Pianoという名前のクラスを継承せよ
public class GrandPiano extends Piano {

  //パブリック設定で変更不可のString型のINSTRUMENT_NAMEという名前のクラス変数を作成し、文字列"グランドピアノ"を入れよ
  public static final String INSTRUMENT_NAME = "グランドピアノ";

  //パブリック設定で戻り値がString型のplayという名前のメソッドを作成せよ
  public String play() {

    //変数INSTRUMENT_NAMEと"を演奏しています!素晴らしい!"を連結した文字列を呼び出し元に返せ
    return INSTRUMENT_NAME + "を演奏しています!素晴らしい！";
  }

  //パブリック設定で戻り値がString型のtuneという名前のメソッドを作成せよ
  public String tune() {

    //変数INSTRUMENT_NAMEと"を調律しています！"を連結した文字列を呼び出し元に返せ
    return INSTRUMENT_NAME + "を調律しています！";
  }
}
