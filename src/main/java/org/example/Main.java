//このクラスは、org.exampleパッケージに属す
package org.example;

//パブリック設定でMainという名前のクラスを作成せよ
public class Main {

  //パブリック設定かつ静的で、戻り値がなく、String[]型の引数argsを受け取るmainという名前のメソッドを作成せよ
  public static void main(String[] args) {

    //Pianoクラスのインスタンスを新規作成し、Piano型で作成した変数pianoに入れよ
    Piano piano = new Piano();
    Guitar guitar = new Guitar();
    GrandPiano grandPiano = new GrandPiano();

    //変数pianoのplayメソッドを呼び出し、その戻り値をString型で作成した変数messageに入れよ
    String message = piano.play();
    String message2 = guitar.play();
    String message3 = grandPiano.play();

    //Printerクラスのインスタンスを新規作成し、Printer型で作成した変数printerに入れよ
    Printer printer = new Printer();

    //変数printerのprintMessageメソッドを呼び出し、引数に変数messageを渡せ
    printer.printMessage(message);
    printer.printMessage(message2);
    printer.printMessage(message3);

    //変数grandPianoのtuneメソッドを呼び出し、その戻り値をString型で作成した変数tuningMessageに入れよ
    String tuningMessage = grandPiano.tune();

    //変数printerのprintTuningMessageメソッドを呼び出し、引数に変数tuningMessageを渡せ
    printer.printTuningMessage(tuningMessage);
  }
}
