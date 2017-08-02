package swimmypractice5;

public class Main {

	public static void main(String[] args) {


	try {
		//Iphoneのインスタンスを生成
		Smartphone Iphone7 = new Iphone("NaokiPhone");

		//LINE電話メソッドを呼び出し（例外処理発生）
		//Iphone7.tell(6255);

		//CPUをセットするメソッドを呼び出し
		Iphone7.SetCpu("intel");

		//CPUをセットするメソッドを呼び出し（例外処理発生）
		//Iphone7.SetCpu("");

		//RAMとROMをセット
		Iphone7.SetRamRom(4,128);

		//音楽DLメソッドをオーバーライド
		Iphone7.music();

		//LINE電話メソッドを呼び出し
		Iphone7.tell(6255);

		//RAMとROMをセット(例外処理発生)
		//Iphone7.SetRamRom(4, -8);

		//Androidインスタンスを生成
		Smartphone Galaxy = new Android("Android");

		//CPU情報をセット
		Galaxy.SetCpu("intel");

		//RAM/ROMをセット
		Galaxy.SetRamRom(8,250);

		//音楽DLメソッドをオーバーライド
		Galaxy.music();

		//音声通話メソッドを呼び出し
		Galaxy.tell(80, "090-1234-5678");
	}

	catch(IllegalArgumentException error) {
		System.out.println(error);
	}
	}

}
