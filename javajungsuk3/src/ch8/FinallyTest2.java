package ch8;

class FinallyTest2 {
	public static void main(String[] args) {
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); // ���ϵ��� �����Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}

	static void startInstall() {
		// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}

	static void copyFiles() {
		// ���ϵ��� �����ϴ� �ڵ带 ���´�.
	}

	static void deleteTempFiles() {
		// �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}

}
