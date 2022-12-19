#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int t,n;
    cin>>t ;
    for(int k=0;k<t;k++)
    {
        cin>>n ;
        int a[n];
        for(int i=0;i<n;i++)
        {
               cin>>a[i] ;
        }
         sort(a, a + n);
         printf("%d ",a[n-1]);
         printf("%d ",a[n-2]);
         printf("%d\n",a[n-3]);
         
    }

    return 0;
}
