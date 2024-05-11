#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
 
class Two {
public:
    int index;
    int num;
    Two(int index, int num) : index(index), num(num) {}
};
 
class Sort {
public:
    bool operator()(const Two& t1, const Two& t2) const {
        return t1.num > t2.num; // Reverse comparison for sorting in descending order
    }
};
 
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<Two> list;
        for (int i = 0; i < n; ++i) {
            int num;
            cin >> num;
            list.emplace_back(i, num);
        }
        sort(list.begin(), list.end(), Sort());
        vector<long long> ans(n);
        long long time = 0;
        int position = 1;
        for (int i = 0; i < n; ++i) {
            Two object = list[i];
            int index = object.index;
            long long num = object.num;
            if (position > 0) {
                ans[index] = position;
                position = -position;
            } else {
                ans[index] = position;
                position = -position + 1;
            }
            time += abs(ans[index]) * 2 * num;
        }
        cout << time << endl;
        cout << 0;
        for (int i = 0; i < n; ++i) {
            cout << " " << ans[i];
        }
        cout << endl;
    }
    return 0;
}