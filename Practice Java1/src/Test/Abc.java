package Test;

interface Abc {
	public abstract void show();

	public abstract void call();
}
class AbcImpl implements Abc{
	public void show() {
		System.out.println("in show");
	}
	public void call() {
		System.out.println("in call");
	}
}
