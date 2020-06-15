class AssmtFC13 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = 10; i <= 99; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count++;
				}
			}
			if (count == 2) {
				
				System.out.println(i+" ");
			}
		}
	}
}
