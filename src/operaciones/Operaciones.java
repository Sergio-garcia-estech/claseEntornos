package operaciones;

public class Operaciones {
    public static int potencia(int base, int exp){
        int res = 1;
        int cont = 0;

        while(cont < exp){
            res = res * base;
            cont++;
        }
        return res;
    }

}
