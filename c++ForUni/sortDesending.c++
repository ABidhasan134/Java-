#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<=n;i++)
    {
        cin>>arr[i];
    }
    int nOe= sizeof(arr)/ sizeof(arr[0]);
    sort(arr,arr+n,greater<int>());
    for(int i=0;i<nOe;i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}