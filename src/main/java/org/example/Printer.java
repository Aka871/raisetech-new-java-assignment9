//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でPrinterという名前のクラスを作成せよ
public class Printer {

  //パブリック設定かつ静的で、戻り値がなく、String型の引数messageを受け取るprintMessageという名前のメソッドを作成せよ
  public void printMessage(String message) {

    //引数messageを表示せよ
    System.out.println(message);
  }

  //パブリック設定かつ静的で、戻り値がなく、String型の引数tuningMessageを受け取るprintTuningMessageという名前のメソッドを作成せよ
  public void printTuningMessage(String tuningMessage) {

    //引数tuningMessageを表示せよ
    System.out.println(tuningMessage);
  }
}
