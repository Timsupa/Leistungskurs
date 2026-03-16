package blatt19;

    public class QuickSot {

        public static int[] quickSort(int[] liste) {

            if (liste.length <= 1) {
                return liste;
            }

            int pivot = liste[0];

            int kleinerCount = 0;
            for (int i = 1; i < liste.length; i++) {
                if (liste[i] < pivot) {
                    kleinerCount++;
                }
            }

            int[] kleiner = new int[kleinerCount];
            int[] groesser = new int[liste.length - kleinerCount - 1];

            int k = 0;
            int g = 0;

            for (int i = 1; i < liste.length; i++) {
                if (liste[i] < pivot) {
                    kleiner[k++] = liste[i];
                } else {
                    groesser[g++] = liste[i];
                }
            }

            kleiner = quickSort(kleiner);
            groesser = quickSort(groesser);

            int[] neu = new int[liste.length];

            System.arraycopy(kleiner, 0, neu, 0, kleiner.length);
            neu[kleiner.length] = pivot;
            System.arraycopy(groesser, 0, neu, kleiner.length + 1, groesser.length);

            return neu;
        }

        public static void main(String[] args) {

            int[] bob = {2,65,25,74,21,673,35};

            int[] sortiert = quickSort(bob);

            for (int x : sortiert) {
                System.out.print(x + " ");
            }
        }
    }

