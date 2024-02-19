#include <iostream>
#include <unordered_map>
 
using namespace std;
 
int main() {
    int n, q;
    cin >> n >> q;
    unordered_map<int, int> map;
 
    for (int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;
        if (map.find(temp) == map.end()) {
            map[temp] = i + 1;
        }
    }
 
    for (int i = 0; i < q; ++i) {
        int query;
        cin >> query;
        int temp = map[query];
        map.erase(query);
        cout << temp << " ";
        for (auto& entry : map) {
            if (entry.second < temp) {
                entry.second++;
            }
        }
        map[query] = 1;
    }
 
    cout << endl;
    return 0;
}