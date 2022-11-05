public class Main {
    public static void main(String[] args) {
        System.out.println("Программа, показывающая последовательность действий для игры “Ханойская башня”");

            int nDisks = 3;
            doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int n, char point1, char point2, char temp) {
        if (n == 1){
            System.out.printf("Диск 1 от %c к %c\n", point1, temp);
        }else {
            doTowers(n - 1, point1, temp, point2);
            System.out.printf("Диск %d от %c к %c\n", n, point1, temp);
            doTowers(n - 1, point2, point1, temp);
        }
    }
}
