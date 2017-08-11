package swimmypractice5;

public class Android extends Smartphone{

	//コンストラクタ１
	public Android() {
		System.out.println("名前を入力してください");
		String aName = new java.util.Scanner(System.in).nextLine();
		this.Name = aName;
		this.Kind = SmartphoneKind.Android;
		System.out.println("ようこそ"+Name+"さん");
	}


	//コンストラクタ２
	public Android(String aName) {
		super(SmartphoneKind.Android,aName);
	}

	//音楽DLメソッド（例外チェック込み）
	public void music() throws CheckException{
		this.check();
		System.out.println("Google Play Musicでダウンロードしました");
	}


	}
