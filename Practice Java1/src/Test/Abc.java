package Test;

interface Abc {
	public abstract void show();
}
class AbcImpl implements Abc{
	public void show() {
		System.out.println("in show");
	}
}
