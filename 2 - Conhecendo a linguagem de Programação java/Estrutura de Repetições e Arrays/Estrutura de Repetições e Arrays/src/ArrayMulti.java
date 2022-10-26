import java.util.Random;

public class ArrayMulti {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];
        
        int maior = 0;
        int x = 0, y = 0;
        for (int i = 0; i< M.length; i++) {
			for (int j= 0; j< M[i].length; j++) {
				M[i][j] = random.nextInt(100);
                if(M[i][j] > maior){
                    maior = M[i][j];
                    x = i + 1;
                    y = j + 1;
                }
			}
		}

        System.out.println("Matriz: ");
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println(" ");
		}

        System.out.println("O maior numero foi " + maior + " Na linha " + x + " coluna " + y);

    }
}
