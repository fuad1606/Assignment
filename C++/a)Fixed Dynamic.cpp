#include <iostream>
using namespace std;

int main() {
    // Fixed dynamic array - size known at compile time
    int arr[5] = {1, 2, 3, 4, 5};

    cout << "Fixed dynamic array in C++:" << endl;
    for(int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
