#include<iostream>
using namespace std;

int sum(int a, int b);

int main(){
        int res;
        int a = 15;
        int b = 20;
        res = sum(a, b);
        cout << "Sum is " << res << endl;
        return 0;
}


int sum (int a, int b){
        int res;
        res = a + b;
        return (res);

}