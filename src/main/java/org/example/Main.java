//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でMainという名前のクラスを作成せよ
public class Main {

  //パブリック設定かつ静的で、戻り値がなく、String[]型の引数argsを受け取るmainという名前のメソッドを作成せよ
  public static void main(String[] args) {

    //Pianoクラスのインスタンスを新規作成し、Piano型で作成した変数pianoに入れよ
    Piano piano = new Piano();
    Guitar guitar = new Guitar();

    //変数pianoのplayメソッドを呼び出し、引数に"ピアノ"を渡し、その戻り値をString型で作成した変数messageに入れよ
    String message = piano.play("ピアノ");
    String message2 = guitar.play("ギター");

    //Printerクラスのインスタンスを新規作成し、Printer型で作成した変数printerに入れよ
    Printer printer = new Printer();

    //変数printerのprintMessageメソッドを呼び出し、引数に変数messageを渡せ
    printer.printMessage(message);
    printer.printMessage(message2);
  }
}
