#include <iostream>
using namespace std;

int main() {
    int size;
    cout << "Enter array size: ";
    cin >> size;

    // Stack dynamic array - size determined at runtime
    int arr[size];

    cout << "Enter " << size << " elements:" << endl;
    for(int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    cout << "Stack dynamic array in C++:" << endl;
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
