package listinterface;

import java.util.LinkedList;
import java.util.List;

/**
 * packageName    : ListInterface
 * fileName       : ListClientExample
 * author         : TaeJeongPark
 * date           : 2023-12-23
 * description    : List Interface 호환성 예제(인터페이스 기반 프로그래밍)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-23        TaeJeongPark       최초 생성
 */
public class ListClientExample {

    private List<Integer> list;

    public ListClientExample() {
        list = new LinkedList<Integer>();
    }

    private List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }

}
