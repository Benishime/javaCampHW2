package InheritanceDemo;

public class Console {

	public static void main(String[] args) {
		OgertmenKrediManager a = new OgertmenKrediManager();
		a.Hesapla();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgertmenKrediManager());
		krediUI.KrediHesapla(new TarmKrediManager());

	}

}
