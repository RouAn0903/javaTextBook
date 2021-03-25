package Ch12;

interface TimesUp {
  void notifyMe(int i); // 通i秒時間已到
}

class Timer { // 虛擬的碼表
  static void startTimer(int seconds,TimesUp obj) throws Exception {
    // 開始計時
    	  Thread.sleep(seconds *1000);	
    	  obj.notifyMe(seconds); // 通知碼表使用者
    
  }
}

class watchUser implements TimesUp {
  public void notifyMe(int i) {
     System.out.println("haha "+i + "秒時間到");
  }
}

public class Stopwatch {

  public static void main(String[] argv) throws Exception {
    watchUser w = new watchUser();
    Timer.startTimer(5,w);
  }
}
