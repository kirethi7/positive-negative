#include <iostream>

using namespace std;

int main()
{

     int counter, n, fact = 1;


     cout<<"Enter the Number :";
     cin>>n;
     for (int counter = 1; counter <= n; counter++)
     {
         fact = fact * counter;
     }

     cout<<n<<" Factorial Value Is "<<fact; 
   
   return 0;
}
