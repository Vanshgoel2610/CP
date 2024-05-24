#include <iostream>
#include <vector>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    while(t--) {
        int n, k;
        cin >> n >> k;
 
        vector<vector<int>> rotate(n, vector<int>(n));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                cin >> rotate[i][j];
            }
        }
 
        bool finish = false;
        for(int i = 0; i < n/2; i++) {
            for(int j = 0; j < n; j++) {
                int temp1 = rotate[i][j];
                int temp2 = rotate[n-i-1][n-j-1];
                if(temp1 != temp2) {
                    if(k > 0) k--;
                    else {
                        finish = true;
                        break;
                    }
                }
            }
            if(finish) break;
        }
 
        if((n % 2) == 1 && !finish) {
            for(int i = 0; i < n/2; i++) {
                int temp1 = rotate[n/2][i];
                int temp2 = rotate[n/2][n-i-1];
                if(temp1 != temp2) {
                    if(k > 0) k--;
                    else {
                        finish = true;
                        break;
                    }
                }
            }
        }
 
        if(finish) cout << "NO" << endl;
        else if((n % 2) == 1) cout << "YES" << endl;
        else if((k % 2) == 1) cout << "NO" << endl;
        else cout << "YES" << endl;
    }
 
    return 0;
}