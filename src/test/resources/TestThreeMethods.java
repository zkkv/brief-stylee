public class TestThreeMethods {
    public int foo() {
        if (true) {
            return 0;
        }
        return 1;
    }

    public int bar() {
        if (true) {
            if (true) {
                if (true) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public int foobar() {
        if (true) {
            if (true) {
                return 0;
            }
        }
        return 1;
    }
}