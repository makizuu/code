#include <stdio.h>
#include "conversion.h"

int main(){
  double cm, inch;
  printf("How many inches (inch)?");
  if (scanf("%lf", &inch)) {
    cm = inchesToCm(inch);
    printf("%.2lf inch is %.2lf cm\n", inch, cm);
  } else{
    printf("Invalid input. Please input valid floating point numbers. \n");
  }
  return 0;
}
