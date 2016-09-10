#include<stdio.h>
#include<conio.h>
void main()
{
  char c[30];
  scanf("%s",c);
  if(c=="Monday"||c=="Tuesday"||c=="Wednesday"||c=="Thursday"||c=="Friday"||c=="Saturday")
  {
    return true;
  }
  else
  return false;
}
