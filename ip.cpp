#include <iostream>
#include<string.h>
using namespace std;
int main() {
	int testcase;
	cin>>testcase;
	while(testcase--){
	   char str[100];
	   cin>>str;
	   for(int i=0;i<strlen(str);i++){
	   	if(str[i]!='.'){
	   		cout<<str[i];
	   	}
	   }cout<<endl;
	}
	return 0;
}
