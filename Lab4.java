public class Lab4 {
	public static void main(String args[]) {
		System.out.println(sort(new int[]{23, 42, 12, 54, 3}));
		System.out.println(sort(new int[]{37, 12, 17, 21}));
		System.out.println(sort(new int[]{1, 2}));
		System.out.println(sort(new int[0]));
		System.out.println(sort(new int[]{12, 42, 34, 54, 45}));
	}
	public static int[] sort(int[] s) {
		if (s.length == 0) {
			return new int[]{0};
		}
		for(int i = 0; i<s.length; i++) {
			for(int j = 0; j<s.length; j++) {
				if(s[i] < s[j]) {
					int hold = s[i];
					s[i] = s[j];
					s[j] = hold;
				}
			}

		}
		return s;
	
	}
	}
