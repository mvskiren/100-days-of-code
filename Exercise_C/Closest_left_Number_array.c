#include<stdio.h>
int main(){
	int i,arr[40],j,n;
	printf("Enter number of elements: ");
	scanf("%d",&n);
	printf("Enter Elements: ");
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	printf("%c, ",'-');
	for(i=1;i<n;i++)
	{
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]<arr[i]){
				printf("%d,",arr[j]);
					break;
				}
				else if (j==-1){
				printf("%c",'-');
				}
			}
		}

	
return 0;
}
