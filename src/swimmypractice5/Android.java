package swimmypractice5;

public class Android extends Smartphone{

	public Android() {
	}

	public Android(String aName) {
		super(SmartphoneKind.Android,aName);
	}

	public void music() {
		if(this.Kind == null || this.Cpu.length() == 0 || this.Ram == 0 || this.Rom == 0) {
			throw new IllegalArgumentException("OS,CPU,RAM,ROMいずれかに未入力があります");
		}
		System.out.println("Google Play Musicでダウンロードしました");
	}
}