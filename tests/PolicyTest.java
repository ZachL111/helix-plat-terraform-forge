package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(75, 92, 27, 16, 8);
        if (Policy.score(signalcase_1) != 132) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(93, 90, 9, 11, 12);
        if (Policy.score(signalcase_2) != 252) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(72, 99, 21, 10, 4);
        if (Policy.score(signalcase_3) != 161) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
