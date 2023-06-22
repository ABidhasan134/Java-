#include<iostream>
using namespace std;
int main()
{
    int n;
    int arr[n]={6,5,4,3,2};
    int temp;
    for(int i=0;i<=n/2;i++)
    {
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
    }
    for(int i=0;i<n;i++)
    {

        cout<<arr[i]<<" ";
    }

    return 0;
}