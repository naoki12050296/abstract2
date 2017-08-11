package swimmypractice5;


public class Iphone extends Smartphone{

	//コンストラクタ１
	public Iphone() {
		System.out.println("名前を入力してください");
		String aName = new java.util.Scanner(System.in).nextLine();
		this.Name = aName;
		this.Kind = SmartphoneKind.iOS;
		System.out.println("ようこそ"+Name+"さん");

	}

	//コンストラクタ２
	public Iphone(String aName) {
		super(SmartphoneKind.iOS,aName);
	}

	//音楽DLメソッド（例外チェック込み）
	public void music() throws CheckException {
		this.check();
		System.out.println("Itunesでダウンロードしました");
	}
}
