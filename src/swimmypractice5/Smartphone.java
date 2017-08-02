package swimmypractice5;

public class Smartphone {

	//OS情報を定義
	public static enum SmartphoneKind{iOS , Android};

	//派生クラスで使用可能な属性を定義
	protected SmartphoneKind Kind;
	protected String Name;
	protected String Cpu;
	protected int Ram;
	protected int Rom;

	//コンストラクタ１
	public Smartphone() {

	}

	//コンストラクタ２（OS情報をセットする）
	public Smartphone(SmartphoneKind aKind,String aName) {
		this.Kind = aKind;
		this.Name = aName;

		//OS種別を出力
		if(this.Kind == SmartphoneKind.iOS) {
			System.out.println("種別はiOSです");
		}else if(this.Kind == SmartphoneKind.Android) {
			System.out.println("種別はAndroidです");
		}
	}

	//CPU情報をセットするメソッド
	public void SetCpu(String aCpu) {
		if(aCpu.length() == 0) {
			throw new IllegalArgumentException("CPUがセットされていません");
		}
		this.Cpu = aCpu;
		System.out.println("CPUは"+this.Cpu+"です");
	}

	//RAM情報&ROM容量をセットするメソッド
	public void SetRamRom(int aRam,int aRom) {
		if(aRam <= 0 || aRam >= 1000 || aRom <= 0 || aRom >= 1000) {
			throw new IllegalArgumentException("RAMかROMの値が不正です");
		}
		this.Ram = aRam;
		this.Rom = aRom;
		System.out.println("この端末のRAMは"+this.Ram+"、ROMは"+this.Rom+"です");

	}

	//音楽DLするメソッド（何もしない）
	public void music() {
		}

	//音声通話のメソッド
	public void tell(int countrycode,String phonenumber) {
		if(this.Kind == null || this.Cpu.length() == 0 || this.Ram <= 0 || this.Rom <= 0) {
			throw new IllegalArgumentException("OS,CPU,RAM,ROMいずれかに未入力があります");
		}
		System.out.println(phonenumber + "の電話を呼び出しています");
		}

	//LINE電話のメソッド
	public void tell(int lineid) {
		if(this.Kind == null || this.Cpu.length() == 0 || this.Ram <= 0 || this.Rom <= 0) {
			throw new IllegalArgumentException("OS,CPU,RAM,ROMいずれかに未入力があります");
		}
		System.out.println(lineid + "のLINEを呼び出します");
		}
}
