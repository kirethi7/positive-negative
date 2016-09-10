#include<stdio.h>
#include<conio.h>
void main()
{
  char ch[30];
  scanf("%s",ch);
  if(ch=="Monday"||ch=="Tuesday"||ch=="Wednesday"||ch=="Thursday"||ch=="Friday"||ch=="Saturday")
  {
    return true;
  }
  else
  return false;
}
