package practice_abstract;

public class CreatureHero implements Creature,Hero{

	public void run() {
		System.out.println("走って逃げる");
	}

	public void eat() {
		System.out.println("むしゃむしゃ食べる");
	}

	public void bite() {
		System.out.println("野獣のように噛み付いた");
	}

	public void scratch() {
		System.out.println("野獣のように引っ掻いた");
	}

	public void talk() {
		System.out.println("軽快に喋った");
	}

	public void cry(){
		System.out.println("豪快に泣いた");
	}

	public void think(){
		System.out.println("じっくり考えた");
	}

}
