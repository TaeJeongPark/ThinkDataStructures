package recursivecall;

/**
 * packageName    : recursivecall
 * fileName       : Hanoi
 * author         : TaeJeongPark
 * date           : 2023-12-23
 * description    : 하노이 탑 알고리즘
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-23        TaeJeongPark       최초 생성
 */
public class Hanoi {

    public static void main(String[] args) {
        move(3, 1, 3);
    }

    private static void move(int n, int from, int to) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            int other = 6 - from - to;
            move(n - 1, from, other);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            move(n - 1, other, to);
        }
    }

}
