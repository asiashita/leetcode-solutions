class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& arr) {
    vector<vector<int>> res;
    if (arr.size() == 0) return res;

    sort(arr.begin(), arr.end()); // sort by start time

    res.push_back(arr[0]);

    for (int i = 1; i < arr.size(); i++) {
        if (res.back()[1] >= arr[i][0]) {
            // overlap → merge
            res.back()[1] = max(res.back()[1], arr[i][1]);
        } else {
            // no overlap
            res.push_back(arr[i]);
        }
    }

    return res;
}

};
