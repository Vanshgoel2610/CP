/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class B_Worms {
    public static int binarySearch(ArrayList<Integer> list, int query) {
        int start = 0;
        int end = list.size()-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(list.get(mid) == query) return mid+1;
            else if(list.get(mid) < query) {
                if(list.get(mid+1) > query) return mid+2;
                start = mid+1;
            } else {
                if(mid == 0 || list.get(mid-1) < query) return mid+1;
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int i = -1;
        while(++i < n) {
            sum += sc.nextInt();
            list.add(sum);
        }
        int m = sc.nextInt();
        i = -1;
        while(++i < m) {
            int query = sc.nextInt();
            System.out.println(binarySearch(list, query));
        }
        sc.close();
    }
}

/*  This is C++ code for the problem
 * #include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> list(1, 0); // Initialize with 0
        5
        2 7 3 4 9
        3
        1 25 11
        Approach:- first 1 and 2 are in the first pile and 3 to 9 are in the 2nd pile and soon
        arr[1] = 1, arr[2] = 1, arr[3] = 2 ... arr[9] = 2, arr[10] = 3,.....
    int pile = 1;
    while (n--) {
        int worms;
        cin >> worms;
        for (int i = 0; i < worms; i++)
            list.push_back(pile);
        pile++;
    }
    int m;
    cin >> m;
    while (m--) {
        int index;
        cin >> index;
        cout << list[index] << endl;
    }
    return 0;
}

 */