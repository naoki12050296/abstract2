package swimmypractice5;

//exceptionを継承
public class CheckException extends Exception{
	public CheckException(String str) {
		super(str);
	}

}

//CheckExceptionを継承した、OS情報未定義の例外処理
class NotOsInfoException extends CheckException{
	public NotOsInfoException() {
		super("入力されたOS情報に誤りがあります");
	}
}

//CheckExceptionを継承した、CPU情報未定義の例外処理
class NotCpuInfoException extends CheckException{
	public NotCpuInfoException() {
		super("入力されたCPU情報に誤りがあります");
	}
}

//CheckExceptionを継承した、RAM情報未定義の例外処理
class NotRamInfoException extends CheckException{
	public NotRamInfoException() {
		super("入力されたRAM情報に誤りがあります");
	}
}

//CheckExceptionを継承した、ROM情報未定義の例外処理
class NotRomInfoException extends CheckException{
	public NotRomInfoException() {
		super("入力されたROM情報に誤りがあります");
	}
}


