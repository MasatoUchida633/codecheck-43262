package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			// String output = String.format("argv[%s]: %s", i, args[i]);
			// System.out.println(output);
			
			String argStr = args[i];
			int argNum;
			
			// 引数が整数かの精査
			try {
				argNum = Integer.parseInt(argStr);
			} catch(NumberFormatException e) {
				System.out.println("invalid");
				continue;
			}
			
			// 引数が非負整数、かつ、1000以下であるかの精査
			if (argNum < 0 || argNum > 1000) {
				System.out.println("invalid");
				continue;
			}
			
			// 引数が3で割り切れるかの精査
			boolean canBeDividedByThree = (argNum%3 == 0) ? true : false;
			
			// 引数に3を含むかの精査
			boolean hasThree = argStr.matches("^.*3.*$");
			
			// 標準出力
			if (canBeDividedByThree && hasThree) {
				System.out.println("dumb");
			} else if (canBeDividedByThree) {
				System.out.println("idiot");
			} else if (hasThree) {
				System.out.println("stupid");
			} else {
				System.out.println("smart");
			}
		}
	}
}
