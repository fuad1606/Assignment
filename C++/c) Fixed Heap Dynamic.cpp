#include <iostream>
using namespace std;

int main() {
    // Fixed heap dynamic array - allocated on heap but size fixed after creation
    int* arr = new int[5];

    cout << "Enter 5 elements:" << endl;
    for(int i = 0; i < 5; i++) {
        cin >> arr[i];
    }

    cout << "Fixed heap dynamic array in C++:" << endl;
    for(int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    delete[] arr; // Manual memory management required
    return 0;
}
