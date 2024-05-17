#include <iostream>
#include <vector>
#include <climits>
#include <cmath>
 
using namespace std;
 
class Two {
public:
    long long num1;
    long long num2;
    Two(long long num1, long long num2) : num1(num1), num2(num2) {}
};
 
int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k, a, b;
        cin >> n >> k >> a >> b;
 
        vector<Two> arr;
        for (int i = 0; i < n; ++i) {
            long long num1, num2;
            cin >> num1 >> num2;
            arr.emplace_back(num1, num2);
        }
 
        long long startMinCost = LLONG_MAX;
        long long endMinCost = LLONG_MAX;
        Two startFree(0, 0); // Initialize with default values
        Two endFree(0, 0);   // Initialize with default values
 
        // Cost of direct path from a to b
        long long ans = abs(arr[a-1].num1 - arr[b-1].num1) + abs(arr[a-1].num2 - arr[b-1].num2);
 
        if (k >= 2) {
            startFree = arr[0];
            endFree = arr[k-1];
            for (int i = 0; i < k; ++i) {
                Two temp = arr[i];
                long long startCost = abs(arr[a-1].num1 - temp.num1) + abs(arr[a-1].num2 - temp.num2);
                long long endCost = abs(arr[b-1].num1 - temp.num1) + abs(arr[b-1].num2 - temp.num2);
                if (startCost < startMinCost) {
                    startMinCost = startCost;
                    startFree = temp;
                }
                if (endCost < endMinCost) {
                    endMinCost = endCost;
                    endFree = temp;
                }
            }
            ans = min(ans, startMinCost + endMinCost);
        }
 
        cout << ans << endl;
    }
    return 0;
}