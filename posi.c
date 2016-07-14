#include<stdio.h>
int main()
{
int n;
scanf("%d",&n);
if(n>=1)
printf("Positive");
else if(n<0)
printf("Negative");
else if(n==0)
printf("zero");
else
printf("not valid");
}
