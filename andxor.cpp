#include <iostream>
#include <string>
using namespace std;
int main(){
    string x = "Yellow_Supermacy";
    string ma;
    string mx;
    for(char c:x){
        ma += c & 127;
        mx += c ^127;
    }
    cout<<x<<endl;
    cout<<ma<<endl;
    cout<<mx<<endl;
    return 0;
}
