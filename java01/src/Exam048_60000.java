



int a = 1;
int b = 0;
int c = a*b;
while (a++ < 9) {
  while (b++ < 9) {
    System.out.printf("%d * %d =%d\n", a, b, c);
  }

  System.out.println();
   b = 0;
}
}
}
