#include <stdio.h>

int main(void) 
{
	int ar[100],n,i,c=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	scanf("%d",&ar[i]);
	for(i=0;i<n-1;i++)
	{
		if(ar[i]<ar[i+1])
		c++;
	}
	if(c==n-1)
	printf("sorted order");
	else
	printf("Not sorted order");
	return 0;
}
