class LoopNext {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      if (i == 1)
        continue;
      System.out.println((i + 1) + ". Hi");
    }
  }
}
// 1. Hi
// 2. Hi
