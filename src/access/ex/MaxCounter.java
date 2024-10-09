package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter() {
    }

    MaxCounter(int max) {
        this.max = max; // 얘만 this 쓰는이유가뭐지..?
    }

    void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    int getCount() {
        return count;
    }
}
