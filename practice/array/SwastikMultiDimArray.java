class SwastikMultiDimArray {
	public static void main(String args[]) {
		float arr[][] =    {
			{1.1f,1.2f,1.3f,1.4f},
			{2.1f,2.2f,2.3f,2.4f},
			{3.1f,3.2f,3.3f,3.4f},
			{4.1f,4.2f,4.3f,4.4f},
			{5.1f,5.2f,5.3f,5.4f},
			{6.1f,6.2f,6.3f,6.4f},
			{7.1f,7.2f,7.3f,7.4f},
			{8.1f,8.2f,8.3f,8.4f}
		};

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " => ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if(j < arr[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}
