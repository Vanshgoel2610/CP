#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
 
using namespace std;
 
int main() {
    int n, d;
    cin >> n >> d;
    vector<float> list;
    float num;
    for (int i = 0; i < n; ++i) {
        cin >> num;
        list.push_back(num);
    }
    sort(list.begin(), list.end());
 
    int count = 0;
    while (!list.empty()) {
        int temp = ceil(d / list.back());
        if (d % static_cast<int>(list.back()) == 0) {
            temp++;
        }
        if (temp > static_cast<int>(list.size())) {
            break;
        }
        list.pop_back();
        for (int i = 1; i < temp; i++) {
            list.erase(list.begin());
        }
        count++;
    }
    cout << count << endl;
    return 0;
}