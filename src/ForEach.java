public class ForEach {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i+=1) {
            tablica[i] = i+1;
        }
        for (int zmienna : tablica) {


        System.out.println(zmienna);
      }
    }
}
