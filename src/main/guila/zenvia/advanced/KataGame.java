package main.guila.zenvia.advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guila on 04/05/17.
 */
public class KataGame {
  private final List<Matcher> matcherList;

  public KataGame() {
    matcherList = new ArrayList<>();
  }

  public void addMatcher(String label, int div) {
    matcherList.add(new Matcher(label, div));
  }

  public String evaluate(int n) {
    StringBuilder buffer = new StringBuilder();
    for (Matcher matcher : matcherList) {
      if (n % matcher.div == 0) {
        buffer.append(matcher.label);
      }
    }

    String result = buffer.toString();
    if (result.isEmpty()) {
      return Integer.toString(n);
    } else {
      return result;
    }
  }

  private static class Matcher {
    String label;
    int div;

    public Matcher(String label, int div) {
      this.label = label;
      this.div = div;
    }
  }
}