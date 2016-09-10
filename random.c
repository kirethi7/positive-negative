#include<stdio.h>
int main()
{
	int a[100],b[100];
	int i,j=0,k,n,m;
	scanf("%d",&n);
  if(n>0)
  {
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
  }
	scanf("%d",&m);
  if(n>0 && m>0)
  {
	for(i=0;i<m;i++)
	{
		scanf("%d",&b[i]);
		for(k=0;k<n;k++)
		{
			if(a[k] == b[i])
			{
				printf("%d ",a[k]);
				j=1;
				break;
			}
		}
	}
	if(j == 0)
		printf("-1");
  }
	return 0;
}
