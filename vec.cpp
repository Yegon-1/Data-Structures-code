#include <iostream>
#include <vector>

using namespace std;

void printVector(vector<int> v) {
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;
}

int main()
{
    vector<int> temps(7);
    temps[0] = 11;
    temps[1] = 34;
    temps[2] = 28;
    temps[3] = 30;
    temps[4] = 41;
    temps[5] = 15;
    temps[6] = 26;

    temps.push_back(98);
    printVector(temps);

    temps.pop_back();
    printVector(temps);
    
    temps.pop_back();
    printVector(temps);
    
    return 0;
}
