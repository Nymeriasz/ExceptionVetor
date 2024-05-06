package ExExeption2;
public class ExceptionVetor {
    public static void main(String[] args) {
        int vetor[] = new int[2];

        try {
            vetor[0] = 0;
            vetor[1] = 1;
            vetor[2] = 2;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
