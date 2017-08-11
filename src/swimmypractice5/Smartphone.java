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

	//コンストラクタ２
	public Smartphone(SmartphoneKind aKind,String aName) {
		this.Kind = aKind;
		this.Name = aName;
		return;
	}
	//OS情報のgetterメソッド
	public SmartphoneKind getKind() {
		return Kind;
	}
	//OS情報のsetterメソッド
	public void setKind() {
		System.out.println("OSを選択してください");
		System.out.println("0:iOS 1:Android");
		int Kind = new java.util.Scanner(System.in).nextInt();
				if(Kind == 0) {
					this.Kind = SmartphoneKind.iOS;
				}
				else if(Kind == 1) {
					this.Kind = SmartphoneKind.Android;
				}
				else {
					System.out.println("OS情報が不正です");
					setKind();
				}
		System.out.println("OS"+this.Kind+"がセットされました");

	}

	//CPU情報のgetterメソッド
	public String getCpu() {
		return Cpu;
	}
	//CPU情報のsetterメソッド
	public void setCpu() {
		System.out.println("CPUを入力してください");
		String Cpu = new java.util.Scanner(System.in).nextLine();
		this.Cpu = Cpu;
		System.out.println("CPU"+Cpu+"がセットされました");
	}

	//RAM情報のgetterメソッド
	public int getRam() {
		return Ram;
	}
	//RAM情報のsetterメソッド
	public void setRam() {
		System.out.println("RAMを入力してください");
		int Ram = new java.util.Scanner(System.in).nextInt();
		this.Ram = Ram;
		System.out.println("RAM"+Ram+"がセットされました");
	}

	//ROM情報のgetterメソッド
	public int getRom() {
		return Rom;
	}
	//ROM情報のgetterメソッド
	public void setRom() {
		System.out.println("ROMを入力してください");
		int Rom = new java.util.Scanner(System.in).nextInt();
		this.Rom = Rom;
		System.out.println("ROM"+Rom+"がセットされました");
	}

	//音楽DLするメソッド（何もしない）
	public void music() throws CheckException  {
		}


	//音声通話のメソッド（例外チェック込み）
	public void tell(int countrycode,String phonenumber) throws CheckException{
		this.check();
		System.out.println(phonenumber + "の電話を呼び出しています");
		}


	//LINE電話のメソッド（例外チェック込み）
	public void tell(int lineid) throws CheckException{
		this.check();
		System.out.println(lineid + "のLINEを呼び出します");
		}

	//OS.CPU.RAM.ROMの中身のcheckして、独自例外に投げるメソッド
	public void check() throws CheckException{
		if(Kind == null) {
			throw new NotOsInfoException();
		}
		else if(Cpu == null || Cpu.isEmpty()) {
			throw new NotCpuInfoException();
		}
		else if(Ram == 0) {
			throw new NotRamInfoException();
		}
		else if(Rom == 0) {
			throw new NotRomInfoException();
		}
	}
	}

