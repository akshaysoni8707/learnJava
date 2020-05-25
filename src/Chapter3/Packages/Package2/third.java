package Chapter3.Packages.Package2;

import Chapter3.Packages.first;

public class third extends first {
    public static void main(String[] args) {
        third t = new third();
        t.b = 10;
        t.methodProtected();
        t.methodPublic();
    }

    // Method is final in first.java so can not override
    //    protected void methodProtected() {
    //
    //    }
}
