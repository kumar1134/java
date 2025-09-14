#include<stdio.h>
int main()

{
  int n;
  printf("%d",fun(5));

}

int fun(int n)
{
if (n<=1)
return 1;
else
  return n*fun(n-1);

}

int fun1(int n){
  if(n<=1)
  return 1;
  else{
    return n*fun1(n-1);
  }
}