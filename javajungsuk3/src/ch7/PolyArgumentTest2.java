package ch7;

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer1 {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��" + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();

		b.buy(new Tvv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();

	}
}