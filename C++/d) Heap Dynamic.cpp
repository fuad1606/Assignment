#include <iostream>
#include <vector>
using namespace std;

int main() {
    int size;
    cout << "Enter array size: ";
    cin >> size;

    // Heap dynamic array using vector - can grow/shrink
    vector<int> arr;

    cout << "Enter " << size << " elements:" << endl;
    for(int i = 0; i < size; i++) {
        int val;
        cin >> val;
        arr.push_back(val);
    }

    cout << "Heap dynamic array in C++:" << endl;
    for(int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    // No manual cleanup needed for vector
    return 0;
}
